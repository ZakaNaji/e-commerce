package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);
    List<Category> findAllCategories();

    Category updateCategory(Category category);

    void deleteCategory(Long categoryId);
}
