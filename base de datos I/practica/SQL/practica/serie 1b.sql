use base_consorcio_2025

--. ejercicio n1 
--. listar todas las personas nacidas en meses pares (febrero, abril, juniio)

select persona_id,apellido_nombre,fecha_nacimiento 
from persona
where MONTH(fecha_nacimiento) %2=0;
--. month(fecha_nacimiento) extrae el numero del mes del 1 al 12 a partir d ela fecha de nacimiento 


--. ejercicio n2 
--.mostrar los edificios cuuya direccion comienza con un numero 

select edificio_id, nombre,direccion from edificio
where direccion like '[0-9]%';

--. ejercicio n3 listar las personas que cumplen años en el mes actual 
select * from persona
where MONTH(fecha_nacimiento)=10;

--.ejercicio n4
--.listar personas con una longitud en apellido_nombre entre 20 y 25, ordenados
--. por la longitud en forma descendiente 

select persona_id,apellido_nombre,telefono ,len(apellido_nombre) as long_ayn from persona
where len (apellido_nombre) between 20 and 25 
order by len(apellido_nombre)desc;


--. ejercicio 5
--. crear una tabla auxiliar ( a partir de la tabla gasto ) con los gastos mayores a 50000

select *
into gasto_mayor 
from gasto
where importe> 50000;

--. ejercicio 6
--.mostrar odos los administradores indicando en una columna calculada
--. un mensaje condicional
select administrador_id,
case 
when vive_ahi='s' then 'residente'
when vive_ahi='n' then 'no residente'
else 'sin dato'
end as condicion_residencia
from administrador

--.ejercicio 7listar personas cuyo apellido contenta foble letra (ll o rr)

select persona_id, apellido_nombre 
from persona
where apellido_nombre like '%ll%' or apellido_nombre like '%rr%';


--. ejercicio 8 
--. mostrar los gastos pagados en un fin de semana (sabado o domingo )
select * from gasto
where DATENAME(dw,fecha_pago) in ( 'saturday','sunday');


--. ejercicio 9
--. mostrar los gastos del primer trimestre  (enero a marzo) cuyo importe sea manyo a 20.000y que
--.ademas no hayan sido pagados en fin de seamana

select gasto_id,fecha_pago,importe ,
datename(dw,fecha_pago)as[dia de la semana]
from gasto
where MONTH(fecha_pago) between 1 and 3
and importe> 20000
and datename(dw, fecha_pago) not in('saturday','sunday');


--. ejercicio 10 mostrar las personas que ete año cumplen 30 años exacttos
select * from persona
where datediff(year,fecha_nacimiento,'2017-01-01')=30;

--.ejercicio 11
