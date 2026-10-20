/**
 * Representa un punto en el plano cartesiano.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Punto
{
    //Atributos
    /**
     * Coordenada X del punto.
     */
    private double x;
    /**
     * Coordenada Y del punto.
     */
    private double y;
    
    //Constructor
    /**
     * Construye un punto ubicado en el origen.
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * Construye un punto con las coordenadas indicadas.
     *
     * @param p_x coordenada X del punto.
     * @param p_y coordenada Y del punto.
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
        
    }
   
    //Metodos
    /**
     * Establece la coordenada X del punto.
     *
     * @param p_x nueva coordenada X del punto.
     */
    private void setX(double p_x){
        this.x = p_x;
    }
    
    /**
     * Establece la coordenada Y del punto.
     *
     * @param p_y nueva coordenada Y del punto.
     */
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /**
     * Obtiene la coordenada X del punto.
     *
     * @return coordenada X del punto.
     */
    public double getX(){
        return this.x;
    }
    
    /**
     * Obtiene la coordenada Y del punto.
     *
     * @return coordenada Y del punto.
     */
    public double getY(){
        return this.y;
    }
    
    /**
      * Calcula la distancia entre este punto y otro punto.
      *
      * @param p_ptoDistante punto con el cual se calcula la distancia.
      * @return distancia entre ambos puntos.
      */
    public double distanciaA(Punto p_ptoDistante){
        double dx = p_ptoDistante.getX() - this.x;
        double dy = p_ptoDistante.getY() - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    
    /**
     * Desplaza el punto según las distancias agregadas.
     *
     * @param p_dx desplazamiento sobre el eje X.
     * @param p_dy desplazamiento sobre el eje Y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra por pantalla las coordenadas del punto.
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.x + ", " + "Y: " + this.y);
    }
    
    /**
     * Obtiene las coordenadas del punto en formato textual.
     *
     * @return cadena con las coordenadas X e Y.
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}
