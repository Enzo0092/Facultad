/**
 * Representa un servicio con su descripción y precio.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Servicio
{
    //Atributo
    /**
     * Descripción del servicio.
     */
    private String descripcion;

    /**
     * Precio del servicio.
     */
    private double precio;

    //Constructor
    /**
     * Construye un servicio con su descripción y precio.
     *
     * @param p_descripcion descripción del servicio
     * @param p_precio precio del servicio
     */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    //Metodos
    /**
     * Establece la descripción del servicio.
     *
     * @param p_descripcion descripción del servicio
     */
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }

    /**
     * Establece el precio del servicio.
     *
     * @param p_precio precio del servicio
     */
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }

    /**
     * Obtiene la descripción del servicio.
     *
     * @return descripción del servicio
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Obtiene el precio del servicio.
     *
     * @return precio del servicio
     */
    public double getPrecio(){
        return this.precio;
    } 
}