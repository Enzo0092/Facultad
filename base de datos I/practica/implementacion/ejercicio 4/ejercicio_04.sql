use PracticaSerie3
create table Pedido(
id_pedido int identity (1,1) not null ,
fecha_pedido date not null ,
importe decimal (10,2)not null,
id_cliente int not null,
constraint PK_Pedido primary key(id_pedido)
);
go
-- 3 insertar inicialmente algunos pedidos correspondiendtes a clientes exixstentes
select * from Cliente;
insert into Pedido(fecha_pedido,importe,id_cliente)
values ('2026-10-12', 100, 1);
-- 4 incorporar mediante alter table una foreing key entre cliente y pedido

alter table Pedido
add constraint FK_Pedido_Cliente
foreign key (id_cliente)
references Cliente (id_cliente);
go
-- intentar registrar un pedido utilizando un codigo que no exista

insert into Pedido(fecha_pedido,importe,id_cliente)
values('2026-01-03', 200, 10);
go
--The INSERT statement conflicted with the FOREIGN KEY constraint "FK_Pedido_Cliente". The conflict occurred in database "PracticaSerie3", table "dbo.Cliente", column 'id_cliente'. 
mensaje de error