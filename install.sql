CREATE DATABASE kt_module;

USE kt_module;


CREATE TABLE product (
    `id` int(11) not null auto_increment primary key,
    `name` varchar(255) not null,
    `price` int not null,
    `total` int not null,
    `color` varchar(20) null not null,
    `desc` text null not null default '',
    `category` int(11) not null
);



CREATE TABLE category (
    id int(11) not null auto_increment primary key,
    name varchar(100) not null
);


INSERT INTO category (`name`) values ('Áo thun'), ('Áo semi');

