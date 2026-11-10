use PracticaSerie3
--. ejrecicio 13 normalizacion
--. ya tengo una tabla creada llamada departamentos en donde no esta normalizado
--. lo que quiero es normalizar separando en 2 tablas y que herede asi no se repiten datos

create table Provincia(
codigo_provincia int primary key,
nombre_provincia varchar (100) not null
);
go
--. preparo los datos para resovlver el ejercicio 13
create table Departamento(
codigo_departamento int primary key,
nombre_departamento varchar (100) not null,
codigo_provincia int not null,
nombre_provincia varchar(100) not null
);
go
--insertar los datos del ejemplo del ejercicio
insert into Departamento(codigo_departamento,nombre_departamento,codigo_provincia,nombre_provincia)
values (1,'capital',18,'Corrientes'),
(2, 'Goya', 18, 'Corrientes'),
(3, 'Oberá', 54, 'Misiones'),
(4, 'Eldorado', 54, 'Misiones'),
(5, 'Paraná', 30, 'Entre Ríos'),
(6, 'Concordia', 30, 'Entre Ríos');
GO


--.paso 2 aplicar la transformacion para la solucion del ejercicio 13-
--ahora vamos a pblar la tabla provincia con los datos unicos desde departamento
insert into Provincia(codigo_provincia,nombre_provincia)
select distinct codigo_provincia, nombre_provincia
from Departamento;


--.3 agregar la rescticcion de clave foranea en departamento
alter table Departamento
add constraint FK_Departamento_Provincia
foreign key (codigo_provincia) references Provincia(codigo_provincia);
go
--4 eliminar la columna redundante de la tabla departamente
alter table Departamento
drop column nombre_provincia;
--5 verificamos que no se haya n perdido informacion
select *from Provincia