/**
 * Representa una etiqueta premium con un costo y una cantidad de colores.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Premium extends Etiqueta
{
    //Atributos
    /** Cantidad de colores de la etiqueta. */
    private int colores;

    //Constructor
    /**
     * Construye una etiqueta premium con la cantidad de colores y el costo indicados.
     *
     * @param p_colores cantidad de colores
     * @param p_costo costo de la etiqueta
     */
    public Premium(int p_colores, double p_costo)
    {
        super(p_costo);
        this.setColores(p_colores);
    }

    //Metodos
    /**
     * Establece la cantidad de colores.
     *
     * @param p_colores cantidad de colores
     */
    private void setColores(int p_colores){
        this.colores = p_colores;
    }

    /**
     * Devuelve la cantidad de colores.
     *
     * @return cantidad de colores
     */
    public int getColores(){
        return this.colores;   
    }

    /**
     * Calcula el precio según la cantidad solicitada y el adicional por colores.
     *
     * @param q cantidad de etiquetas
     * @return precio total
     */
    public double precio(int q){
       double precio;
       double adicional;
       precio = getCosto() * q;
       adicional = precio * this.plus();
       return precio + adicional;
    }

    /**
     * Calcula el porcentaje adicional según la cantidad de colores.
     *
     * @return porcentaje adicional aplicado al precio
     */
    private double plus(){
        double adicional;
        if(this.getColores() == 1){
            adicional = 0.00;
        }else{
            if(this.getColores() == 2){
                adicional = 0.05;
            }else{
                if(this.getColores() == 3){
                    adicional = 0.07;                
                }else{
                    if(this.getColores() > 3){
                        adicional = 0.03 * this.getColores();
                    }else{
                        return 0;
                    }
                }
            }
        }

        return adicional;
    }

    /**
     * Devuelve el tipo de etiqueta.
     *
     * @return tipo de etiqueta
     */
    protected String tipo(){
        return "Premium";
    }

    /**
     * Devuelve una descripción de la etiqueta premium, incluyendo sus colores.
     *
     * @return descripción de la etiqueta
     */
    public String toString(){
        return super.toString() + " - Colores: " + this.getColores();
    }
}