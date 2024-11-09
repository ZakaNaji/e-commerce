package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.dto.CartDTO;
import com.znaji.ecommerce_app.entity.Cart;
import com.znaji.ecommerce_app.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/carts/products/{productId}/quantity/{quantity}")
    public ResponseEntity<CartDTO> addProductToCart(@PathVariable Long productId,
                                                    @PathVariable int quantity,
                                                    Principal principal) {

        final CartDTO cart = cartService.addProductToCart(productId, quantity, principal.getName());
        return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }
}
