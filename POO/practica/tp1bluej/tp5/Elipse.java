/**
 * clase elipse representa la clase padre de la subclase circulo
 * @author enzo romero
 * @version 1.0
 */

public class Elipse{
   private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;
    
    public Elipse( Punto p_centro,double p_sEjemayor, double p_sEjeMenor){
        this.setSEjeMayor(p_sEjemayor);
        this.setSEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
        
        
    }
    
    //accsesors
    private void setSEjeMayor(double p_sEjemayor){
        this.sEjeMayor=p_sEjemayor;
    }
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor=p_sEjeMenor;
    }
    private void setCentro(Punto p_centro){
        this.centro=p_centro;
    }
    public double getSEjeMayor(){
        return this.sEjeMayor;
        
    }
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    public Punto getCentro(){
        return this.centro;
    }
    //metodos de la clase
    
    public String nombreFigura(){
        return "****** Elipse ******";
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
       * Calcula la distancia entre este círculo y otro círculo. 
       * 
       * @param otroCirculo círculo con el cual se calcula la distancia. 
       * @return distancia entre los centros de ambos círculos. 
       */
    public double distanciaA(Elipse otraElipse){
        return this.centro.distanciaA(otraElipse.getCentro());
    }
     
    /** 
       * Determina cuál de los dos círculos posee mayor superficie. 
       * 
       * @param otroCirculo círculo que se compara con este círculo. 
       * @return círculo que posee mayor superficie. 
       */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        }else{
            return otraElipse;
        }
    }
    /** 
      * Calcula la superficie del círculo. 
      * 
      * @return superficie del círculo. 
      */
    public double superficie(){
        return Math.PI * this.sEjeMayor * this.sEjeMenor; 
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("centro :" + this.getCentro().coordenadas() +"-Semieje mayor :" + this.getSEjeMayor() + "- Semieje Menor:" + this.getSEjeMenor()) ;
        System.out.println("Superficie: " + this.superficie());
        
    }
}