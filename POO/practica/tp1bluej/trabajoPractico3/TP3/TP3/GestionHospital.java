import java.util.Scanner;

public class GestionHospital{  
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del hospital: ");
        String nombreHospital = teclado.next(); 
        
        System.out.println("Ingrese el nombre del director: ");
        String nombreDirector = teclado.next();
        
        Hospital hospital1 = new Hospital(nombreHospital, nombreDirector);
        
        System.out.println("Ingrese nombre de la localidad de nacimiento: ");
        String localidad = teclado.next();
        
        System.out.println("Ingrese nombre de la provincia de nacimiento: ");
        String provincia = teclado.next();
        
        Localidad localidad1 = new Localidad(localidad, provincia);
        
        System.out.println("Ingrese nombre de la localidad actual: ");
        String localidadNatal = teclado.next();
        
        System.out.println("Ingrese nombre de la provincia actual: ");
        String provinciaActual = teclado.next();
        
        Localidad localidad2 = new Localidad(localidadNatal, provinciaActual);
        
        System.out.println("Ingrese Historia Clinica del paciente: ");
        int historiaClinica = teclado.nextInt();
        
        System.out.println("Ingrese nombre del paciente: ");
        String nombre = teclado.next();
        
        System.out.println("Ingrese domicilio del paciente: ");
        String domicilio = teclado.next();
        
        Localidad localidadNacido = localidad1;
        Localidad localidadVive = localidad2;
        
        Paciente paciente1 = new Paciente(historiaClinica, nombre, domicilio, localidad1, localidad2);
        
        hospital1.consultaDatosFiliatorios(paciente1);
        
    }
}