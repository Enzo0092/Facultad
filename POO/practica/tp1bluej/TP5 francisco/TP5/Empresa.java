/**
 * @author Francisco Morales
 * @version 1.0 - 2026
**/
import java.util.Scanner;
import java.util.Calendar;

public class Empresa{
    static void main(String args[]){
        Scanner scanner= new Scanner (System.in);
        
        //Persona
        System.out.println("ingrese DNI:");
        int dni = scanner.nextInt();
        
        System.out.println("ingrese Nombre:");
        String nombre = scanner.next();
        
        System.out.println("ingrese Apellido:");
        String apellido = scanner.next();
        
        System.out.println("ingrese Año de nacimiento:");
        int anio = scanner.nextInt();
        
        Persona persona1 = new Persona(dni, nombre, apellido, anio);
        
        //Empleado 
        
        System.out.println("Ingrese cuil del empleado: ");
        long cuil = scanner.nextLong();
        
        System.out.println("Ingrese el sueldo basico: ");
        double sueldoB = scanner.nextDouble();
        
        System.out.println("Ingrese año de ingreso: ");
        int anioIngreso = scanner.nextInt();

        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(Calendar.YEAR, anioIngreso);
        
        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoB, fechaIngreso, dni, anio);
        
        persona1.mostrar();
        empleado1.mostrar(); 
    }
}