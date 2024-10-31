CREATE TABLE categories (
                            category_id BIGINT PRIMARY KEY AUTO_INCREMENT,
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