-- =====================================================
--  Inventory and Stock Control System - Database Script
--  MySQL 8.x
-- =====================================================
DROP DATABASE IF EXISTS inventory_db;
CREATE DATABASE inventory_db CHARACTER SET utf8mb4;
USE inventory_db;

-- 1. users
CREATE TABLE users (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    username      VARCHAR(50)  NOT NULL UNIQUE,
    password_hash VARCHAR(64)  NOT NULL,
    full_name     VARCHAR(100) NOT NULL,
    role          ENUM('ADMIN','STAFF') NOT NULL DEFAULT 'STAFF',
    active        TINYINT(1)   NOT NULL DEFAULT 1
);

-- 2. categories
CREATE TABLE categories (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255)
);

-- 3. suppliers
CREATE TABLE suppliers (
    id             INT AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(100) NOT NULL,
    contact_person VARCHAR(100),
    phone          VARCHAR(20),
    email          VARCHAR(100),
    address        VARCHAR(255)
);

-- 4. customers
CREATE TABLE customers (
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    phone   VARCHAR(20),
    email   VARCHAR(100),
    address VARCHAR(255)
);

-- 5. products
CREATE TABLE products (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    code          VARCHAR(30)  NOT NULL UNIQUE,
    name          VARCHAR(100) NOT NULL,
    category_id   INT NOT NULL,
    supplier_id   INT NOT NULL,
    cost_price    DECIMAL(10,2) NOT NULL DEFAULT 0,
    unit_price    DECIMAL(10,2) NOT NULL DEFAULT 0,
    quantity      INT NOT NULL DEFAULT 0,
    reorder_level INT NOT NULL DEFAULT 0,
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(id)
);

-- 6. stock_in (goods received from suppliers)
CREATE TABLE stock_in (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    product_id    INT NOT NULL,
    supplier_id   INT NOT NULL,
    quantity      INT NOT NULL,
    unit_cost     DECIMAL(10,2) NOT NULL,
    received_date DATE NOT NULL,
    user_id       INT NOT NULL,
    remarks       VARCHAR(255),
    FOREIGN KEY (product_id)  REFERENCES products(id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(id),
    FOREIGN KEY (user_id)     REFERENCES users(id)
);

-- 7. stock_out (goods issued / sold to customers)
CREATE TABLE stock_out (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    product_id  INT NOT NULL,
    customer_id INT NOT NULL,
    quantity    INT NOT NULL,
    unit_price  DECIMAL(10,2) NOT NULL,
    issue_date  DATE NOT NULL,
    user_id     INT NOT NULL,
    remarks     VARCHAR(255),
    FOREIGN KEY (product_id)  REFERENCES products(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (user_id)     REFERENCES users(id)
);

-- 8. stock_adjustments (damaged, lost, count corrections)
CREATE TABLE stock_adjustments (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    product_id      INT NOT NULL,
    quantity_change INT NOT NULL,
    reason          VARCHAR(255) NOT NULL,
    adjust_date     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    user_id         INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (user_id)    REFERENCES users(id)
);

-- ---------------- Sample data ----------------
-- admin / admin123   |   staff / staff123   (SHA-256 hashes)
INSERT INTO users (username, password_hash, full_name, role) VALUES
('admin','240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9','System Administrator','ADMIN'),
('staff','10176e7b7b24d317acfcf8d2064cfd2f24e154f7b5a96603077d5ef813d6a6b6','Store Keeper','STAFF');

INSERT INTO categories (name, description) VALUES
('Electronics','Computer accessories and devices'),
('Stationery','Office stationery items'),
('Groceries','Food and beverage items'),
('Furniture','Office furniture'),
('Cleaning','Cleaning and hygiene items');

INSERT INTO suppliers (name, contact_person, phone, email, address) VALUES
('ABC Traders','Nimal Perera','0771234567','abc@traders.lk','Colombo 10'),
('Lanka Office Supplies','Kamal Silva','0712345678','info@lankaoffice.lk','Kandy'),
('Global Electronics','Sunil Fernando','0753456789','sales@globalelec.lk','Colombo 03'),
('Fresh Foods Pvt Ltd','Anura Bandara','0764567890','orders@freshfoods.lk','Gampaha');

INSERT INTO customers (name, phone, email, address) VALUES
('Walk-in Customer','0000000000','',''),
('Kandy City Mart','0812223344','mart@kandycity.lk','Kandy'),
('Perera & Sons','0771112233','perera@sons.lk','Peradeniya'),
('Silva Enterprises','0719998877','silva@ent.lk','Katugastota');

INSERT INTO products (code,name,category_id,supplier_id,cost_price,unit_price,reorder_level) VALUES
('ELE001','Wireless Mouse',1,3,1200,1650,10),
('ELE002','USB Keyboard',1,3,1800,2400,10),
('ELE003','LED Monitor 22 inch',1,3,28000,34500,5),
('STA001','A4 Paper Ream',2,2,950,1200,20),
('STA002','Ball Point Pen Box',2,2,350,480,15),
('STA003','Stapler',2,2,420,600,8),
('GRO001','Tea Packet 400g',3,4,520,650,25),
('GRO002','Sugar 1kg',3,4,210,260,30),
('FUR001','Office Chair',4,1,9500,12500,4),
('CLE001','Floor Cleaner 1L',5,1,380,520,12);

INSERT INTO stock_in (product_id,supplier_id,quantity,unit_cost,received_date,user_id,remarks) VALUES
(1,3,40,1200,'2026-09-01',1,'Opening stock'),
(2,3,25,1800,'2026-09-01',1,'Opening stock'),
(3,3,12,28000,'2026-09-01',1,'Opening stock'),
(4,2,100,950,'2026-09-02',1,'Opening stock'),
(5,2,60,350,'2026-09-02',1,'Opening stock'),
(6,2,20,420,'2026-09-02',1,'Opening stock'),
(7,4,80,520,'2026-09-03',1,'Opening stock'),
(8,4,120,210,'2026-09-03',1,'Opening stock'),
(9,1,10,9500,'2026-09-03',1,'Opening stock'),
(10,1,30,380,'2026-09-04',1,'Opening stock');

INSERT INTO stock_out (product_id,customer_id,quantity,unit_price,issue_date,user_id,remarks) VALUES
(1,2,35,1650,'2026-09-10',2,'Bulk order'),
(4,3,85,1200,'2026-09-11',2,'Office order'),
(3,2,4,34500,'2026-09-12',2,''),
(8,3,100,260,'2026-09-14',2,'Wholesale'),
(9,4,3,12500,'2026-09-15',2,''),
(7,1,20,650,'2026-09-16',2,''),
(2,2,10,2400,'2026-09-18',2,'');

-- keep product quantity consistent with the sample transactions
UPDATE products p SET quantity =
    COALESCE((SELECT SUM(quantity) FROM stock_in  WHERE product_id = p.id),0) -
    COALESCE((SELECT SUM(quantity) FROM stock_out WHERE product_id = p.id),0);
