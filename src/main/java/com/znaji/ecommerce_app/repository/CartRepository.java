package com.znaji.ecommerce_app.repository;

import com.znaji.ecommerce_app.entity.Cart;
import com.znaji.ecommerce_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("SELECT c FROM Cart c WHERE c.user.username = ?1")
    Optional<Cart> findByUsername(String username);
}
