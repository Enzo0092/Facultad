use base_consorcio_2025
go
--. 1 listar todos los registros de la tabla persona (220)

select *from persona;

--2 mostrar solamente el apellido y nombre y la fecha de nacimiento
select apellido_nombre, fecha_nacimiento
from persona;


--. 3 prescendencias de operadores aritmeticos, verificar los sigueitnes calculos con las snetencias 
select 
4+5*3/2-1 as calculo_sin_parentesis,
(4+5)*3/2-1 as calculo_con_parentesis;
--. ejecicio 4 una consulta que muestre el gasto de los edificio y un incremento de el 20% en 3 formatos
--. diferentes con las siguientes cabeceras "sin formato" 
--. redondeado a un digito decimanl
--. truncado a 1 digiyo
select  importe as Gasto_original,
(importe *1.20) as  [sin_formato],
ROUND (importe *1.20,1) as [redondeado a un digito decimal ],
ROUND(importe *1.20,1,1) as[truncado a 1 digito]
from gasto;
go
--. ejercicio 5 
--. listar el nombre (nombre) y la poblacion (poblacion ) de cada provincia
select nombre,poblacion 
from provincia;

--. ejercicio 6 
--. listar sin repetir todos los codigos de la provincia de la tabla 
select distinct provincia_id
from edificio 
--.ejercicio 7
--.listar las 4 primera personas d ela respectiva tabla, 
-- ordenando por las 7 primeras letras de apellido_nombre

select top 4 *
from persona
order by SUBSTRING(apellido_nombre,1,7)asc;

--.ejercicio 8
--.listar las 4 primeras personas de la respectiva tabla
--. ordenado por las 7 primeras letras del apellido_nombre incluir repetidos

select top 4  with ties  * from persona
order by SUBSTRING(apellido_nombre ,1 ,7) asc ;
--. with ties le dice a  sql server devolveme los primeros n
-- registros pero si hay mas registros que empatan en el criterio de ordenamiento 
-- del ultimo puesto incluilos tmb en el resultado



--. ejercicio 9 
--. listar las 4 primeras personas de la respectiva tabla
--. ordenado por  todo el campo apellido_nombre incluir repetidos
--. que diferencias observa co nel ejercicio 8 y a que se debe ?
select top 4 with ties *from persona
order by apellido_nombre asc;

--. la difenrecia es que en este tomamos todo el campo y devuelve menos registros

--. ejercicio nro 10 
--crear una consulta que muestre el nombre y la direccion de los edificios de la provincia
-- de buenos aires , tabla a utilizar :edficio y provincia_id=2

select nombre,direccion
from edificio
where provincia_id=2;

--.ejercicio 11
--. escribir y ejecutar una sentencia select que devuelva los edificios cuyo nombre comience con EDIFICIO-3
--. tabla a utilizar :edificio ,columna: nombre 

select nombre, direccion from edificio
where nombre like 'edificio-3%';
--. where nombre like 'edificio-3%' : el operador like se utiliza para comparar patronesde texto
-- el simbolo actual como comodin e indica " cualquier cadena de cero o mas caracteres que venga despues
--. por lo tanto biscara todos los edificio cuyo nombre empiece con "edificio -3" 
--. y tenga cualquier cosa a continuacion  

--.. ejercicio 12
-- crea una consulta que muestre el nombre y apellido, telefono y fecha de nacimiento 
-- en una sola columna, separados por un guiso para todas las muheres (sexp=f)
-- poner alias datos personales  en la primer columna


select  apellido_nombre + '-' + telefono + '-' + cast(fecha_nacimiento as varchar) as [datos Personales]
from Persona
where sexo ='f';

-- ejercicio 13
--. crear una consulta que muestre los gastos cuyos importes esten entre 10,00 y 100,00
select * from gasto
where importe between 10.00 and 100.00;

--. ejercicio 14
select * from persona
where fecha_nacimiento between '1960-1-1' and '1969-12-31'
order by fecha_nacimiento desc;


--. ejercicio 15
-- crear una consulta que muestre las localidades de las provincias de capital federal y buenos aires
--(1y2) ordenado alfabeticamente dentro cde cada provoncia 

select provincia_id , localidad_id, nombre from localidad

where provincia_id in (1,2)
order by provincia_id asc, nombre asc;

--. ejercicio 16
--crear una consulta que muestre los datos de los edficioos cuya direccion contenga la letran
-- en la posicion 5
select * from edificio
where direccion like '____N%';


--. crear una consulta para mostrar los 237 registros menos costosos


select top 237 * from gasto
order by importe asc;


--. ejercicio 18
--. sobre la consulta anteriro mostrar los repetidos
select top 237 with ties * from gasto
order by importe asc;

--. ejercicio 19 
--. crear una consulta que permita calcular un incremento del 15% para los gastos menores a 
--10000,10% para los que estan entre 10000 y 20000 y un 5% para el resto 
-- muestre la salida ordenada en forma decreciente por el importe 


select 
periodo,
fecha_pago,
importe,
case
when importe < 10000 then importe * 1.15
when importe between 10000 and 20000 then importe *1.10
else importe *1.05
end as [importe actualizado]
from gasto
order by importe desc;

--. ejercicio 20 
--. mostrar en una sola fila la cantidad de casados y solteros


select 
sum (case when estado_civil='c' then 1 else 0 end)as Casado,
sum(case when estado_civil ='s' then 1 else 0 end)as Soltero

from persona;

--. ejercicio 21
--.informar la suma total de gastos , la cantidad de gastos y el promedio del mismo
--. usar sum count y avg
select 
sum(importe) as sumatoria,
count(*) as cantidad,
avg(importe) as promedio
from gasto;
