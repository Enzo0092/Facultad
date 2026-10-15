/**
 * clase facultad
 * @author Enzo Romero
 * @author Morales Francisco
 * @version 1.0
 * 
 */
import java.util.ArrayList;
public class Facultad{
    private String nombre;
    private ArrayList <Profesor> profesores;
    /**
     * constructor de la clase , recibe la lista con elementos ya 
     * @param nombre de tipo string 
     * @param profesores de tipo ArrayList
     * 
     */
    public Facultad (String p_nombre, ArrayList<Profesor> p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
        
    }
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor> ());
        this.agregarProfesor(p_profesor);
    }
    //accesors
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    private void setProfesores( ArrayList<Profesor> p_profesores){
        this.profesores=p_profesores;
    }
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    //metodos de manejo de listas para controlar cardinalidad
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    public boolean quitarProfesor(Profesor p_profesor){
        if(this.getProfesores().size() >1 ){
            return this.getProfesores().remove(p_profesor);
        }
        return false; // no permite borrarlo si es el unico profesor que queda
    }
    //metodos de la clase
    public double totalAPagar(){
        double total=0.0;
        for(Profesor unProfesor: this.getProfesores()){
            total= total + unProfesor.sueldoTotal();
        }
        return total;
    }
    public void nominaProfesores(){
        System.out.println("********** Nomina Facultdad:"+this.getNombre());
        System.out.println("----------------------------------");
        
        for(Profesor unProfesor: this.getProfesores()){
        System.out.println(unProfesor.mostrarLinea());
        }
        System.out.println("-----------------------------");
        System.out.println("Total a pagar : $" + this.totalAPagar()); 
     
    }
    public void listarProfesorCargos(){
    
        System.out.println("***** Detalle de Profesores y cargos de Facultad: " + this.getNombre() + " *****");
        System.out.println("---------------------------------------------------------------------------------");
        for(Profesor unProfesor: this.getProfesores()){
            unProfesor.mostrar();
            System.out.println("\n---------------- **** ----------------");
            
        }
        System.out.println("------------------------------------");
        System.out.println(" Hay" +this.getProfesores().size()+ "profesores");
    }
}