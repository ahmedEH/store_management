-- La base de donnes de l'application ciment management :


-- In this database we need 4 tables so let's go :

-- Creation de la base 

create database if not exists job_post;

use job_post;

-- creation de la table society:

create table if not exists society (

id int primary key auto_increment,

nom varchar(50) not null unique ,

adress varchar(200) ,

email varchar(50) ,

tel varchar(50)

);

-- creation de la table good :

create table if not exists good (

id int primary key auto_increment,

nom varchar(50) not null unique,

unite varchar(50),

society int not null,

foreign key (society) references society(id)

);

-- creation de la table  recipient :

create table if not exists recipient (

id int primary key auto_increment,

nom varchar(50) not null unique,

adress varchar(200) ,

email varchar(50) ,

tel varchar(50),

wtsp varchar(50)

);

--  creation e la table commande :

create table if not exists commande (

id int primary key auto_increment,

numero_commande int not null unique,

quantity int not null,

date_commande date not null,

good int not null,

foreign key (good) references good(id),

description text

);

--  creation e la table reception :

create table if not exists reception (

id int primary key auto_increment,

numero_reception int not null unique,

quantity int not null,

date_reception date not null,

good int not null,

foreign key (good) references good(id),

recipient int not null,

foreign key (recipient) references recipient(id),

car_mumero varchar(50) not null,

description text

);


-- creation de la table admins :

create table if not exists admins(

id int primary key,

login varchar(50) not null unique,

mdp varchar(50) not null

);