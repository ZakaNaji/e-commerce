package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.entity.Product;
import com.znaji.ecommerce_app.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public ProductService(ProductRepository productRepository, CategoryService categoryService, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    public ProductDTO addProduct(Long categoryId, ProductDTO productDTO) {
        Category category = categoryService.findCategoryById(categoryId);

        final Product product = modelMapper.map(productDTO, Product.class);
        product.setCategory(category);
        product.setSpecialPrice(getSpecialPrice(product));
        final Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);

    }

    private static double getSpecialPrice(Product product) {
        return product.getPrice() - (product.getPrice() * product.getDiscount() / 100);
    }
}
