/**
 * Representa un círculo en el plano.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Circulo extends Elipse
{
    //Atributos
    private double radio;
        
    //Constructor
    /** 
      * Construye un círculo con el radio y centro indicados. 
      * 
      * @param p_radio radio del círculo. 
      * @param p_centro punto que representa el centro del círculo. 
      */
    public Circulo(double p_radio, Punto p_centro){
        //Semieje Mayor y Semieje Menor equivalen al radio de un circulo, por eso se los reemplaza con p_radio.
        super(p_radio, p_radio, p_centro);
        this.setRadio(p_radio);
    }
    
    /** 
      * Construye un círculo con radio 0 y centro ubicado en el origen. 
      */
    public Circulo(){
        super(0.0, 0.0, new Punto());
        this.setRadio(0.0);
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
       * Obtiene el radio del círculo. 
       * 
       * @return radio del círculo. 
       */
    public double getRadio(){
        return this.radio;
    }
    
    /** 
      * Muestra las características del círculo. 
      */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro() + " - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    public String nombreFigura(){
        return "****** Circulo ******";
    }
    
    /** 
       * Calcula el perímetro del círculo. 
       * 
       * @return perímetro del círculo. 
       */
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
}