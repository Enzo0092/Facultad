/**
 * representa una figura geometrica de tipo triangulo
 * @author Enzo Romero
 * @version 1.0
 */

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
     /**constructor de triangulo 
      * 
      * @param p_origen punto que representa el extremo inferior izquierdo
      * @param p_base longitud de la base
      * @param p_altura altura del triangulo
      */
     public Triangulo(Punto p_origen, double p_base, double p_altura){
         super(p_origen);
         this.setBase(p_base);
         this.setAltura(p_altura);
     }
     
     //accesors
     private void setBase(double p_base){
         this.base = p_base;
     }
     private void setAltura(double p_altura) {
         this.altura=p_altura;
     }
     public double getBase(){
         return this.base;
     }
     public double getAltura(){
         return this.altura;
     }
     //implementacion obligatoria de los metodos abstractos
     @Override
     public String nombreFigura(){
         return "triangulo";
     }
     @Override 
    public double superficie(){
        return (this.getBase() * this.getAltura()) / 2.0; 
    }
     
     
}

