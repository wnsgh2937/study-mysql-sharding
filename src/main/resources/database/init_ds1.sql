CREATE DATABASE db1 default CHARACTER SET UTF8;

CREATE TABLE db1.`order_detail` (
    order_detail_id BIGINT PRIMARY KEY,
    customer_id BIGINT,
    total_price BIGINT,
    order_status VARCHAR(255),
    order_date DATE,
    delivery_address VARCHAR(255)
);
