use PracticaSerie3;
go
--. ejecuto esta linea para traer los pedidos y revisar el id del cliente
select * from Pedido;

--. intento eliminar el cliente mediante si id cliente
delete  from Cliente where id_cliente =1;
--. no me deja por que tiene asociado un pedido que depende mediante clave foranea del cliente

delete from Cliente where id_cliente =2 ;

--. este me deja eliminar sin problemas puesto que notiene pedidos asociados y por lo tanto no hereda la fk a ninguna otra tabla