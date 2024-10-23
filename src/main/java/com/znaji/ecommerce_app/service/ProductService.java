package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.dto.ProductResponse;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.entity.Product;
import com.znaji.ecommerce_app.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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

    private ProductResponse getProductResponse(List<Product> products) {
        final List<ProductDTO> productDTOS = products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .toList();
        return new ProductResponse(productDTOS);
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

    public ProductResponse getAllProducts() {
        final List<Product> products = productRepository.findAll();
        return getProductResponse(products);
    }

    public ProductResponse getProductsByCategory(Long categoryId) {
        final Category category = categoryService.findCategoryById(categoryId);

        return getProductResponse(productRepository.findByCategoryCategoryId(category.getCategoryId()));
    }

    public ProductResponse getProductsByKeyword(String keyword) {
        final List<Product> products = productRepository.findByProductNameLikeIgnoreCase("%" + keyword + "%");
        return getProductResponse(products);
    }

    public ProductDTO updateProduct(Long productId, ProductDTO productDTO) {
        final Product productDB = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        final Product product = modelMapper.map(productDTO, Product.class);
        product.setProductId(productId);
        product.setCategory(productDB.getCategory());
        final Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);
    }
}
