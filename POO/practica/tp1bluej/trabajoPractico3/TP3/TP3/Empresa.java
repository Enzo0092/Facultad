import java.util.Scanner;
import java.util.Calendar;

public class Empresa
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

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

        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico, fechaIngreso);

        if(empleado1.esAniversario()){
            System.out.println("Permiso de salida: el empleado puede retirarse 1 hora antes.");
        }
    }
}