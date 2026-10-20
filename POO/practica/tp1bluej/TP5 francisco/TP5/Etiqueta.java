/**
 * Representa una etiqueta abstracta con un costo asociado.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public abstract class Etiqueta
{
    //Atributos
    /** Costo asociado a la etiqueta. */
    private double costo;

    //Constructor
    /**
     * Construye una etiqueta con el costo indicado.
     *
     * @param p_costo costo de la etiqueta
     */
    public Etiqueta(double p_costo)
    {
        this.setCosto(p_costo);
    }

    //Metodos
    /**
     * Establece el costo de la etiqueta.
     *
     * @param p_costo costo de la etiqueta
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }

    /**
     * Devuelve el costo de la etiqueta.
     *
     * @return costo de la etiqueta
     */
    public double getCosto(){
        return this.costo;
    }

    /**
     * Calcula el precio según la cantidad indicada.
     *
     * @param q cantidad de elementos
     * @return precio correspondiente a la cantidad
     */
    public abstract double precio(int q);

    /**
     * Devuelve una descripción de la etiqueta y su costo.
     *
     * @return descripción de la etiqueta
     */
    public String toString(){
        return "Tipo " +  this.tipo() + " - Costo: $ " + this.getCosto();
    }

    /**
     * Devuelve el tipo de etiqueta.
     *
     * @return tipo de etiqueta
     */
    protected abstract String tipo();
}