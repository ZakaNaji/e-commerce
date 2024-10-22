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
    private String description;
    private String image;
    private int quantity;
    private double price;
    private double discount;
    /*give me a json object with the following structure:
    {
        "productId": 1,
        "productName": "product name",
        "description": "product description",
        "image": "product image",
        "quantity": 1,
        "price": 1.0,
        "discount": 1.0
    }
    */
}
