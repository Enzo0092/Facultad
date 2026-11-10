use PracticaSerie3


select *from Empleado
--. paso 1 :agregamos la columna permitiendo null temporalmente
alter table Empleado
add estado varchar (10) null;

--. paso 2: garantizamos que los empleados actuales tengan el valor áctivo
update Empleado
set estado='activo';
--. paso 3 modificamos las estructura para que la comlumna sea obligatoria

alter table Empleado
alter column estado varchar(10) not null;


--. paso 4 establecemos el valor predeterminado para las proximas altas
alter table Empleado
add constraint DF_Empleado_estado default 'activo' for estado;
