package com.znaji.ecommerce_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {

    private List<ProductDTO> content;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalElements;
    private boolean lastPage;

    public ProductResponse(List<ProductDTO> content) {
        this.content = content;
    }
}
