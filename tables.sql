create database mydb;

use mydb;
create table product(
id int AUTO_INCREMENT PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);

create table coupon(
id int AUTO_INCREMENT PRIMARY KEY,
code varchar(20) UNIQUE,
discount decimal(8,3),
exp_date varchar(100) 
);

create table flight(
id int AUTO_INCREMENT PRIMARY KEY,
FLIGHT_NUMBER varchar(20) NOT NULL,
OPERATING_AIRLINES varchar(20) NOT NULL,
DEPARTURE_CITY varchar(20) NOT NULL,
ARRIVAL_CITY varchar(20) NOT NULL,
DATE_OF_DEPARTURE DATE NOT NULL,
ESTIMATED_DEPARTURE_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);