/**
 * Representa un círculo en el plano.
 *
 * @author Enzo romero
 * @version 1.0 - 2026
 */
public class Circulo extends Elipse{
    
    //Constructor
    /** 
      * Construye un círculo con el radio y centro indicados. 
      * 
      * @param p_radio radio del círculo. 
      * @param p_centro punto que representa el centro del círculo. 
      */
    public Circulo(double p_radio, Punto p_centro){
       super(p_centro, p_radio,p_radio );
        
    }
    
    /** 
      * Construye un círculo con radio 0 y centro ubicado en el origen. 
      */
    public Circulo(double p_radio){
        super(new Punto(0,0),p_radio,p_radio );
    
    }
    public String nombreFigura(){
        return "****** Circulo ******";
    }
    
 
    
    /** 
      * Muestra las características del círculo. 
      */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro() + " - Radio: " + this.getSEjeMayor());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /** 
       * Calcula el perímetro del círculo. 
       * 
       * @return perímetro del círculo. 
       */
    public double perimetro(){
        return 2 * Math.PI * this.getSEjeMayor();
    }
    
    
    
   
}