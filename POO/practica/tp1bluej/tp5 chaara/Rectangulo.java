/**
 * Representa un Rectangulo en el plano.
 *
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Rectangulo extends FiguraGeometrica
{
    //Atributos
    /** 
      * Atributos que representan el origen, el ancho y el alto del rectángulo. 
      */
    private Punto origen; 
    private double alto;
    private double ancho;

    //Constructores
    /** * Construye un rectángulo con el origen y las dimensiones indicadas. 
       * 
       * @param p_origen punto que representa el origen del rectángulo. 
       * @param p_ancho ancho del rectángulo. 
       * @param p_alto alto del rectángulo. 
       */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        super(p_origen);//pasa el punto recibido a figura geometrica
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /** 
       * Construye un rectángulo con las dimensiones indicadas y cuyo origen se encuentra en (0,0). 
       * 
       * @param p_ancho ancho del rectángulo. 
       * @param p_alto alto del rectángulo. 
       */
    public Rectangulo(double p_ancho, double p_alto){
        super(new Punto()); //orunera kueba: invoca a figura geometrica pasando un punto 
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        
        
    }
    
    //Metodos
    /** 
       * Establece el origen del rectángulo. 
       * 
       * @param p_origen punto que representa el origen del rectángulo.
       */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    
    /** 
       *Establece el ancho del rectángulo. 
       * 
       * @param p_ancho ancho del rectángulo. 
       */
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    /** 
       * Establece el alto del rectángulo. 
       * 
       * @param p_alto alto del rectángulo. 
       */
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    /** 
       * Obtiene el origen del rectángulo. 
       * 
       * @return origen del rectángulo. 
       */
    public Punto getOrigen(){
        return this.origen;
    }
    
    /** 
       * Obtiene el ancho del rectángulo. 
       * 
       * @return ancho del rectángulo. 
       */
    public double getAncho(){
        return this.ancho;
    }
    
    /** 
      * Obtiene el alto del rectángulo. 
      * 
      * @return alto del rectángulo. 
      */
    public double getAlto(){
        return this.alto;
    }
    
    /** 
       * Desplaza el origen del rectángulo según las distancias indicadas. 
       * 
       * @param p_dx desplazamiento sobre el eje X. 
       * @param p_dy desplazamiento sobre el eje Y. 
       */
    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }
    @Override
    public String nombreFigura(){
        return "*** RECTANGULO***"; 
    }
    /** 
      * Muestra las características del rectángulo. 
      */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /** 
      * Calcula el perímetro del rectángulo. 
      * 
      * @return perímetro del rectángulo. 
      */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    /** 
       * Calcula la superficie del rectángulo. 
       * 
       * @return superficie del rectángulo. 
       */
    public double superficie(){
        return this.getAncho() * this.getAlto(); 
    }
    
    /** 
       * Calcula la distancia entre los orígenes de este rectángulo y otro rectángulo. 
       * 
       * @param otroRectangulo rectángulo con el cual se calcula la distancia. 
       * @return distancia entre los orígenes de ambos rectángulos. 
       */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.origen.distanciaA(otroRectangulo.getOrigen());
    }
    
    /** 
       * Determina cuál de los dos rectángulos posee mayor superficie. 
       * 
       * @param otroRectangulo rectángulo que se compara con este rectángulo. 
       * @return rectángulo que posee mayor superficie. 
       */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }  
    }
}