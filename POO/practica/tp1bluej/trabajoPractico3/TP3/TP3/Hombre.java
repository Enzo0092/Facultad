/**
 * Representa a un hombre con sus datos personales y estado civil.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Hombre
{
    //Atributos
    /**
     * Datos que representan nombre, apellido, edad, estado civil y esposa del hombre.
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    //Constructores
    /**
     * Constructor de la clase Hombre.
     *
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    
    /**
     *Constructor de la clase Hombre con esposa.
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     * @param p_esposa
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
        this.setEstadoCivil("Casado");
    }

    //Metodos
    /**
     * Establece el nombre del hombre.
     *
     * @param p_nombre nombre del hombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el apellido del hombre.
     *
     * @param p_apellido apellido del hombre.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Establece la edad del hombre.
     *
     * @param p_edad edad del hombre.
     */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    /**
     * Establece estado civil del hombre.
     *
     * @param p_estadoCivil estado civil del hombre.
     */
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    
    /**
     * Establece la esposa del hombre.
     *
     * @param p_esposa esposa del hombre.
     */
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    
    /**
     * Obtiene el nombre del hombre.
     *
     * @return nombre del hombre.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el apellido del hombre.
     *
     * @return apellido del hombre.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene la edad del hombre.
     *
     * @return edad del hombre.
     */
    public int getEdad(){
        return this.edad;
    }
    
    /**
     * Obtiene Estado Civil del hombre.
     *
     * @return Estado Civil.
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    /**
     * Obtiene esposa del hombre.
     *
     * @return esposa del hombre.
     */
    
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    /**
     * Casa al hombre con la mujer indicada y cambia su estado civil a Casado.
     *
     * @param p_mujer mujer con la que se casa el hombre.
     */
    public void casarseCon(Mujer p_mujer){
        this.esposa = p_mujer; 
        this.estadoCivil = "Casado";
    }
    
    /**
     * Divorcia al hombre, elimina la referencia a su esposa y cambia su estado civil a Divorciado.
     */
    public void divorcio(){
        this.esposa = null;
        this.estadoCivil = "Divorciado";
    }
    
    /**
     * Obtiene los datos personales del hombre en formato textual.
     * 
     * @return Nombre, apellido y edad del hombre.
     */
    public String datos(){
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }
    
    /**
     * Muestra los datos del hombre junto con su estado civil.
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años - " 
        + this.getEstadoCivil());
    }
     
    /**
     * Muestra los datos del hombre y de su esposa.
     */
    public void casadoCon(){
        System.out.println(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + 
        " años está casado con " + this.getEsposa().getNombre() + " " + this.getEsposa().getApellido() + 
        " de " + this.getEsposa().getEdad() + " años");
    }
}