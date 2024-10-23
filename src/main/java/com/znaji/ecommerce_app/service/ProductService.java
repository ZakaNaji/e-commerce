package com.znaji.ecommerce_app.service;

import com.znaji.ecommerce_app.dto.ProductDTO;
import com.znaji.ecommerce_app.dto.ProductResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ProductService {

    ProductDTO addProduct(Long categoryId, ProductDTO productDTO);

    ProductResponse getAllProducts(int page, int size, String sortBy);

    ProductResponse getProductsByCategory(Long categoryId, int page, int size, String sortBy);

    ProductResponse getProductsByKeyword(String keyword, int page, int size, String sortBy);

    ProductDTO updateProduct(Long productId, ProductDTO productDTO);

    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
