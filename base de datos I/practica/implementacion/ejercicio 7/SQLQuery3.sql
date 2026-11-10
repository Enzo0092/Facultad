use PracticaSerie3

--. vamos a alterar la logitud de un atributo 
alter table Producto
alter column descripcion varchar(80);
--. comprobamos que los datos siguen intactos
select * from Producto;
--. actualizamos una descripion de un producto
update Producto
set descripcion =' una notebook que esta gooooooddddd weeeeeeeeee' 
where id_producto=8;
