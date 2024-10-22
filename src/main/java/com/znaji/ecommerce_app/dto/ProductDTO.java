package com.znaji.ecommerce_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private Long productId;
    private String productName;
    private String image;
    private int quantity;
    private double price;
    private double specialPrice;
    private double discount;
}
