/**
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionFacultad
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        
        System.out.println("Ingrese cantidad de profesores:");
        int cantidadProfesores = teclado.nextInt();
        
        int contador = 0;
        
        while(contador < cantidadProfesores){
            System.out.println("\n--- Datos del Profesor ---");
            
            System.out.println("DNI:");
            int dni = teclado.nextInt();
            
            System.out.println("Nombre:");
            String nombre = teclado.next();
            
            System.out.println("Apellido:");
            String apellido = teclado.next();
            
            System.out.println("Año de nacimiento:");
            int anio = teclado.nextInt();
            
            System.out.println("Titulo:");
            String titulo = teclado.next();
            
            System.out.println("Cantidad de cargos (1 a 3):");
            int cantidadCargos = teclado.nextInt();
            
            ArrayList<Cargo> cargos = new ArrayList<Cargo>();
            
            int contadorCargo = 0;
            
            while(contadorCargo < cantidadCargos){
                System.out.println("\n--- Datos del Cargo ---");
                System.out.println("1 - Simple");
                System.out.println("2 - SemiExclusivo");
                System.out.println("3 - Exclusivo");
                int tipo = teclado.nextInt();
                
                System.out.println("Nombre del cargo:");
                String nombreCargo = teclado.next();
                
                System.out.println("Sueldo basico:");
                double sueldoBasico = teclado.nextDouble();
                
                System.out.println("Año de ingreso:");
                int anioIngreso = teclado.nextInt();
                
                System.out.println("Horas de docencia:");
                int horasDocencia = teclado.nextInt();
                
                if(tipo == 1){
                    Cargo cargo = new Cargo(nombreCargo, sueldoBasico, anioIngreso, horasDocencia);
                    cargos.add(cargo);
                }
                else if(tipo == 2){
                    System.out.println("Horas de investigacion:");
                    int horasInvestigacion = teclado.nextInt();
                    
                    SemiExclusivo cargo = new SemiExclusivo(horasInvestigacion, nombreCargo, sueldoBasico, anioIngreso, horasDocencia);
                    cargos.add(cargo);
                }
                else if(tipo == 3){
                    System.out.println("Horas de investigacion:");
                    int horasInvestigacion = teclado.nextInt();
                    
                    System.out.println("Horas de extension:");
                    int horasExtension = teclado.nextInt();
                    
                    Exclusivo cargo = new Exclusivo(horasInvestigacion, horasExtension, nombreCargo, sueldoBasico, anioIngreso, horasDocencia);
                    cargos.add(cargo);
                }
                
                contadorCargo++;
            }
            
            Profesor profesor = new Profesor(titulo, cargos, dni, nombre, apellido, anio);
            profesores.add(profesor);
            
            contador++;
        }
        
        Facultad facultad = new Facultad("FaCENA", profesores);
        
        System.out.println("\n");
        facultad.listarProfesorCargos();
        
        System.out.println("\n");
        facultad.nominaProfesores();
    }
}