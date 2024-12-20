package com.znaji.ecommerce_app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    private String buildingName;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String street;

    @ManyToMany(mappedBy = "addresses")
    private List<User> user;
}
