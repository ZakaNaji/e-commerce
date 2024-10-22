INSERT INTO categories (category_id, category_name) VALUES (1, 'Mens T-Shirts');
INSERT INTO categories (category_id, category_name) VALUES (2, 'Smartphones');
INSERT INTO categories (category_id, category_name) VALUES (3, 'Apparel');
INSERT INTO categories (category_id, category_name) VALUES (4, 'Home Appliances');
INSERT INTO categories (category_id, category_name) VALUES (5, 'Toys');
INSERT INTO categories (category_id, category_name) VALUES (6, 'Furniture');
INSERT INTO categories (category_id, category_name) VALUES (7, 'Books');
INSERT INTO categories (category_id, category_name) VALUES (8, 'Sports Equipment');
INSERT INTO categories (category_id, category_name) VALUES (9, 'Beauty Products');
INSERT INTO categories (category_id, category_name) VALUES (10, 'Automotive');
INSERT INTO categories (category_id, category_name) VALUES (11, 'Outdoor Gear');
INSERT INTO categories (category_id, category_name) VALUES (12, 'Electronics');
INSERT INTO categories (category_id, category_name) VALUES (13, 'Kitchen Appliances');
INSERT INTO categories (category_id, category_name) VALUES (14, 'Baby Products');
INSERT INTO categories (category_id, category_name) VALUES (15, 'Health & Fitness');
INSERT INTO categories (category_id, category_name) VALUES (16, 'Garden & Outdoor');
INSERT INTO categories (category_id, category_name) VALUES (17, 'Pet Supplies');
INSERT INTO categories (category_id, category_name) VALUES (18, 'Office Supplies');
INSERT INTO categories (category_id, category_name) VALUES (19, 'Jewelry & Watches');
INSERT INTO categories (category_id, category_name) VALUES (20, 'Travel & Luggage');
INSERT INTO categories (category_id, category_name) VALUES (21, 'Musical Instruments');
INSERT INTO categories (category_id, category_name) VALUES (22, 'Crafts & Hobbies');
INSERT INTO categories (category_id, category_name) VALUES (23, 'Collectibles & Memorabilia');
INSERT INTO categories (category_id, category_name) VALUES (24, 'Art & Decor');
INSERT INTO categories (category_id, category_name) VALUES (25, 'Food & Beverages');
INSERT INTO categories (category_id, category_name) VALUES (26, 'Stationery & Gift Wrapping');
INSERT INTO categories (category_id, category_name) VALUES (27, 'Electrical & Lighting');
INSERT INTO categories (category_id, category_name) VALUES (28, 'DIY & Tools');
INSERT INTO categories (category_id, category_name) VALUES (29, 'Party Supplies');
INSERT INTO categories (category_id, category_name) VALUES (30, 'Educational Toys');
/* 30 rows of products: */

INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (1, 'Mens T-Shirt', 'Mens T-Shirt', 'https://www.example.com/mens-t-shirt.jpg', 100, 20.0, 0.0, 20.0, 1);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (2, 'Smartphone', 'Smartphone', 'https://www.example.com/smartphone.jpg', 100, 200.0, 0.0, 200.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (3, 'Apparel', 'Apparel', 'https://www.example.com/apparel.jpg', 100, 50.0, 0.0, 50.0, 3);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (4, 'Home Appliance', 'Home Appliance', 'https://www.example.com/home-appliance.jpg', 100, 500.0, 0.0, 500.0, 4);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (5, 'Toy', 'Toy', 'https://www.example.com/toy.jpg', 100, 10.0, 0.0, 10.0, 5);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (6, 'Furniture', 'Furniture', 'https://www.example.com/furniture.jpg', 100, 1000.0, 0.0, 1000.0, 6);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (7, 'Book', 'Book', 'https://www.example.com/book.jpg', 100, 15.0, 0.0, 15.0, 7);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (8, 'Sports Equipment', 'Sports Equipment', 'https://www.example.com/sports-equipment.jpg', 100, 30.0, 0.0, 30.0, 8);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (9, 'Beauty Product', 'Beauty Product', 'https://www.example.com/beauty-product.jpg', 100, 25.0, 0.0, 25.0, 9);
/* 10 rows of smart phones: real phones series */

INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (10, 'Samsung Galaxy S21', 'Samsung Galaxy S21', 'https://www.example.com/samsung-galaxy-s21.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (11, 'Samsung Galaxy S21 Ultra', 'Samsung Galaxy S21 Ultra', 'https://www.example.com/samsung-galaxy-s21-ultra.jpg', 100, 1200.0, 0.0, 1200.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (12, 'Samsung Galaxy S21 Plus', 'Samsung Galaxy S21 Plus', 'https://www.example.com/samsung-galaxy-s21-plus.jpg', 100, 1100.0, 0.0, 1100.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (13, 'Samsung Galaxy S20', 'Samsung Galaxy S20', 'https://www.example.com/samsung-galaxy-s20.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (14, 'Samsung Galaxy S20 Ultra', 'Samsung Galaxy S20 Ultra', 'https://www.example.com/samsung-galaxy-s20-ultra.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (15, 'Samsung Galaxy S20 Plus', 'Samsung Galaxy S20 Plus', 'https://www.example.com/samsung-galaxy-s20-plus.jpg', 100, 850.0, 0.0, 850.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (16, 'Samsung Galaxy S10', 'Samsung Galaxy S10', 'https://www.example.com/samsung-galaxy-s10.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (17, 'Samsung Galaxy S10 Plus', 'Samsung Galaxy S10 Plus', 'https://www.example.com/samsung-galaxy-s10-plus.jpg', 100, 750.0, 0.0, 750.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (18, 'Samsung Galaxy S10 Lite', 'Samsung Galaxy S10 Lite', 'https://www.example.com/samsung-galaxy-s10-lite.jpg', 100, 650.0, 0.0, 650.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (19, 'Samsung Galaxy Note 20', 'Samsung Galaxy Note 20', 'https://www.example.com/samsung-galaxy-note-20.jpg', 100, 950.0, 0.0, 950.0, 2);
/* 10 rows of smart phones: apple phones */

INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (20, 'iPhone 12', 'iPhone 12', 'https://www.example.com/iphone-12.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (21, 'iPhone 12 Pro', 'iPhone 12 Pro', 'https://www.example.com/iphone-12-pro.jpg', 100, 1200.0, 0.0, 1200.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (22, 'iPhone 12 Pro Max', 'iPhone 12 Pro Max', 'https://www.example.com/iphone-12-pro-max.jpg', 100, 1300.0, 0.0, 1300.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (23, 'iPhone 11', 'iPhone 11', 'https://www.example.com/iphone-11.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (24, 'iPhone 11 Pro', 'iPhone 11 Pro', 'https://www.example.com/iphone-11-pro.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (25, 'iPhone 11 Pro Max', 'iPhone 11 Pro Max', 'https://www.example.com/iphone-11-pro-max.jpg', 100, 1100.0, 0.0, 1100.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (26, 'iPhone SE', 'iPhone SE', 'https://www.example.com/iphone-se.jpg', 100, 500.0, 0.0, 500.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (27, 'iPhone XR', 'iPhone XR', 'https://www.example.com/iphone-xr.jpg', 100, 600.0, 0.0, 600.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (28, 'iPhone XS', 'iPhone XS', 'https://www.example.com/iphone-xs.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (29, 'iPhone XS Max', 'iPhone XS Max', 'https://www.example.com/iphone-xs-max.jpg', 100, 800.0, 0.0, 800.0, 2);
/* 10 rows of smart phones: xiaomi phones */

INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (30, 'Xiaomi Mi 11', 'Xiaomi Mi 11', 'https://www.example.com/xiaomi-mi-11.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (31, 'Xiaomi Mi 11 Pro', 'Xiaomi Mi 11 Pro', 'https://www.example.com/xiaomi-mi-11-pro.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (32, 'Xiaomi Mi 11 Ultra', 'Xiaomi Mi 11 Ultra', 'https://www.example.com/xiaomi-mi-11-ultra.jpg', 100, 1000.0, 0.0, 1000.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (33, 'Xiaomi Mi 10', 'Xiaomi Mi 10', 'https://www.example.com/xiaomi-mi-10.jpg', 100, 700.0, 0.0, 700.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (34, 'Xiaomi Mi 10 Pro', 'Xiaomi Mi 10 Pro', 'https://www.example.com/xiaomi-mi-10-pro.jpg', 100, 800.0, 0.0, 800.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (35, 'Xiaomi Mi 10 Ultra', 'Xiaomi Mi 10 Ultra', 'https://www.example.com/xiaomi-mi-10-ultra.jpg', 100, 900.0, 0.0, 900.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (36, 'Xiaomi Mi 9', 'Xiaomi Mi 9', 'https://www.example.com/xiaomi-mi-9.jpg', 100, 500.0, 0.0, 500.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (37, 'Xiaomi Mi 9 Pro', 'Xiaomi Mi 9 Pro', 'https://www.example.com/xiaomi-mi-9-pro.jpg', 100, 600.0, 0.0, 600.0, 2);
INSERT INTO product (product_id, product_name, description, image, quantity, price, discount, special_price, category_id) VALUES (38, 'Xiaomi Mi 9 SE', 'Xiaomi Mi 9 SE', 'https://www.example.com/xiaomi-mi-9-se.jpg', 100, 400.0, 0.0, 400.0, 2);
