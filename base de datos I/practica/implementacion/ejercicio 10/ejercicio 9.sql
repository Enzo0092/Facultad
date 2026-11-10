use PracticaSerie3

create table Sector(
codigo_sector int identity (1,1) primary key,
nombre varchar (50) not null unique 
);

insert into sector (nombre)
values ('administracion'),('ventas'), ('deposito');
4-- agregar la columna temporalmente permitiendo null
alter table Empleado
add codigo_sector int null;
5-- asignar un sector existente ejemplo el codigo 1 a los empleados actuales
update Empleado
set codigo_sector =1;
-- dejar la columna como obligatoria not null
alter table Empleado
alter column codigo_sector int not null;


-- crear la restriccion foreing key
alter table Empleado
add constraint FK_Empleado_Sector
foreign key (codigo_sector ) references Sector (codigo_sector );
-- paso 7 intentar asignar un sector inexistente 
update Empleado
set codigo_sector=99
where id_empleado =1;
-- el motor arroja un eror rojo informando el conflico con la clave foranea , protegiendo la integridad 
-- referencial tal como lo vimos en los primeros ejercicios