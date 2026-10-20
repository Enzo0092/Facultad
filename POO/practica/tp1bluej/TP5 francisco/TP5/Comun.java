/**
 * Representa una etiqueta común con un costo y un adicional por diseño.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Comun extends Etiqueta
{
    //Atributos
    /** Adicional correspondiente al diseño. */
    private double plus;

    //Constructor
    /**
     * Construye una etiqueta común con el adicional y el costo indicados.
     *
     * @param p_plus adicional por diseño
     * @param p_costo costo de la etiqueta
     */
    public Comun(double p_plus, double p_costo)
    {
        super(p_costo);
        this.setPlus(p_plus);
    }

    //Metodos
    /**
     * Establece el adicional por diseño.
     *
     * @param p_plus adicional por diseño
     */
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }

    /**
     * Devuelve el adicional por diseño.
     *
     * @return adicional por diseño
     */
    public double getPlus(){
        return this.plus;
    }

    /**
     * Calcula el precio según la cantidad solicitada y el descuento correspondiente.
     *
     * @param q cantidad de etiquetas
     * @return precio total
     */
    public double precio(int q){
       double precio;
       precio = this.getCosto() * q + this.getPlus();
       precio = precio - this.descuento(q);
       return precio;
    }

    /**
     * Calcula el descuento según la cantidad de etiquetas solicitadas.
     *
     * @param q cantidad de etiquetas
     * @return descuento aplicado
     */
    private double descuento(int q){
      double descuento;
       if(q > 0 && q < 11){
        descuento = 0;
       }else{
        if(q > 10 && q < 51){
            descuento = this.getCosto() * q * 0.02;
        }else{
            if(q > 50 && q < 101){
                descuento = this.getCosto() * q * 0.05;
            }else{
                descuento = this.getCosto() * q * ((q / 10) * 0.01);
            }
        }
      }
      return descuento;
    }

    /**
     * Devuelve el tipo de etiqueta.
     *
     * @return tipo de etiqueta
     */
    protected String tipo(){
        return "Comun";
    }

    /**
     * Devuelve una descripción de la etiqueta común, incluyendo su diseño.
     *
     * @return descripción de la etiqueta
     */
    public String toString(){
        return super.toString() + " - Diseño: " + this.getPlus();
    }
}