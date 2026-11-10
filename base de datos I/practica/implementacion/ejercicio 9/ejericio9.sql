use PracticaSerie3
--1 incorporar la columna permitiendo null termporalmente
alter table Pedido
add estado varchar(30) null;
--.2 asignar 'pendiente' a los registros existentes
update Pedido
set estado ='Pendiente '
go
--3.dejar la columna como obligatoria (not null)
alter table Pedido
alter column estado varchar(20) not null;

--4 establecer pendiente como valor predeterminado para nuevos pedidos
alter table Pedido
add constraint DF_Pedido_estado default 'pendiente' for estado;

5-- crear la restriccion check para que solo acepte esos tres valores
alter table Pedido
add constraint ck_pedido_estado
check (estado in ('pendiente', 'Enviado', 'entregado'));

--punto 5 actualizar a enviado
update Pedido
set estado= 'enviado'
where id_pedido=1;

--.punto 6 intentar asignar cancelado

update Pedido 
set estado= 'cancelado'
where id_pedido =2;