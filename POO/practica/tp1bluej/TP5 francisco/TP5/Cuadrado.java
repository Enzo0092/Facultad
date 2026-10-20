/**
 * Clase que genera un cuadrado.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Cuadrado extends Rectangulo
{
    //Atributos
    /**
     * Lado del cuadrado.
     */
    private double lado; 

    //Constructor
    /**
     * Construye un cuadrado con un origen, un lado, un ancho y un alto.
     *
     * @param p_origen punto de origen de la figura
     * @param p_lado longitud del lado del cuadrado
     * @param p_ancho ancho del rectángulo
     * @param p_alto alto del rectángulo
     */
    public Cuadrado(Punto p_origen, double p_lado, double p_ancho, double p_alto){
       super(p_origen, p_ancho, p_alto); 
       this.setLado(p_lado);
    }

    //Metodos
    /**
     * Establece el lado del cuadrado.
     *
     * @param p_lado longitud del lado del cuadrado
     */
    private void setLado(double p_lado){
        this.lado = p_lado;
    }

    /**
     * Obtiene el lado del cuadrado.
     *
     * @return longitud del lado del cuadrado
     */
    public double getLado(){
        return this.lado;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Cuadrado ******";
    }

    /**
     * Muestra las características del cuadrado.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen() + " - Lado: " + this.getLado());
        System.out.println("Superficie: " + this.superficie() + "- Perimetro: " + this.perimetro());
    }
}