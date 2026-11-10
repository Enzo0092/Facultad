use PracticaSerie3
-- 1 intentar eliminar directamenteel sector y analizar el resultado punto 1 y2
delete from Sector
where nombre='deposito';

-- como hay empleados que todavia tienen asignado este sector la operacion es rechazada por el motor de la base de dattos y arroja un error de conflicto con la clave foranea
-- si el motor lo permitiera esos empleados querdarian apuntando a una entidad fantasma rompiendo la integirdad referecial


-- punto 3
-- para poder borrar el sector, primero debebos liberar a los empleados que dependen de el, ya sea reubicandolos en otro sector o volviendo a su campo nulo si el modelo lo permite 
update Empleado
set codigo_sector =null
where codigo_sector=3;-- asumiento que el codigo deposito es el 3,

-- punto 4 
-- ahora que ningun empleado depende de ese sector la resctriccion ya no se viola y el comando se ejectua con exit
delete from Sector
where nombre='deposito';
-- por que el orden de las operaciones es relevante? 
-- el orden importa estrictamente debido a las reglas de preteccion de datos de la base de datos 
-- el motor sql server aplica una jerarquia logica: el registro padre(sector) no puede ser eliminado mientras existan registros hijos (empleado) vinculados a el , intentar borrar primero al padre provocara siempre un error de restriccion , por lo tanto la secuencia siempre desvincular  o reubicar a los hinos primeri y recien despues eliminar al padre
