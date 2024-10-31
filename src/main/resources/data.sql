INSERT INTO categories (category_name) VALUES ('Mens T-Shirts');
INSERT INTO categories (category_name) VALUES ('Smartphones');
INSERT INTO categories (category_name) VALUES ('Apparel');
INSERT INTO categories (category_name) VALUES ('Home Appliances');
INSERT INTO categories (category_name) VALUES ('Toys');
INSERT INTO categories (category_name) VALUES ('Furniture');
INSERT INTO categories (category_name) VALUES ('Books');
INSERT INTO categories (category_name) VALUES ('Sports Equipment');
INSERT INTO categories (category_name) VALUES ('Beauty Products');
INSERT INTO categories (category_name) VALUES ('Automotive');
INSERT INTO categories (category_name) VALUES ('Outdoor Gear');
INSERT INTO categories (category_name) VALUES ('Electronics');
INSERT INTO categories (category_name) VALUES ('Kitchen Appliances');
INSERT INTO categories (category_name) VALUES ('Baby Products');
INSERT INTO categories (category_name) VALUES ('Health & Fitness');
INSERT INTO categories (category_name) VALUES ('Garden & Outdoor');
INSERT INTO categories (category_name) VALUES ('Pet Supplies');
INSERT INTO categories (category_name) VALUES ('Office Supplies');
INSERT INTO categories (category_name) VALUES ('Jewelry & Watches');
INSERT INTO categories (category_name) VALUES ('Travel & Luggage');
INSERT INTO categories (category_name) VALUES ('Musical Instruments');
INSERT INTO categories (category_name) VALUES ('Crafts & Hobbies');
INSERT INTO categories (category_name) VALUES ('Collectibles & Memorabilia');
INSERT INTO categories (category_name) VALUES ('Art & Decor');
INSERT INTO categories (category_name) VALUES ('Food & Beverages');
INSERT INTO categories (category_name) VALUES ('Stationery & Gift Wrapping');
INSERT INTO categories (category_name) VALUES ('Electrical & Lighting');
INSERT INTO categories (category_name) VALUES ('DIY & Tools');
INSERT INTO categories (category_name) VALUES ('Party Supplies');
INSERT INTO categories (category_name) VALUES ('Educational Toys');
/* 30 rows of products: */

INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Mens T-Shirt', 'Mens T-Shirt', 'https://www.example.com/mens-t-shirt.jpg', 100, 20.0, 0.0, 20.0, 1);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Smartphone', 'Smartphone', 'https://www.example.com/smartphone.jpg', 100, 200.0, 0.0, 200.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Apparel', 'Apparel', 'https://www.example.com/apparel.jpg', 100, 50.0, 0.0, 50.0, 3);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Home Appliance', 'Home Appliance', 'https://www.example.com/home-appliance.jpg', 100, 500.0, 0.0, 500.0, 4);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Toy', 'Toy', 'https://www.example.com/toy.jpg', 100, 10.0, 0.0, 10.0, 5);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Furniture', 'Furniture', 'https://www.example.com/furniture.jpg', 100, 1000.0, 0.0, 1000.0, 6);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Book', 'Book', 'https://www.example.com/book.jpg', 100, 15.0, 0.0, 15.0, 7);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Sports Equipment', 'Sports Equipment', 'https://www.example.com/sports-equipment.jpg', 100, 30.0, 0.0, 30.0, 8);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Beauty Product', 'Beauty Product', 'https://www.example.com/beauty-product.jpg', 100, 25.0, 0.0, 25.0, 9);
/* 10 rows of smart phones: real phones series */

INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S21', 'Samsung Galaxy S21', 'https://www.example.com/samsung-galaxy-s21.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S21 Ultra', 'Samsung Galaxy S21 Ultra', 'https://www.example.com/samsung-galaxy-s21-ultra.jpg', 100, 1200.0, 0.0, 1200.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S21 Plus', 'Samsung Galaxy S21 Plus', 'https://www.example.com/samsung-galaxy-s21-plus.jpg', 100, 1100.0, 0.0, 1100.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S20', 'Samsung Galaxy S20', 'https://www.example.com/samsung-galaxy-s20.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S20 Ultra', 'Samsung Galaxy S20 Ultra', 'https://www.example.com/samsung-galaxy-s20-ultra.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S20 Plus', 'Samsung Galaxy S20 Plus', 'https://www.example.com/samsung-galaxy-s20-plus.jpg', 100, 850.0, 0.0, 850.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S10', 'Samsung Galaxy S10', 'https://www.example.com/samsung-galaxy-s10.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S10 Plus', 'Samsung Galaxy S10 Plus', 'https://www.example.com/samsung-galaxy-s10-plus.jpg', 100, 750.0, 0.0, 750.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy S10 Lite', 'Samsung Galaxy S10 Lite', 'https://www.example.com/samsung-galaxy-s10-lite.jpg', 100, 650.0, 0.0, 650.0, 2);
INSERT INTO product (product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Samsung Galaxy Note 20', 'Samsung Galaxy Note 20', 'https://www.example.com/samsung-galaxy-note-20.jpg', 100, 950.0, 0.0, 950.0, 2);
/* 10 rows of smart phones: apple phones */

INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 12', 'iPhone 12', 'https://www.example.com/iphone-12.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 12 Pro', 'iPhone 12 Pro', 'https://www.example.com/iphone-12-pro.jpg', 100, 1200.0, 0.0, 1200.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 12 Pro Max', 'iPhone 12 Pro Max', 'https://www.example.com/iphone-12-pro-max.jpg', 100, 1300.0, 0.0, 1300.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 11', 'iPhone 11', 'https://www.example.com/iphone-11.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 11 Pro', 'iPhone 11 Pro', 'https://www.example.com/iphone-11-pro.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone 11 Pro Max', 'iPhone 11 Pro Max', 'https://www.example.com/iphone-11-pro-max.jpg', 100, 1100.0, 0.0, 1100.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone SE', 'iPhone SE', 'https://www.example.com/iphone-se.jpg', 100, 500.0, 0.0, 500.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone XR', 'iPhone XR', 'https://www.example.com/iphone-xr.jpg', 100, 600.0, 0.0, 600.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone XS', 'iPhone XS', 'https://www.example.com/iphone-xs.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ( 'iPhone XS Max', 'iPhone XS Max', 'https://www.example.com/iphone-xs-max.jpg', 100, 800.0, 0.0, 800.0, 2);
/* 10 rows of smart phones: xiaomi phones */

INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 11', 'Xiaomi Mi 11', 'https://www.example.com/xiaomi-mi-11.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 11 Pro', 'Xiaomi Mi 11 Pro', 'https://www.example.com/xiaomi-mi-11-pro.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 11 Ultra', 'Xiaomi Mi 11 Ultra', 'https://www.example.com/xiaomi-mi-11-ultra.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 10', 'Xiaomi Mi 10', 'https://www.example.com/xiaomi-mi-10.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 10 Pro', 'Xiaomi Mi 10 Pro', 'https://www.example.com/xiaomi-mi-10-pro.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 10 Ultra', 'Xiaomi Mi 10 Ultra', 'https://www.example.com/xiaomi-mi-10-ultra.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 9', 'Xiaomi Mi 9', 'https://www.example.com/xiaomi-mi-9.jpg', 100, 500.0, 0.0, 500.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 9 Pro', 'Xiaomi Mi 9 Pro', 'https://www.example.com/xiaomi-mi-9-pro.jpg', 100, 600.0, 0.0, 600.0, 2);
INSERT INTO product ( product_name, description, image, quantity, price, discount, special_price, category_id) VALUES ('Xiaomi Mi 9 SE', 'Xiaomi Mi 9 SE', 'https://www.example.com/xiaomi-mi-9-se.jpg', 100, 400.0, 0.0, 400.0, 2);

/* 3 users and there roles */
insert into users (username, password, email) values ('admin', '$2a$12$woyVf3GRn1wzUJUqbY9Z2uXR5vZWNBHdndRNR4WFUesHZ0TR9zvrS', 'admin@gmail.com');
insert into users (username, password, email) values ('user', '$2a$12$woyVf3GRn1wzUJUqbY9Z2uXR5vZWNBHdndRNR4WFUesHZ0TR9zvrS', 'user@gmail.com');
insert into users (username, password, email) values ('seller', '$2a$12$woyVf3GRn1wzUJUqbY9Z2uXR5vZWNBHdndRNR4WFUesHZ0TR9zvrS', 'seller@gmail.com');
insert into roles (role_name) values ('ROLE_ADMIN');
insert into roles (role_name) values ('ROLE_USER');
insert into roles (role_name) values ('ROLE_SELLER');
insert into user_roles (user_id, role_id) values (1, 1);
insert into user_roles (user_id, role_id) values (2, 2);
insert into user_roles (user_id, role_id) values (3, 3);