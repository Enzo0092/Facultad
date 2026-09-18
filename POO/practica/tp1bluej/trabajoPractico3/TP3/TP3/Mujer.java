/**
 * Representa a una mujer con sus datos personales y estado civil.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Mujer
{
    //Atributos
    /**
     * Datos que representan nombre, apellido, edad, estado civil y esposo de la mujer.
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    //Constructores
    /**
     * Constructor de la clase mujer.
     *
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }
    
    /**
     *Constructor de la clase Mujer con esposo.
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     * @param p_esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        this.setEstadoCivil("Casada");
    }

    //Metodos
    /**
     * Establece el nombre de la mujer.
     *
     * @param p_nombre nombre de la mujer.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el apellido de la mujer.
     *
     * @param p_apellido apellido de la mujer.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Establece la edad de la mujer.
     *
     * @param p_edad edad de la mujer.
     */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    /**
     * Establece estado civil de la mujer.
     *
     * @param p_estadoCivil estado civil de la mujer.
     */
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    
    /**
     * Establece el esposo de la mujer.
     *
     * @param p_esposo esposo de la mujer.
     */
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    
    /**
     * Obtiene el nombre de la mujer.
     *
     * @return nombre de la mujer.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el apellido de la mujer.
     *
     * @return apellido de la mujer.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene la edad de la mujer.
     *
     * @return edad de la mujer.
     */
    public int getEdad(){
        return this.edad;
    }
    
    /**
     * Obtiene Estado Civil de la mujer.
     *
     * @return Estado Civil.
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    /**
     * Obtiene esposo de la mujer.
     *
     * @return esposo de la mujer.
     */
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    /**
     * Casa a la mujer con el hombre indicado y cambia su estado civil a Casada.
     *
     * @param p_hombre hombre con el que se casa la mujer.
     */
    public void casarseCon(Hombre p_hombre){
        this.esposo = p_hombre; 
        this.estadoCivil = "Casada";
    }
    
    /**
     * Divorcia a la mujer, elimina la referencia a su esposo y cambia su estado civil a Divorciada.
     */
    public void divorcio(){
        this.esposo = null;
        this.estadoCivil = "Divorciada";
    }
    
    /**
     * Obtiene los datos personales de la mujer en formato textual.
     * 
     * @return Nombre, apellido y edad de la mujer.
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Muestra los datos de la mujer junto con su estado civil.
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años - " 
        + this.getEstadoCivil());
    }
    
    /**
     * Muestra los datos de la mujer y de su esposo.
     */
    public void casadaCon(){
        System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + 
        " años está casada con " + this.getEsposo().getNombre() + " " + this.getEsposo().getApellido() + 
        " de " + this.getEsposo().getEdad() + " años");
    }
}