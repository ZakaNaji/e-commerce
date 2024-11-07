package com.znaji.ecommerce_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String description;
    private String image;
    private int quantity;
    private double price;
    private double discount;
    private double specialPrice;


    @PrePersist
    @PreUpdate
    public void calculateSpecialPrice() {
        this.specialPrice = this.price - (this.price * this.discount / 100);
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItem;

    /*give me sql script for this entity
    CREATE TABLE product (
        product_id BIGINT PRIMARY KEY AUTO_INCREMENT,
        product_name VARCHAR(255) NOT NULL,
        description TEXT,
        image VARCHAR(255),
        quantity INT NOT NULL,
        price DOUBLE NOT NULL,
        discount DOUBLE NOT NULL,
        special_price DOUBLE NOT NULL,
        category_id BIGINT,
        FOREIGN KEY (category_id) REFERENCES category(category_id)
    );
    */


}
