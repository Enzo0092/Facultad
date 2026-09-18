/**
 * Representa un círculo en el plano.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Circulo
{
    //Atributos
    /**  
     * Radio del círculo. 
     */
    private double radio;
    /** 
     * Punto que representa el centro del círculo. 
     */
    private Punto centro;
    
    //Constructor
    /** 
      * Construye un círculo con el radio y centro indicados. 
      * 
      * @param p_radio radio del círculo. 
      * @param p_centro punto que representa el centro del círculo. 
      */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /** 
      * Construye un círculo con radio 0 y centro ubicado en el origen. 
      */
    public Circulo(){
        this.setRadio(0.0);
        this.setCentro(new Punto());
    }
    
    //Metodos
    /** 
       * Establece el radio del círculo. 
       * 
       * @param p_radio radio del círculo. 
       */
    private void setRadio(double p_radio){
        this.radio = p_radio; 
    }
    
    /** 
       * Establece el centro del círculo. 
       * 
       * @param p_centro punto que representa el centro del círculo. 
       */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    /** 
       * Obtiene el radio del círculo. 
       * 
       * @return radio del círculo. 
       */
    public double getRadio(){
        return this.radio;
    }
    
    /** 
       * Obtiene el centro del círculo. 
       * 
       * @return centro del círculo. 
       */
    public Punto getCentro(){
        return this.centro;
    }
    
    /** 
       * Desplaza el centro del círculo según las distancias indicadas. 
       * 
       * @param p_dx desplazamiento sobre el eje X. 
       * @param p_dy desplazamiento sobre el eje Y. 
       */
    public void desplazar(double p_dx, double p_dy){
        this.centro.desplazar(p_dx, p_dy);
    }
    
    /** 
      * Muestra las características del círculo. 
      */
    public void caracteristicas(){
        System.out.println("****** Circulo ******");
        System.out.println("Centro: " + this.getCentro() + " - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /** 
       * Calcula el perímetro del círculo. 
       * 
       * @return perímetro del círculo. 
       */
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    /** 
      * Calcula la superficie del círculo. 
      * 
      * @return superficie del círculo. 
      */
    public double superficie(){
        return Math.PI * Math.pow (this.getRadio(), 2); 
    }
    
    /** 
       * Calcula la distancia entre este círculo y otro círculo. 
       * 
       * @param otroCirculo círculo con el cual se calcula la distancia. 
       * @return distancia entre los centros de ambos círculos. 
       */
    public double distanciaA(Circulo otroCirculo){
        return this.centro.distanciaA(otroCirculo.getCentro());
    }
    
    /** 
       * Determina cuál de los dos círculos posee mayor superficie. 
       * 
       * @param otroCirculo círculo que se compara con este círculo. 
       * @return círculo que posee mayor superficie. 
       */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
}