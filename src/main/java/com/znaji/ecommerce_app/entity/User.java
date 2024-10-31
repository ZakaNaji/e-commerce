package com.znaji.ecommerce_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username")
    @NotBlank
    private String username;
    private String password;
    @Column(name = "email")
    @NotBlank
    @Email
    private String email;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    Set<Role> roles;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_addresses",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    List<Address> addresses;

    @OneToMany(mappedBy = "seller",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            orphanRemoval = true)
    Set<Product> products;
    /*pls give me sql to add to scmea.sql for user and role entities
    create table users (
    user_id bigint primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null
    );
    create table roles (
    role_id bigint primary key auto_increment,
    role_name varchar(255) not null
    );
    create table user_roles (
    user_id bigint,
    role_id bigint,
    primary key (user_id, role_id),
    foreign key (user_id) references users (user_id),
    foreign key (role_id) references roles (role_id)
    );

     */
    /*pls create sql to add to data.sql with 3 users and 3 roles admin, user, seller
    insert into users (username, password, email) values ('admin', '1234', 'admin@gmail.com');
    insert into users (username, password, email) values ('user', '1234', 'user@gmail.com');
    insert into users (username, password, email) values ('seller', '1234', 'seller@gmail.com');
    insert into roles (role_name) values ('ROLE_ADMIN');
    insert into roles (role_name) values ('ROLE_USER');
    insert into roles (role_name) values ('ROLE_SELLER');
    insert into user_roles (user_id, role_id) values (1, 1);
    insert into user_roles (user_id, role_id) values (2, 2);
    insert into user_roles (user_id, role_id) values (3, 3);

     */
}
