CREATE DATABASE IF NOT EXISTS mundus;
 
USE mundus;
 
CREATE TABLE Organizacion (
    id_organozacion INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    tipo VARCHAR(50),
    web VARCHAR(255),
    localidad VARCHAR(100)
);

CREATE TABLE usuario (

    id_usuario INT AUTO_INCREMENT PRIMARY KEY,

    nombre VARCHAR(255),
    apellidos VARCHAR(255), 
    direccion VARCHAR(255),
    cp INT (9),
    telefono INT (20),
    localidad VARCHAR (255),
    contraseña VARCHAR(50),
    email VARCHAR(255),
);

CREATE TABLE trabajadores(

    id_trabajadores INT AUTO_INCREMENT PRIMARY KEY,

    nombre VARCHAR (255),
    apellidos VARCHAR (255),
    departamento VARCHAR (255),
    cargo VARCHAR (255),
    telefono VARCHAR (25), 
    administrador BOOLEAN, 
    direciion VARCHAR (255), 

);

CREATE TABLE evento(

id_evento INT AUTO_INCREMENT PRIMARY KEY, 

nombre_evento VARCHAR (255),
lugar VARCHAR (255),
dia INT (255),
fecha INT (10),
hora INT (20),
direccion VARCHAR (255),
descripcion VARCHAR (255),
web VARCHAR (255),
condiciones VARCHAR (255),


);

CREATE TABLE colaboraciones(

    id_colaboraciones INT AUTO_INCREMENT PRIMARY KEY, 

    nombre VARCHAR (255),
    direccion VARCHAR (255),
    telefono INT (20),
    apellidos VARCHAR (255),
    metodo VARCHAR (255),
    email VARCHAR (255),
    cantidad INT (20),

    

);



);


-- insertar datos en tablas

-- Script para añadir datos de usuarios a la tabla usuario en MySQL
INSERT INTO usuario (nombre, apellidos, direccion, cp, telefono, localidad, contraseña, email) 
VALUES ('Jose Perez', 'Garcia Perez', 'Calle pez 8, 3 A', 28000, 123456789, 'Madrid', 'pipas2000', 'correo@usuario.com');
--
-- insertar datos desde un archivo

LOAD DATA INFILE 'archivo.csv' INTO TABLE tabla FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n';

