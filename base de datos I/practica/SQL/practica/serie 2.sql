use base_consorcio_2025
--. listar las personas cuyo numero de telefono noesta informado a mostar las que si lo tienen cargado

select persona_id,apellido_nombre, telefono from persona
where telefono is null;


-- informados coon datos 
select persona_id,apellido_nombre,telefono from persona
where telefono is not null;


.--. ejercicio nro 4 
--. mostrar las personas reemplazando los valores nulos del nombre y telefono por texto

select persona_id , isnull (apellido_nombre,'(sin dato)') as apellido_nombre, isnull(telefono, '(sin dato)' ) as telefono 
from persona;
--Explicación (2 líneas): La función ISNULL(columna, valor_alternativo) evalúa si el dato es nulo; en caso afirmativo, devuelve el texto de reemplazo para evitar celdas vacías en el reporte.


--3 ejercicio n10 diferencia entre count (*)  y count (columna)
-- enunciado mostrar la cantidad total de gastos y la cantidad de importes no nulos
-- verificando la diferencia entre ambos conteos
select 
count (*) as total_registros,
count(importe) as registros_con_importe_noNULO
from gasto;
--Explicación (2 líneas): COUNT(*) cuenta la totalidad de las filas de la tabla sin importar si tienen nulos, mientras que COUNT(columna) saltea y omite automáticamente todos los registros que contengan NULL.

--4 ejercicio n 20ordenamiento con valores nulos order by
--. enunciado listar las presonas ordenadno primero aquellas con telefono cargado y al final las que tienen valor nulo

select persona_id,apellido_nombre,telefono
from persona
order by telefono desc;
--Explicación (2 líneas): En SQL Server los NULL son tratados como el valor más pequeño posible; por lo tanto, en un orden ascendente (ASC) aparecen primeros, y en uno descendente (DESC) se van al final de todo.


