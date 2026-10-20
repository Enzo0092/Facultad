/**
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
import java.util.Scanner;

public class Escuela{
    public static void main(String args[]){
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
        
        //Alumno
        System.out.println("ingrese Libreta Universitaria: ");
        int lu = scanner.nextInt();
        
        Alumno alumno1 = new Alumno(lu, dni, nombre, apellido, anio);
        
        //Se muestran los datos
        persona1.mostrar();
        alumno1.mostrar();
    }
}    