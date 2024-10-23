package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.dto.ProductResponse;
import com.znaji.ecommerce_app.entity.Category;
import com.znaji.ecommerce_app.entity.Product;
import com.znaji.ecommerce_app.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
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
        final Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);

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

    public ProductDTO deleteProduct(Long productId) {
        final Product productDb = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        productRepository.deleteById(productId);
        return modelMapper.map(productDb, ProductDTO.class);
    }

    public ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException {
        final Product productDb = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        final String fileName = uploadImage(image);
        productDb.setImage(fileName);
        productRepository.save(productDb);
        return modelMapper.map(productDb, ProductDTO.class);
    }

    private static String uploadImage(MultipartFile image) throws IOException {
        final String fileName = StringUtils.cleanPath(image.getOriginalFilename());
        final File folder = new File("src/main/resources/static/images");
        if (!folder.exists()) {
            folder.mkdirs();
        }
        final Path path = Path.of(folder.getPath() +File.separator +  fileName);
        Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        return fileName;
    }
}
