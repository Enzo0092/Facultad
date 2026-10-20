/**
 * Representa un renglón con una cantidad, un precio y una etiqueta.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Renglon
{
    //Atributos
    /** Cantidad de elementos del renglón. */
    private int cantidad;
    /** Precio de los elementos del renglón. */
    private double precio;
    /** Etiqueta del elemento asociado al renglón. */
    private Etiqueta item;

    //Constructor
    /**
     * Construye un renglón con la cantidad, el precio y la etiqueta indicados.
     *
     * @param p_cantidad cantidad de elementos
     * @param p_precio precio de los elementos
     * @param p_item etiqueta del elemento
     */
    public Renglon(int p_cantidad, double p_precio, Etiqueta p_item)
    {
        this.setCantidad(p_cantidad);
        this.setPrecio(p_precio);
        this.setItem(p_item);
    }

    //Metodos
    /**
     * Establece la cantidad de elementos.
     *
     * @param p_cantidad cantidad de elementos
     */
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }

    /**
     * Establece el precio de los elementos.
     *
     * @param p_precio precio de los elementos
     */
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }

    /**
     * Establece la etiqueta del elemento.
     *
     * @param p_item etiqueta del elemento
     */
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }

    /**
     * Devuelve la cantidad de elementos.
     *
     * @return cantidad de elementos
     */
    public int getCantidad(){
        return this.cantidad;
    }

    /**
     * Devuelve el precio de los elementos.
     *
     * @return precio de los elementos
     */
    public double getPrecio(){
        return this.precio;
    }

    /**
     * Devuelve la etiqueta asociada al renglón.
     *
     * @return etiqueta del elemento
     */
    public Etiqueta getItem(){
        return this.item;
    }

    /**
     * Muestra la cantidad y la descripción del elemento.
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + " " + item.toString());
    }
}