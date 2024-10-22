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
    /*give me a json example of this class(Phone):
    {
        "productId": 1,
        "productName": "Samsung Galaxy S21",
        "description": "Samsung Galaxy S21 5G",
        "image": "samsung-galaxy-s21.jpg",
        "quantity": 100,
        "price": 999.99,
        "discount": 10
    }
    */
}
