CREATE DATABASE tokyo_db_0 default CHARACTER SET UTF8;

CREATE TABLE tokyo_db_0.`key_hash` (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    order_status VARCHAR(255),
);
