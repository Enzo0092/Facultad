
/**
 * clase que permite modelar la clase rectangulo.
 * 
 * @author Enzo Romero 
 * @version 1.0 2026
 */
public class Rectangulo
{
    // instance variables - replace the example below with your own
    private Punto origen;
    private double ancho;
    private double alto;
    

    /**
     * constructor 1 asigna el origen, el ancho y el alto
     * @param p_origen de tipo punto asigna el origen
     * @param p_ancho de tipo double asigna el ancho del rectangulo
     * @param p_alto de tipo double asigna el alto el rectangulo
     * 
     */
    public Rectangulo(Punto p_origen , double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    
    }
    /**constructor 2 asgina el ancho y el alto 
     * asigna el origen por defecto 
       *@param p_ancho de tipo double asigna el ancho 
       *@param p_alto de tipo double asigna el alto 
       */
      public Rectangulo(double p_ancho, double p_alto){
          this.setOrigen(new Punto(0.0,0.0));
          this.setAncho(p_ancho);
          this.setAlto(p_alto);
      }
       //setters mutadores privados 
       private void setAncho(double p_ancho){
           this.ancho=p_ancho;
       }
       private void setAlto(double p_alto){
           this.alto=p_alto;
           
       }
       private void setOrigen(Punto p_origen){
           this.origen=p_origen;
       }
       
       
       // getters
       public double getAlto(){
           return this.alto;
       }
       public double getAncho(){
           return this.ancho;
       }
       public Punto getOrigen(){
           return this.origen;
       }
       
       // metodos de comportamiento 
       /**
        * desplaza el rectangulo trascolando su pounto de oirgein
        * 
        * @param p_dx desplazamiento en el eje x.
        * @param p_dy desplazamiento en el eje y .
        * 
        */

       public void desplazar ( double p_dx, double p_dy){
           this.getOrigen().desplazar(p_dx,p_dy);
       }
       
       /**
        * calcula el perimetro del rectangulo
        * @return perimetro ( 2* alto + 2*ancho)

     */
       public double perimetro(){
           return 2*(this.getAlto() + this.getAncho());
       }
       /**
        * calcula la superficie (area ) del rectangulo
        * @return superficie (ancho*alto)
        */
       public double superficie(){
           return this.getAncho() * this.getAlto();
       }
       /**
        *imprime en pantalla las caracteristicas del rectangulo con el formato deseado
        *
        */
       public void caracteristicas (){
           System.out.println("*****rectangulo *****");
           System.out.println("origen: "+ this.getOrigen().coordenadas() +"- Alto" +this.getAlto() + this.getAncho());
           System.out.println("superficie:" + this.superficie() +"- perimetro:" + this.perimetro()); 
       }
        /** 
         * calcula la distancia entre el origen de este rectangulo y el origen de otro 
         * @param otro rectanculo instancia dle rectangulo a comparar
         * @return dsitnacia entre los puntos de origen 
         */
        public double distanciaA(Rectangulo otroRectangulo){
            return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
            
        }
        /**
         * compara las superficies y devuelve el rectangulo de mayor area
         * 
         * @param otro recntaculo instancia a comparar
         * @return el rectangulo con mayor superficie
         *
         */
        public Rectangulo elMayor(Rectangulo otroRectangulo){
            if (this.superficie() >= otroRectangulo.superficie()){
                return this;
            }else{
                return otroRectangulo;
                
            }
        }
}