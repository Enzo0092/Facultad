/**
 * clase cuadrado del ejercicio 3 del tp5
 * subclase de la clase rectangulo 
 * @author Enzo Romero
 * @version 1.0
 */
public class Cuadrado extends Rectangulo{
    public Cuadrado (Punto p_origen, double p_lado){
        super (p_origen, p_lado,p_lado);
    }
    public String nombreFigura(){
        return "*** Cuadrado ***";
    }
    
    //@Override
    public void caracteristicias(){
        System.out.println(this.nombreFigura());
        System.out.println("origen:" +this.getOrigen().coordenadas() +"-" + "Lado :" +this.getAlto());
        System.out.println("Superficie:" + this.superficie() +"-"+ "perimetro :" +this.perimetro());
        
    }
    
}