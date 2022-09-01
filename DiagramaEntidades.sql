-- CREATE DATABASE = 
CREATE DATABASE AdministracionIngresosEgresos;
-- CREATE TABLES = 
USE AdministracionIngresosEgresos;
CREATE TABLE Profile(
   id varchar(100) not null AUTO_INCREMENT,
   image varchar(50) not null,
   phone varchar(10) not null,
   user varchar(50) not null,                   -- USER
   createdAt date not null,
   updatedAt date not null,
   PRIMARY KEY(id),
   FOREIGN KEY(user)
);
CREATE TABLE Employee(
    id varchar(100) not null AUTO_INCREMENT,    -- LONG
    email varchar(50) not null,
    profile varchar(100) not null,              -- PROFILE
    role varchar(20) not null,                  -- Enum_RoleName
    enterprise varchar(50) not null,            -- Enterprise
    transactions varchar(50) not null,          -- Transaction
    createdAt date not null,
    updatedAt date not null,
    PRIMARY KEY(id),
    FOREIGN KEY(profile, role, enterprise, Transactions)
);
CREATE TABLE Enterprise(
    id varchar(100) not null AUTO_INCREMENT,
    name varchar(100) not null,
    document varchar(100) not null,
    phone varchar(10) not null,
    address varchar(100) not null,
    users varchar(100) not null,                -- User[]
    transactions varchar(100) not null,         -- Transaction[]
    createdAt date not null,
    updatedAt date not null,
    PRIMARY KEY(id),
    FOREIGN KEY(users, transactions)
);
CREATE TABLE Transaction(
    id varchar(100) not null AUTO_INCREMENT,    -- LONG
    concept varchar(100) not null AUTO_INCREMENT,
    amount float not null,
    user varchar(100) not null,                 -- User
    enterprise varchar(100) not null,           -- Enterprise
    createdAt date not null,
    updatedAt date not null,
    PRIMARY KEY(id),
    FOREIGN KEY(user, enterprise)
);
