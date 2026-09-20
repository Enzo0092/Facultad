import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase ejecutable para probar la clase Banco instanciando objetos Empleado 
 * y CuentaBancaria con las funcionalidades del Ejercicio 4.
 * 
 * @author Enzo Romero
 * @version 2.0 - 2026
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Instanciación de la Localidad
        Localidad localidad = new Localidad("Saladas", "Corrientes");

        // 2. Carga del primer empleado
        System.out.println("=== Carga del Empleado Inicial ===");
        System.out.print("Ingrese CUIL: ");
        long cuil1 = scanner.nextLong();
        scanner.nextLine(); // Limpieza de búfer

        System.out.print("Ingrese Apellido: ");
        String apellido1 = scanner.nextLine();

        System.out.print("Ingrese Nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese Sueldo Básico: ");
        double sueldoBasico1 = scanner.nextDouble();

        System.out.print("Ingrese Año de Ingreso: ");
        int anioIngreso1 = scanner.nextInt();

        Calendar fechaIngreso1 = new GregorianCalendar(anioIngreso1, Calendar.JANUARY, 1);
        Empleado emp1 = new Empleado(cuil1, apellido1, nombre1, sueldoBasico1, fechaIngreso1);

        // 3. Instanciación del Banco con el primer empleado obligatorio
        Banco banco = new Banco("Rio", localidad, 3, emp1);

        // 4. Carga de más empleados si el usuario lo desea
        System.out.print("\n¿Desea ingresar otro empleado? (s/n): ");
        char respuesta = scanner.next().toLowerCase().charAt(0);

        while (respuesta == 's') {
            System.out.println("\n=== Carga de Nuevo Empleado ===");
            System.out.print("Ingrese CUIL: ");
            long cuil = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Ingrese Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese Sueldo Básico: ");
            double sueldoBasico = scanner.nextDouble();

            System.out.print("Ingrese Año de Ingreso: ");
            int anioIngreso = scanner.nextInt();

            Calendar fechaIngreso = new GregorianCalendar(anioIngreso, Calendar.JANUARY, 1);
            Empleado empNuevo = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);
            
            banco.agregarEmpleado(empNuevo);

            System.out.print("\n¿Desea ingresar otro empleado? (s/n): ");
            respuesta = scanner.next().toLowerCase().charAt(0);
        }

        // =========================================================================
        // NUEVO: Carga e instanciación de Personas y Cuentas Bancarias (Punto 4)
        // =========================================================================

        // Creamos personas que serán los titulares
        Persona p1 = new Persona(25145698, "Gomez", "Marisa Esther",1);
        Persona p2 = new Persona(23145698, "Villalba", "Martín",2);
        Persona p3 = new Persona(30123456, "Zalazar", "Ernesto",3);

        // Creamos las cuentas bancarias (dos con saldo 0 y dos activas)
        // Marisa Gomez tiene 2 cuentas para validar que el HashSet no la duplique
        CuentaBancaria c1 = new CuentaBancaria(14526387, p1, 0.0);       // Saldo Cero
        CuentaBancaria c2 = new CuentaBancaria(23145698, p2, 0.0);       // Saldo Cero
        CuentaBancaria c3 = new CuentaBancaria(99887766, p1, 150000.0);  // Activa
        CuentaBancaria c4 = new CuentaBancaria(44556677, p3, 280000.0);  // Activa

        // Agregamos las cuentas al banco
        banco.agregarCuentaBancaria(c1);
        banco.agregarCuentaBancaria(c2);
        banco.agregarCuentaBancaria(c3);
        banco.agregarCuentaBancaria(c4);

        // 5. Impresión del reporte completo
        System.out.println("\n------------------------------------------------");
        banco.mostrar(); // Muestra lista de sueldos
        System.out.println("------------------------------------------------\n");

        // Impresión del Resumen de Cuentas Bancarias (Requerimiento de la imagen)
        banco.mostrarResumen();

        scanner.close();
    }
}