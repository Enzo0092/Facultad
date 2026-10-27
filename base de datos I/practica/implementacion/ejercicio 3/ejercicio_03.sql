use PracticaSerie3
go

create table Empleado(
id_empleado int identity(1,1) not null,
dni int  not null,
apellido varchar(50) not null,
nombre varchar (50) not null,
fecha_ingreso date not null default '2026-01-01',
constraint pk_Empleado primary key(id_empleado),

);
go

-- agrego como unico al atributo
alter table Empleado
add constraint UQ_empleado unique (dni);
go

--5 insertar 4 empleados
insert into Empleado(dni,apellido,nombre)
values(41948148,'romero','enzo');
go

select * from Empleado;
insert into Empleado(dni,apellido,nombre)
values(32276542,'kin','agua');

insert into Empleado(dni,apellido,nombre)
values(123454545, 'juan','perez');

insert into Empleado(dni,apellido,nombre)
values (123123123, 'sebastian','abreu');
--insert into Empleado(dni,apellido,nombre)
--values(41948148, 'chaaraa','wy');
-- dice que no te deja por que es unique 
-- update del dni de un empleado
update Empleado
set dni =41234234
where id_empleado=1;

select *from empleado where id_empleado=1;
