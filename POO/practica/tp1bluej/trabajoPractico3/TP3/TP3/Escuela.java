/**
 * Representa una escuela que puede emitir recibos de sueldo de sus docentes..
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Escuela
{
    //Atributos
    /**
     * Datos que representan el nombre, domicilio y director de la escuela.
     */
    private String nombre;
    private String domicilio;
    private String director;
    
    //Constructor
    /**
     * Construye una escuela con el nombre, domicilio y director indicados.
     *
     * @param p_nombre nombre de la escuela.
     * @param p_domicilio domicilio de la escuela.
     * @param p_director director de la escuela.
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //Metodos
    /**
     * Establece el nombre de la escuela.
     *
     * @param p_nombre nombre de la escuela.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el domicilio de la escuela..
     *
     * @param p_domicilio domicilio de la escuela.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Establece el director de la escuela.
     *
     * @param p_director director de la escuela.
     */
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    /**
     * Obtiene el nombre de la escuela.
     *
     * @return nombre de la escuela.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el domicilio de la escuela.
     *
     * @return domicilio de la escuela.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Obtiene el nombre del director de la escuela.
     *
     * @return nombre del director de la escuela.
     */
    public String getDirector(){
        return this.director;
    }
    
    /**
     * Imprime el recibo de sueldo de un docente.
     *
     * @param p_docente docente cuyo recibo se desea imprimir.
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + " Domicilio: " + this.getDomicilio() + " Director: " + this.getDirector());
        System.out.println("--------------------------------------------------------");
        System.out.println("Docente:........................." + p_docente.getNombre());
        System.out.println("Sueldo:.........................." + p_docente.calcularSueldo()); 
        System.out.println("Sueldo Basico...................." + p_docente.getSueldoBasico());
        System.out.println("Asignacion familiar.............." + p_docente.getAsignacionFamiliar());
    }
}