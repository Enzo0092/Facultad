import java.util.Scanner;

/**
 * Clase ejecutable para probar la clase Empleado usando ingreso por teclado.
 * 
 * @author Enzo Romero
 */
public class EjecutableEmpleado {

    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer desde la consola
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== INGRESO DE DATOS DEL EMPLEADO ===");

        // 1. CUIL (long)
        System.out.print("Ingrese el CUIL (sin guiones): ");
        long cuil = teclado.nextLong();
        teclado.nextLine(); // Limpieza del buffer de entrada

        // 2. Apellido (String)
        System.out.print("Ingrese el Apellido: ");
        String apellido = teclado.nextLine();

        // 3. Nombre (String)
        System.out.print("Ingrese el Nombre: ");
        String nombre = teclado.nextLine();

        // 4. Sueldo Básico (double)
        System.out.print("Ingrese el Sueldo Básico: ");
        double sueldoBasico = teclado.nextDouble();

        // 5. Año de Ingreso (int)
        System.out.print("Ingrese el Año de Ingreso a la empresa: ");
        int anioIngreso = teclado.nextInt();

        // Instanciamos el objeto con las variables ingresadas por teclado
        Empleado unEmpleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);

        // Mostramos el resultado
        System.out.println("\n----------------------------------------");
        unEmpleado.mostrar();
        System.out.println("\nLínea de resumen:");
        System.out.println(unEmpleado.mostrarLinea());
        System.out.println("----------------------------------------");

        // Cerramos el scanner
        teclado.close();
    }
}