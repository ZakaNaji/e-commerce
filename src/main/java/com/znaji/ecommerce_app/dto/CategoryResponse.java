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
    List<CategoryDTO> content;

    public void addCategory(CategoryDTO category) {
        content.add(category);
    }
}
