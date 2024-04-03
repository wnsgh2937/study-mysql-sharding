CREATE DATABASE db0 default CHARACTER SET UTF8;

CREATE TABLE db0.`order_detail` (
    order_detail_id BIGINT PRIMARY KEY,
    customer_id BIGINT,
    total_price BIGINT,
    order_status VARCHAR(255),
    order_date DATE,
    delivery_address VARCHAR(255)
);
