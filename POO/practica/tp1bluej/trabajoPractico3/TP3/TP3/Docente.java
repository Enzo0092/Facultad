/**
 * Representa un docente y su sueldo.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Docente
{
    //Atributos
    /**
     * Datos que representan el nombre, grado, sueldo básico y asignación familiar del docente.
     */
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar; 
    
    //Constructor
    /**
     * Construye un docente con los datos indicados.
     *
     * @param p_nombre nombre del docente.
     * @param p_grado grado del docente.
     * @param p_sueldoBasico sueldo básico del docente.
     * @param p_asignacionFamiliar asignación familiar del docente.
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    } 

    //Metodos
    /**
     * Establece el nombre del docente.
     *
     * @param p_nombre nombre del docente.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el grado del docente.
     *
     * @param p_grado grado del docente.
     */
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    /**
     * Establece el Sueldo Basico del docente.
     *
     * @param p_sueldoBasico Sueldo Basico del docente.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    
    /**
     * Establece el Asignacion Familiar del docente.
     *
     * @param p_asignacionFamiliar Asignacion Familiar del docente.
     */
    private void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar = p_asignacionFamiliar;
    }
    
    /**
     * Obtiene el nombre del docente.
     *
     * @return nombre del docente.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el grado del docente.
     *
     * @return grado del docente.
     */
    public String getGrado(){
        return this.grado;
    }
    
    /**
     * Obtiene el sueldo basico del docente.
     *
     * @return sueldo basico del docente.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * Obtiene la asignacion familiar del docente.
     *
     * @return asignacion familiar del docente.
     */
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    
    /**
     * Calcula el sueldo total del docente sumando el sueldo básico y la asignación familiar.
     *
     * @return sueldo total del docente.
     */
    public double calcularSueldo(){
        return this.sueldoBasico + this.asignacionFamiliar;
    }
}