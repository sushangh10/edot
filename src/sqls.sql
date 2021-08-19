CREATE DATABASE edot;

CREATE TABLE machine(
   ID INT PRIMARY KEY     NOT NULL,
   assetNum           TEXT    NOT NULL,
   ipaddress            varchar(200)     NOT NULL,
   owner        varchar(200),
   username        varchar(200),
   connState	INT,
   assetState	INT,
   type		varchar(200),
   description	varchar(200),
   usage	varchar(200)
);
