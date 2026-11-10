use PracticaSerie3;
go
--. agregamos el atributo fecha entrega 
alter table Pedido
add fecha_entrega date null;

select * from Pedido;
--.actualizamos la fecha de entrega de algunos pedidos
update Pedido
set fecha_entrega = '2026-10-29' where id_pedido =1;
update Pedido 
set fecha_entrega ='2026-10-29' where id_pedido =2;
--. ingresamos un pedido mas sin fecha
insert into Pedido (fecha_pedido,importe,id_cliente)
values ('2026-12-11', 120,1);
--. ahora vamos a traer los pedidos que no tengan fecha de entrega
select * from Pedido
where fecha_entrega is null;
--. ahora vasmos a traer los pedisos pero vamos a comparar con null
--. select * from Pedido  where fecha_entrega= null;
--. ese no me va dejar por que el motor no puede comparar algo con la nada misma