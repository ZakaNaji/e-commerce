package com.znaji.ecommerce_app.repository;

import com.znaji.ecommerce_app.entity.Cart;
import com.znaji.ecommerce_app.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartAndProduct(Long cartId, Long productId);
}
