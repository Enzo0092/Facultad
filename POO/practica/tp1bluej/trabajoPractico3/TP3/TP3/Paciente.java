/**
 * Representa los datos de un paciente.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Paciente
{
    //Atributos
    /**
     * Datos que representan la historia clinica, nombre, domicilio, 
     * localidad de nacimiento y localidad actual del paciente.
     */
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    //Constructor
    /**
     * Construye un objeto paciente con los datos indicados.
     *
     * @param p_historiaClinica historia clinica del paciente.
     * @param p_nombre nombre del paciente.
     * @param p_domicilio domicilio del paciente.
     * @param p_localidadNacido localidad natal del paciente.
     * @param p_localidadVive localidad actual del paciente.
     */    
    public Paciente(int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historiaClinica);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    //Metodos
    /**
     * Establece la historia clinica del paciente.
     *
     * @param p_historiaClinica historia clinica del paciente.
     */
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    
    /**
     * Establece el nombre del paciente.
     *
     * @param p_nombre nombre del paciente.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el domicilio del paciente.
     *
     * @param p_domicilio domicilio del paciente.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Establece la localidad natal del paciente.
     *
     * @param p_localidadNacido localidad natal del paciente.
     */
    private void setLocalidadNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    
    /**
     * Establece la localidad actual del paciente.
     *
     * @param p_localidadVive localidad actual del paciente.
     */
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
    /**
     * Obtiene la historia clinica del paciente.
     *
     * @return historia clinica.
     */
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    /**
     * Obtiene el nombre del paciente.
     *
     * @return nombre del paciente.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el domicilio del paciente.
     *
     * @return domicilio del paciente.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Obtiene la localidad natal del paciente.
     *
     * @return localidad natal del paciente.
     */
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    
    /**
     * Obtiene la localidad actual del paciente.
     *
     * @return localidad actual del paciente.
     */
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    /**
     * Muestra por pantalla los datos del paciente y la localidad donde vive.
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + " Historia Clínica: " + this.getHistoriaClinica() + " Domicilio: " + this.getDomicilio());
        System.out.println("Localidad: " + this.getLocalidadVive().getNombre() + " Provincia: " + this.getLocalidadVive().getProvincia());
    }
    
    /**
     * Genera una cadena con los datos del paciente y la localidad donde vive.
     *
     * @return cadena con los datos del paciente.
     */ 
    public String cadenaDeDatos(){
        return this.getNombre() + " …… " + this.getHistoriaClinica() + " ..… " + this.getDomicilio() + " - " 
        + this.getLocalidadVive().getNombre() + " - " + this.getLocalidadVive().getProvincia(); 
    }
}