CREATE DATABASE ds0 default CHARACTER SET UTF8;

CREATE TABLE ds0.`order_detail` (
    order_detail_id BIGINT PRIMARY KEY,
    customer_id BIGINT,
    total_price BIGINT,
    order_status VARCHAR(255),
    order_date DATE,
    delivery_address VARCHAR(255)
);

CREATE DATABASE ds1 default CHARACTER SET UTF8;

CREATE TABLE ds1.`order_detail` (
    order_detail_id BIGINT PRIMARY KEY,
    customer_id BIGINT,
    total_price BIGINT,
    order_status VARCHAR(255),
    order_date DATE,
    delivery_address VARCHAR(255)
);
