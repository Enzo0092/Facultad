/**
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
import java.util.Scanner;
import java.util.ArrayList;
public class AdministracionGerencia
{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        //Hotel
        System.out.println("Ingrese el nombre del hotel: ");
        String nombreHotel = teclado.next();
        
        System.out.println("Ingrese el tipo de habitacion: ");
        String tipoHabitacion = teclado.next();
        
        System.out.println("Ingrese el precio base: ");
        double precioBase = teclado.nextDouble();
        
        System.out.println("Ingrese la cantidad de dias de estadia: ");
        int diasEstadia = teclado.nextInt();
        
        Servicio internet = new Servicio("internet", 5.0);
        Servicio lavanderia = new Servicio("lavanderia", 20.0);
        
        ArrayList<Servicio> serviciosHotel = new ArrayList<Servicio>(); //Uso de ArrayList en el ejecutable
        
        serviciosHotel.add(internet);
        serviciosHotel.add(lavanderia);
        
        Hotel hotel1 = new Hotel(tipoHabitacion, nombreHotel, precioBase, diasEstadia, serviciosHotel);
        
        //Cabaña
        System.out.println("Ingrese el nombre del cabaña: ");
        String nombreCabaña = teclado.next();
        
        System.out.println("Ingrese habitaciones: ");
        int habitaciones = teclado.nextInt();
        
        System.out.println("Precio base: ");
        double precioBaseC = teclado.nextDouble();
        
        System.out.println("Ingrese dias de alquiler: ");
        int diasAlquiler = teclado.nextInt();
        
        Servicio alquilerAuto = new Servicio("alquilerAuto", 100.0);
        
        ArrayList<Servicio> serviciosCabaña = new ArrayList<Servicio>();
        
        serviciosCabaña.add(alquilerAuto);
        serviciosCabaña.add(lavanderia);
        
        Cabaña cabaña1 = new Cabaña(habitaciones, nombreCabaña, precioBaseC, diasAlquiler, serviciosCabaña);
        
        //ArrayList alojamiento
        ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        
        alojamientos.add(hotel1);
        alojamientos.add(cabaña1);
        
        //Gerencia
        System.out.println("Ingresar nombre de Gerencia: ");
        String nombreGerencia = teclado.next();
        
        Gerencia gerencia = new Gerencia(nombreGerencia, alojamientos);
        
        gerencia.mostrarLiquidacion();
    }
}