package com.znaji.ecommerce_app.repository;

import com.znaji.ecommerce_app.entity.Cart;
import com.znaji.ecommerce_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);
}
