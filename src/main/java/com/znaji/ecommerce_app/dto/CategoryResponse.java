package com.znaji.ecommerce_app.dto;


import com.znaji.ecommerce_app.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryResponse {
    private List<CategoryDTO> content;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalElements;
    private boolean lastPage;

    public CategoryResponse(List<CategoryDTO> content) {
        this.content = content;
    }
}
