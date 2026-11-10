use PracticaSerie3
--.analizamos como debe definirse codigo sector para que
--un empleado quede temporalmente sin sector asignado 
alter table Empleado
alter column codigo_sector int null;
-- modificar un empleado utilizando cadena vacia vs null 
-- intentar cnon cadena vacia o valor invalido de texto 
-- si fuera texto o numero existente el motor te arrojara un error 
-- de conversion de tipos de datos 


-- utilizar null: la forma correcta de quitarle el sector de forma temporal
-- es asignandole explicitamente el valor null
update Empleado 
set codigo_sector=NULL
where id_empleado =1;

--3 identificar los  empleados sin sector utilizando is null punto 4
-- para filtar aquellos que notienen sector usamos obligatoriamente 
-- el operador de estado :
select * from Empleado
where codigo_sector is null;
--4 explicar por qu enull no representa lo mismo que un codigo de sector inexixstente
-- null representa la ausencia total de valir, un dato desconocido o una condicion temporal 
-- en este caso que el empleado no esta asignado a ningun sector por el momento 
-- al ser nill la  clave foranea no se evalua, se ignora permitiendo que el registro existea sin romper la integridad referncial
-- un codigo inexistente representa un valor numerico concreto que intenta violar la integridad referencial , si el motor permitira cargar un 99 cuando ese codigo no existe en la taabla padre Sector , romperia la relacion de la clave foranea por que estaria apuntando a una entidad fantasma, por eso el motor rechaza el numero inexistente y en cambio acepta gustoso el null
select * from Cliente