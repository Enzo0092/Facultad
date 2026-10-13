/**
 * clase ejecutable donde se instancian objetos de tipo alumno
 * @author enzo romero
 * @version 1.0
 */
public class Escuela {
    public static void main (String []args){
        
    // Instanciamos una Persona común para verificar el mostrar() base
        Persona p1 = new Persona(25365902, "Maria", "Lopez", 1985);
        System.out.println("-- mostrando persona---");
        p1.mostrar();
        //intanciamos objetos de tipo alumno
        Alumno al1= new Alumno( 41948148, "Enzo", "romero", 1999, 57630, 9.00,1.00);
        System.out.println("--- mostrando alumno---");
        al1.mostrar();
    }
}