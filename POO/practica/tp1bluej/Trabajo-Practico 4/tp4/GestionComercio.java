 import java.util.Calendar;
/**
 * Clase ejecutable para probar la gestión de empleados en el Comercio.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class GestionComercio {

    public static void main(String[] args) {
        // 1. Instanciar el comercio
        Comercio comercio = new Comercio("Avanti SRL");
       

// Creamos un objeto Calendar y le asignamos el año de ingreso
    Calendar fecha1 = Calendar.getInstance();
    fecha1.set(Calendar.YEAR, 2026); //  

        // 2. Instanciar empleados
        Empleado e1 = new Empleado(30100623L, "Gonzalez", "Juan", 102750.00,fecha1);
        Empleado e2 = new Empleado(37045987L, "Martinez", "Mercedes", 100719.00,fecha1);
        Empleado e3 = new Empleado(32550096L, "Gomez", "Virginia", 150120.00,fecha1);

        // 3. Contratar (dar de alta) a los empleados
        comercio.altaEmpleadoo(e1);
        comercio.altaEmpleadoo(e2);
        comercio.altaEmpleadoo(e3);

        // 4. Emitir la nómina por pantalla
        comercio.nomina();

        // 5. Verificación de funcionalidades
        System.out.println("\n--- Pruebas de funcionalidad ---");
        System.out.println("Cantidad total de empleados: " + comercio.cantidadDeEmpleados());
        System.out.println("¿Existe el CUIL 37045987L?: " + comercio.esEmpleado(37045987L));

        // Consultar sueldo neto por CUIL
        comercio.sueldoNeto(32550096L);

        // Dar de baja a un empleado y verificar
        System.out.println("\nSe da de baja al empleado con CUIL 37045987L...");
        comercio.bajaEmpleado(37045987L);
        System.out.println("¿Existe el CUIL 37045987L tras la baja?: " + comercio.esEmpleado(37045987L));
        System.out.println("Nueva cantidad de empleados: " + comercio.cantidadDeEmpleados());
    }
}