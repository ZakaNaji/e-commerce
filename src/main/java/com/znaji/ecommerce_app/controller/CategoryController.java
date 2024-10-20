package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.dto.CategoryResponse;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponse getCategories(@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber,
                                          @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
        return categoryService.findAllCategories(pageNumber, pageSize);
    }

    @PostMapping("/public/categories")
    public ResponseEntity<Category> addCategory(@Valid @RequestBody Category category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.createCategory(category));
    }

    @PutMapping("/public/categories/{categoryId}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long categoryId, @RequestBody Category category) {
        category.setCategoryId(categoryId);
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategory(category));
    }

    @DeleteMapping("/public/categories/{categoryId}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
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
