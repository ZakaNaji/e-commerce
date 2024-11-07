package com.znaji.ecommerce_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDTO {
    private Long cartItemId;
    private double discount;
    private double productPrice;
    private int quantity;
    private ProductDTO product;
    private CartDTO cart;
}
