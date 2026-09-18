import java.util.Scanner;
import java.util.Calendar;

public class EjecutableEmpleadoConJefe
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese cuil del jefe: ");
        long cuilJefe = teclado.nextLong();

        System.out.println("Ingrese apellido del jefe: ");
        String apellidoJefe = teclado.next();

        System.out.println("Ingrese nombre del jefe: ");
        String nombreJefe = teclado.next();

        System.out.println("Ingrese sueldo basico del jefe: ");
        double sueldoJefe = teclado.nextDouble();

        System.out.println("Ingrese año de ingreso del jefe: ");
        int anioJefe = teclado.nextInt();

        EmpleadoConJefe jefe = new EmpleadoConJefe(cuilJefe, apellidoJefe, nombreJefe, sueldoJefe, anioJefe);

        System.out.println("Ingrese cuil del empleado: ");
        long cuil = teclado.nextLong();

        System.out.println("Ingrese apellido del empleado: ");
        String apellido = teclado.next();

        System.out.println("Ingrese nombre del empleado: ");
        String nombre = teclado.next();

        System.out.println("Ingrese sueldo basico del empleado: ");
        double sueldoBasico = teclado.nextDouble();

        System.out.println("Ingrese año de ingreso: ");
        int anio = teclado.nextInt();

        System.out.println("Ingrese mes de ingreso: ");
        int mes = teclado.nextInt();

        System.out.println("Ingrese dia de ingreso: ");
        int dia = teclado.nextInt();

        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(anio, mes - 1, dia);

        EmpleadoConJefe empleado = new EmpleadoConJefe(cuil, apellido, nombre, sueldoBasico, fechaIngreso, jefe);

        empleado.mostrarPantalla();

        System.out.println();
        System.out.println("Permiso de salida: el empleado puede retirarse 1 hora antes.");
        System.out.println("Firmado por: " + empleado.getJefe().apeYnom());
    }
}