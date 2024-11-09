package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.CartDTO;
import com.znaji.ecommerce_app.entity.Cart;
import org.springframework.stereotype.Service;


public interface CartService {
    Cart findCartByUsername(String name);

    CartDTO addProductToCart(Long productId, int quantity, String name);
}
