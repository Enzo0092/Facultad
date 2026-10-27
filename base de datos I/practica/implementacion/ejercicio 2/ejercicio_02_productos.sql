use PracticaSerie3
GO
-- 1, 2 , 3 crecdion de la tabla producto conidentiti y default
Create table Producto(
id_producto int  identity(1,1), --identificador producto que arranca en uno y va de uno en uno
descripcion varchar (30) not null, 
precio decimal (10,2) not null,
estado varchar (10) not null default 'activo',
constraint PK_Producto primary key (id_producto)
);
go

insert into Producto(descripcion,precio,estado)
values('leche',100,'si')
insert into Producto(descripcion,precio,estado)
values('azucar',200,'vencido')
insert into Producto(descripcion, precio)
values('mana', 150)
insert into Producto(descripcion,precio,estado)
values('mani',80,'desactivo')
insert into Producto(descripcion, precio, estado)
values(' pepas', 10000, 'muy bueno')
-- verificacion de las filas insertadas
select *from Producto;
go
--5 agreamos posteriormenete una restricicion chec j oara impedir precios menores o iguales a 0
alter table Producto
add constraint CK_Producto_precio check (precio>0);
go
insert into Producto(descripcion, precio)
values('mouse',100)
go
select *from Producto
--7 modificar mediante update el precio de uno de los productos exixtenes 
update Producto
set precio=480000.00
where id_producto =1;
go

--update Producto
--set precio=0
--where id_producto =5;
--go

