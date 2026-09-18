import java.util.Random;

public class CreaFigura
{
    public static void main(String args[]){
        Random unNumero = new Random();
        
        double radio1 = unNumero.nextDouble() * 100.0;
        Punto centro1 = new Punto(0, 0);

        Circulo circulo1 = new Circulo(radio1, centro1);

        circulo1.desplazar(-240, -230);

        circulo1.caracteristicas();

        double radio2 = unNumero.nextDouble() * 100.0;
        Punto centro2 = new Punto(5.2, 0.5);

        Circulo circulo2 = new Circulo(radio2, centro2);

        System.out.println();
        System.out.println("Circulo mayor:");
        circulo1.elMayor(circulo2).caracteristicas();

        System.out.println();
        System.out.println("Distancia entre los circulos: " + circulo1.distanciaA(circulo2));  
        
        double alto1 = unNumero.nextDouble() * 100.0;
        double ancho1 = unNumero.nextDouble() * 100.0;
        
        Rectangulo rectangulo1 = new Rectangulo(ancho1, alto1);
        
        rectangulo1.desplazar(40, -20);
        
        rectangulo1.caracteristicas();
        
        double alto2 = unNumero.nextDouble() * 100.0;
        double ancho2 = unNumero.nextDouble() * 100.0;
        
        Punto origen2 = new Punto(7.4, 4.5);
        
        Rectangulo rectangulo2 = new Rectangulo(origen2, ancho2, alto2);
        
        System.out.println();
        System.out.println("Rectangulo mayor:");
        rectangulo1.elMayor(rectangulo2).caracteristicas();
    }

}