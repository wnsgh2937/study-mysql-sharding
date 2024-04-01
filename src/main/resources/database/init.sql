CREATE DATABASE leo_db default CHARACTER SET UTF8;

CREATE TABLE leo_db.`order` (
    order_id BIGINT PRIMARY KEY,
    customer_id BIGINT,
    total_price BIGINT,
    order_status VARCHAR(255),
    order_date DATE,
    delivery_address VARCHAR(255)
);
