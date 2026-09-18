/**
 * Representa una localidad y la provincia a la que pertenece.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Localidad
{
    //Atributos
    /**
     * Datos que representan el nombre de la localidad y la provincia a la que pertenece.
     */
    private String nombre;
    private String provincia;
    
    //Constructor
    /**
     * Construye un objeto docente con los datos indicados.
     *
     * @param p_nombre nombre de la localidad.
     * @param p_provincia provincia de la localidad.
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    //Metodos
    /**
     * Establece el nombre de la localidad.
     *
     * @param p_nombre nombre de la localidad.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el nombre de la provincia.
     *
     * @param p_provincia nombre de la provincia.
     */
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    /**
     * Obtiene el nombre de la localidad.
     *
     * @return nombre de la localidad
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el nombre de la provincia.
     *
     * @return nombre de la provincia
     */
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Retorna los datos de localidad.
     *
     * @return nombre de la localidad y provincia.
     */
    public String mostrar(){
        return "Localidad : " + this.getNombre() + " Provincia: " + this.getProvincia();
    }
}