/**
 * clase ejecutable para probar el calculo de presupuesto de pintura del jardin 
 * 
 * @author Enzo Romero
 * @version 1.0
 * 
 */

public class administracion{
    public static void main (String[] args){
        //punto de referencia para el origen de las figuras
        Punto centro= new Punto(0.0, 0.0);
        //1 instanciamos distintas figuras geometricas
        // cuadrado  de lado 5 (superficie :25.0)
        Cuadrado unCuadrado= new Cuadrado(centro, 5.0);
        //triangulo de base 2.56 y altura 1.0 (superficie 1.28)
        Triangulo unTriangulo = new Triangulo(centro, 2.56,1.0);
        //circulo de radio 2.0 (superficie aprox :12.57)
        Circulo unCirculo = new Circulo (centro , 2.0);
        Elipse unaElipse = new Elipse( centro, 10.0,6.0);
        Jardin miJardin = new Jardin ("bichito de lu");
        miJardin.agregarFigura(unCuadrado);
        miJardin.agregarFigura(unTriangulo);
        miJardin.agregarFigura(unCirculo);
        miJardin.agregarFigura(unaElipse);
        //4 emitimos el detalle y presupuesto
        miJardin.detalleFiguras();
        
        
    }
}