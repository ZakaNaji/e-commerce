package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private final List<Category> categories = new ArrayList<>();

    @GetMapping("/public/categories")
    public List<Category> getCategories() {
        return categories;
    }

    @PostMapping("/public/categories")
    public Category addCategory(@RequestBody Category category) {
        categories.add(category);
        return category;
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
