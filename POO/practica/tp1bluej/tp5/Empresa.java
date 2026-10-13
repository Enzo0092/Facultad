/**
 * clase ejecutable que instancia objetos de tipo persona y objetos de tipo empleado
 * 
 */
import java.util.Calendar; 
public class Empresa{
    public static void main(String []args){
        Persona persona1 =new Persona(16300500,"Dario","Perez", 1986);
        Calendar fecha= Calendar.getInstance();
        fecha.set(2013,Calendar.MARCH, 15);
        Empleado empleado1 =new Empleado(16300500,"Dario","Perez", 1986,20163005004L,1000, fecha);
        persona1.mostrar();
        empleado1.mostrar();
    }
}