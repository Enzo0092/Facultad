import java.util.ArrayList;

/**
 * Representa una facultad con su nombre y una nómina de profesores.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Facultad
{
    //Atributos
    /**
     * Nombre de la facultad.
     */
    private String nombre;

    /**
     * Lista de profesores de la facultad.
     */
    private ArrayList<Profesor> profesores;

    //Constructor
    /**
     * Construye una facultad con un nombre y una lista de profesores.
     *
     * @param p_nombre nombre de la facultad
     * @param p_profesores lista de profesores
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores)
    {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }

    //Metodos
    /**
     * Establece el nombre de la facultad.
     *
     * @param p_nombre nombre de la facultad
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Establece la lista de profesores de la facultad.
     *
     * @param p_profesores lista de profesores
     */
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }

    /**
     * Obtiene el nombre de la facultad.
     *
     * @return nombre de la facultad
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la lista de profesores de la facultad.
     *
     * @return lista de profesores
     */
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }

    /**
     * Muestra la nómina de profesores y el total a pagar.
     */
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: FaCENA");
        System.out.println("------------------------------------------------------------------");
        for(Profesor profesor : this.getProfesores()){
            profesor.mostrarLinea();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a pagar: " + this.totalAPagar());
    }

    /**
     * Calcula el total a pagar a todos los profesores.
     *
     * @return suma de los sueldos totales de los profesores
     */
    public double totalAPagar(){
        double total = 0;

        for(Profesor profesor : this.getProfesores()){
            total = total + profesor.sueldoTotal();
        }

        return total;
    }

    /**
     * Muestra los profesores y los cargos que desempeñan.
     */
    public void listarProfesorCargos(){
        System.out.println("***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
        System.out.println("------------------------------------------------------------------");
        for(Profesor profesor : this.getProfesores()){
            profesor.mostrar();
        }
    }
}