package com.znaji.ecommerce_app.service.impl;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.dto.ProductResponse;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.entity.Product;
import com.znaji.ecommerce_app.repository.ProductRepository;
import com.znaji.ecommerce_app.service.CategoryService;
import com.znaji.ecommerce_app.service.FileService;
import com.znaji.ecommerce_app.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final FileService fileService;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService, FileService fileService, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.fileService = fileService;
        this.modelMapper = modelMapper;
    }

    private ProductResponse getProductResponse(List<Product> products) {
        final List<ProductDTO> productDTOS = products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .toList();
        return new ProductResponse(productDTOS);
    }

    @Override
    public ProductDTO addProduct(Long categoryId, ProductDTO productDTO) {
        Category category = categoryService.findCategoryById(categoryId);

        final Product product = modelMapper.map(productDTO, Product.class);
        product.setCategory(category);
        product.setProductId(null);
        final Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);

    }

    @Override
    public ProductResponse getAllProducts() {
        final List<Product> products = productRepository.findAll();
        return getProductResponse(products);
    }

    @Override
    public ProductResponse getProductsByCategory(Long categoryId) {
        final Category category = categoryService.findCategoryById(categoryId);

        return getProductResponse(productRepository.findByCategoryCategoryId(category.getCategoryId()));
    }

    @Override
    public ProductResponse getProductsByKeyword(String keyword) {
        final List<Product> products = productRepository.findByProductNameLikeIgnoreCase("%" + keyword + "%");
        return getProductResponse(products);
    }

    @Override
    public ProductDTO updateProduct(Long productId, ProductDTO productDTO) {
        final Product productDB = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        final Product product = modelMapper.map(productDTO, Product.class);
        product.setProductId(productId);
        product.setCategory(productDB.getCategory());
        final Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);
    }

    @Override
    public ProductDTO deleteProduct(Long productId) {
        final Product productDb = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        productRepository.deleteById(productId);
        return modelMapper.map(productDb, ProductDTO.class);
    }

    @Override
    public ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException {
        final Product productDb = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        final String fileName = fileService.uploadImage(image);
        productDb.setImage(fileName);
        productRepository.save(productDb);
        return modelMapper.map(productDb, ProductDTO.class);
    }

}
