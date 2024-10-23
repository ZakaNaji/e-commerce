package com.znaji.ecommerce_app.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private Long productId;
    @Size(min = 3, max = 100, message = "Product name must be between 3 and 100 characters")
    private String productName;
    @Size(min = 6, max = 200, message = "Description must be between 6 and 200 characters")
    private String description;
    private String image;
    private int quantity;
    private double price;
    private double discount;
    private double specialPrice;
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
