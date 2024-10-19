package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.repository.CategoryRepository;
import com.znaji.ecommerce_app.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category category) {
        Category dbCat = categoryRepository.findById(category.getCategoryId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        dbCat.setCategoryName(category.getCategoryName());
        return categoryRepository.save(dbCat);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        Category dbCat = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        categoryRepository.delete(dbCat);
    }
}
