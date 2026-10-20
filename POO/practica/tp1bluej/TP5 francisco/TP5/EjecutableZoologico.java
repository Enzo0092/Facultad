/**
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;

public class EjecutableZoologico
{
    public static void main(String args[]){
         Scanner teclado = new Scanner(System.in);
         
         ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
         
         Zoologico zoologico = new Zoologico("El Caribú", visitantes);
         
         //Persona 1
         System.out.println("Ingrese DNI del visitante: ");
         int dni1 = teclado.nextInt();
         
         System.out.println("Ingrese nombre del visitante: ");
         String nombreP1 = teclado.next();
         
         System.out.println("Ingrese apellido del visitante: ");
         String apellidoP1 = teclado.next();
         
         //Fecha de Persona
         System.out.println("Ingresar dia de nacimiento: ");
         int dia = teclado.nextInt();
         
         System.out.println("Ingresar mes de nacimiento: ");
         int mes = teclado.nextInt();
         
         System.out.println("Ingresar año de nacimiento: ");
         int anio = teclado.nextInt();
         
         Calendar fechaN = Calendar.getInstance();
         fechaN.set(anio, mes - 1, dia);
         
         Persona persona = new Persona(dni1, nombreP1, apellidoP1, fechaN);
         
         //Persona2
         System.out.println("Ingrese DNI del visitante: ");
         int dni2 = teclado.nextInt();
         
         System.out.println("Ingrese nombre del visitante: ");
         String nombreP2 = teclado.next();
         
         System.out.println("Ingrese apellido del visitante: ");
         String apellidoP2 = teclado.next();
         
         System.out.println("Ingresar dia de nacimiento: ");
         int dia2 = teclado.nextInt();
         
         System.out.println("Ingresar mes de nacimiento: ");
         int mes2 = teclado.nextInt();
         
         System.out.println("Ingresar año de nacimiento: ");
         int anio2 = teclado.nextInt();
         
         Calendar fechaN2 = Calendar.getInstance();
         fechaN2.set(anio2, mes2 - 1, dia2);
         
         Persona persona2 = new Persona(dni2, nombreP2, apellidoP2, fechaN2);
         
         //Persona3
         System.out.println("Ingrese DNI del visitante: ");
         int dni3 = teclado.nextInt();
         
         System.out.println("Ingrese nombre del visitante: ");
         String nombreP3 = teclado.next();
         
         System.out.println("Ingrese apellido del visitante: ");
         String apellidoP3 = teclado.next();
         
         System.out.println("Ingresar dia de nacimiento: ");
         int dia3 = teclado.nextInt();
         
         System.out.println("Ingresar mes de nacimiento: ");
         int mes3 = teclado.nextInt();
         
         System.out.println("Ingresar año de nacimiento: ");
         int anio3 = teclado.nextInt();
         
         Calendar fechaN3 = Calendar.getInstance();
         fechaN3.set(anio3, mes3 - 1, dia3);
         
         Persona persona3 = new Persona(dni3, nombreP3, apellidoP3, fechaN3);
         
         //Individuo 1
         System.out.println("Ingrese nombre del visitante: ");
         String nombre1 = teclado.next();
         
         Calendar fecha = Calendar.getInstance();
         fecha.set(2024, Calendar.SEPTEMBER, 22);
         
         Individuo individuo1 = new Individuo( persona, nombre1, fecha);
         
         //Individuo 2
         System.out.println("Ingrese nombre del visitante: ");
         String nombre2 = teclado.next();
         
         Individuo individuo2 = new Individuo( persona2, nombre2, fecha);
         
         //Individuo 3
         System.out.println("Ingrese nombre del visitante: ");
         String nombre3 = teclado.next();
         
         Individuo individuo3 = new Individuo(persona3, nombre3, fecha);
         
         //Delegacion
         ArrayList<Individuo> integrantes = new ArrayList<Individuo>();
         
         integrantes.add(individuo2);
         integrantes.add(individuo3);
         
         Delegacion delegacion = new Delegacion(integrantes , "PAMI", fecha);
         
         zoologico.nuevoVisitante(individuo1);
         zoologico.nuevoVisitante(delegacion);
         
         //Listar por fecha
         zoologico.listarVisitantePorFecha(fecha);
         
         //recaudacion del ultimo mes
         Calendar desde = Calendar.getInstance();
         desde.set(2024, Calendar.SEPTEMBER, 1);

         Calendar hasta = Calendar.getInstance();
         hasta.set(2024, Calendar.SEPTEMBER, 30);
         
         System.out.println(zoologico.recaudacion(desde, hasta));
         
         //Listar Delegaciones que asistieron el dia 22/09/2024
         zoologico.listarTipoVisitantePorFecha(fecha, "Delegacion");
        
    }
}