package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.dto.CartDTO;
import com.znaji.ecommerce_app.entity.Cart;
import com.znaji.ecommerce_app.entity.CartItem;
import com.znaji.ecommerce_app.entity.Product;
import com.znaji.ecommerce_app.repository.CartItemRepository;
import com.znaji.ecommerce_app.repository.CartRepository;
import com.znaji.ecommerce_app.repository.ProductRepository;
import com.znaji.ecommerce_app.repository.UserRepository;
import com.znaji.ecommerce_app.service.CartService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final CartItemRepository cartItemRepository;
    private final ModelMapper modelMapper;

    public CartServiceImpl(CartRepository cartRepository, UserRepository userRepository, ProductRepository productRepository, CartItemRepository cartItemRepository, ModelMapper modelMapper) {
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.cartItemRepository = cartItemRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Cart findCartByUsername(String name) {
        return null;
    }

    @Override
    public CartDTO addProductToCart(Long productId, int quantity, String username) {
        final Cart cart = findOrCreateCart(username);
        final Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        final CartItem cartItem = cartItemRepository.findByCartAndProduct(cart.getCartId(), product.getProductId());
        if (cartItem != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product already in cart");
        }
        if (quantity <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Quantity must be greater than 0");
        }
        if (product.getQuantity() < quantity) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not enough product in stock");
        }

        final CartItem newCartItem = new CartItem();
        newCartItem.setCart(cart);
        newCartItem.setProduct(product);
        newCartItem.setQuantity(quantity);
        newCartItem.setProductPrice(product.getPrice());
        newCartItem.setDiscount(product.getDiscount());

        cart.getCartItems().add(newCartItem);

        cartRepository.save(cart);

        return modelMapper.map(cart, CartDTO.class);
    }

    private Cart findOrCreateCart(String username) {
        return cartRepository.findByUsername(username)
                .orElse(createNewCart(username));
    }

    private Cart createNewCart(String username) {
        final Cart cart = new Cart();
        cart.setUser(userRepository.findUserByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")));
        return cartRepository.save(cart);
    }
}
