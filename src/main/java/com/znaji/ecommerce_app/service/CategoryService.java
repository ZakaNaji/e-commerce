package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.CategoryResponse;
import com.znaji.ecommerce_app.entity.Category;

public interface CategoryService {
    Category createCategory(Category category);
    CategoryResponse findAllCategories(int pageNumber, int pageSize);

    Category updateCategory(Category category);

    void deleteCategory(Long categoryId);
}
