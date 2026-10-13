/**
 * Clase ejecutable para probar el funcionamiento de Rectangulo y Cuadrado.
 * 
 * @author Enzo Romero
 * @version 1.0 (TP5 - Ejercicio 3)
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Punto p1 = new Punto(5.0, 3.0);

        // Instanciamos un Rectangulo comun
        Rectangulo r1 = new Rectangulo(p1, 10.0, 5.0);
        
        // Instanciamos un Cuadrado
        Cuadrado c1 = new Cuadrado(p1, 72.99);

        System.out.println("--- CARACTERISTICAS RECTANGULO ---");
        r1.caracteristicas();

        System.out.println("\n--- CARACTERISTICAS CUADRADO ---");
        c1.caracteristicas();
    }
}