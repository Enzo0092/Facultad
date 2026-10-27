-- 1. crear la base de datos para la serie de ejercicios 3
CREATE DATABASE PracticaSerie3;
GO
--2. posicionarse sobre ella
USE PracticaSerie3;
GO

CREATE TABLE Cliente(-- creo la tabla cliente
id_cliente INT IDENTITY (1,1), -- utilizo el codigo idlciente que es numero que se genera en uno va de uno en uno 
apellido_nombre varchar(100) NOT NULL,
correo varchar(100) NULL,
fecha_alta date not null default '2026-01-01',
constraint PK_Cliente primary key (id_cliente)
);
--.6 agregamos la restriccion de la unicidad 
alter table Cliente
add constraint UQ_cliente_Correo unique (correo);
go

--7. agregamos los datos de prueba
insert into Cliente(apellido_nombre ,correo, fecha_alta)
values('Enzo Romero', 'enzo@gmail.com', '2026-10-26');
insert into Cliente(apellido_nombre,correo,fecha_alta)
values('ana','ana@gmail.com','2026-10-26')
-- inserto cliente sin correo electronico
insert into Cliente(apellido_nombre,fecha_alta)
values('jazmin','2026-01-24')

--inserto cliente con correo repetido
insert into Cliente(apellido_nombre,correo,fecha_alta)
values('elchaara','enzo@gmail.com','2026-02-27')
--8 verificamos
select * from  Cliente
go
-- el cliente con correo repetido no me deja agregar ya que el coreo es unico 