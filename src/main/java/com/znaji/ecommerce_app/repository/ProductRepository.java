package com.znaji.ecommerce_app.repository;

import com.znaji.ecommerce_app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryCategoryId(Long categoryId);

    List<Product> findByProductNameLikeIgnoreCase(String keyword);
}
