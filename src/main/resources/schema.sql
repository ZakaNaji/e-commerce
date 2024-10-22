CREATE TABLE categories (
                            category_id BIGINT PRIMARY KEY,
                            category_name VARCHAR(255) NOT NULL
);

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
                         FOREIGN KEY (category_id) REFERENCES categories(category_id)
);