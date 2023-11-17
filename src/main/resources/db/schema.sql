CREATE TABLE IF NOT EXISTS USERS (
id int not null auto_increment,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
email_address VARCHAR(255) NOT NULL,
phone_number VARCHAR(20) NOT NULL,
registration_date timestamp,
last_visit_date timestamp,
PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ORDERS (
order_id int not null auto_increment,
product_name VARCHAR(255) NOT NULL,
quantity int not null,
price_per_item double not null,
user_id int NOT NULL,
shipping_address VARCHAR(255) NOT NULL,
order_date timestamp,
PRIMARY KEY (order_id)
);