import java.util.Scanner;

public class Secretaria
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("nombre de la escuela: ");
        String nombre = teclado.nextLine(); 
        
        System.out.println("domicilio: ");
        String domicilio = teclado.nextLine();
        
        System.out.println("nombre del director: ");
        String director = teclado.nextLine();
        
        Escuela escuela1 = new Escuela(nombre, domicilio, director);
        
        System.out.println("nombre del docente: ");
        String nombreDocente = teclado.nextLine(); 
        
        System.out.println("grado: ");
        String grado = teclado.nextLine(); 
        
        System.out.println("sueldo Basico: ");
        double sueldoBasico = teclado.nextDouble();
        
        System.out.println("Asignacion Familiar: ");
        double asignacionFamiliar = teclado.nextDouble();
        
        Docente docente1 = new Docente(nombreDocente, grado, sueldoBasico, asignacionFamiliar);
        
        escuela1.imprimirRecibo(docente1);
    }
}