package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final List<Category> categories = new ArrayList<>();
    @Override
    public Category createCategory(Category category) {
        categories.add(category);
        return category;
    }

    @Override
    public List<Category> findAllCategories() {
        return categories;
    }
}
