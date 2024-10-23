package com.znaji.ecommerce_app.controller;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.dto.ProductResponse;
import com.znaji.ecommerce_app.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> addProduct(@PathVariable Long categoryId,
                                                 @RequestBody ProductDTO productDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(categoryId, productDTO));
    }

    @GetMapping("/public/products")
    public ResponseEntity<ProductResponse> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/public/categories/{categoryId}/products")
    public ResponseEntity<ProductResponse> getProductsByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(productService.getProductsByCategory(categoryId));
    }

    @GetMapping("/public/products/keyword/{keyword}")
    public ResponseEntity<ProductResponse> getProductsByKeyword(@PathVariable String keyword) {
        return ResponseEntity.ok(productService.getProductsByKeyword(keyword));
    }

    @PutMapping("/admin/products/{productId}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long productId,
                                                    @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.updateProduct(productId, productDTO));
    }

    @DeleteMapping("/admin/products/{productId}")
    public ResponseEntity<ProductDTO> deleteProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.deleteProduct(productId));
    }
}
