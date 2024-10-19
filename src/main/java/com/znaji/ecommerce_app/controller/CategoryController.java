package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/public/categories")
    public List<Category> getCategories() {
        return categoryService.findAllCategories();
    }

    @PostMapping("/public/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    //give me json example
    // {
    //     "categoryId": 1,
    //     "categoryName": "Electronics"
    // }
    // {
    //     "categoryId": 2,
    //     "categoryName": "Books"
    // }
    // {
    //     "categoryId": 3,
    //     "categoryName": "Clothes"
    // }
    // {
    //     "categoryId": 4,
    //     "categoryName": "Furniture"
    // }
}
