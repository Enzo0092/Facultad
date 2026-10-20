import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Representa a una persona y sus datos.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Persona
{
    //atributos
    /**
     * Numero de DNI de la persona.
     */
    private int nroDni;
    /**
     * Nombre de la Persona.
     */
    private String nombre;
    /**
     * Apellido de la persona.
     */
    private String apellido;
    /**
     * Fecha de nacimiento de la persona.
     */
    private Calendar fechaNacimiento;
    
    //constructor
    /**
     * Constructor de la clase Persona utilizando el año de nacimiento.
     *
     * @param p_dni DNI de la persona.
     * @param p_nombre Nombre de la persona.
     * @param p_apellido Apellido de la persona.
     * @param p_anio Año de nacimiento de la persona.
     */    
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
    * Constructor de la clase Persona utilizando la fecha de nacimiento.
    *
    * @param p_dni DNI de la persona.
    * @param p_nombre Nombre de la persona.
    * @param p_apellido Apellido de la persona.
    * @param p_fecha Fecha de nacimiento de la persona.
    */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    //metodos
    /**
     * Establece el DNI de la persona.
     *
     * @param p_dni DNI de la persona.
     */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    
    /**
     * Establece el nombre de la persona.
     *
     * @param p_nombre Nombre de la persona.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el apellido de la persona.
     *
     * @param p_apellido Apellido de la persona.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido; 
    }
    
    /**
      * Establece el año de nacimiento de la persona.
       *
       * @param p_anio Año de nacimiento de la persona.
       */
    private void setAnioNacimiento(int p_anio){
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, p_anio);
        this.fechaNacimiento = fecha;
    }
 
    /**
    * Establece la fecha de nacimiento de la persona.
    *
    * @param p_fecha Fecha de nacimiento de la persona.
    */
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    /**
     * Obtiene el numero de DNI de la persona.
     *
     * @return numero de DNI de la persona.
     */
    public int getDNI(){
        return this.nroDni; 
    }
    
    /**
     * Obtiene el Nombre de la persona.
     *
     * @return nombre de la persona.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el Apellido de la persona.
     *
     * @return apellido de la persona.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene el Año de Nacimiento de la persona.
     *
     * @return Año de Nacimiento de la persona.
     */
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return Fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Obtiene la Edad de la persona.
     *
     * @return Edad de la persona.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    /**
     * Obtiene el nombre y apellido de la persona en formato textual.
     *
     * @return nombre y apellido de la persona.
     */
    public String nomYApe(){
        return this.nombre + " " + this.apellido;
    }
    
    /**
     * Obtiene el apellido y nombre de la persona en formato textual.
     *
     * @return apellido y nombre de la persona.
     */
    public String apeYNom(){
        return this.apellido + " " + this.nombre;
    }
    
    /**
     * Muestra los datos de la persona.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nombre + " " + this.apellido);
        System.out.println("DNI: " + this.nroDni + " Edad: " + this.edad() + " años");
    }
    
    /**
     * Comprueba si el día actual es el cumpleaños de la persona.
     *
     * @return true si es el cumpleaños de la persona, false en caso contrario.
     */
    public boolean esCumpleaños(){
        Calendar hoy = Calendar.getInstance();
    
        return hoy.get(Calendar.MONTH) == this.fechaNacimiento.get(Calendar.MONTH)
        && hoy.get(Calendar.DAY_OF_MONTH) == this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
   }
}