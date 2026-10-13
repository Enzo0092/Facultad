/**
 * Clase ejecutable para probar las clases Elipse y Circulo.
 * 
 * @author Enzo Romero
 * @version 1.0 (TP5 - Ejercicio 4)
 */
public class PruebaElipseCirculo {
    public static void main(String[] args) {
        // 1. Creamos los puntos para los centros
        Punto centroElipse = new Punto(5.0, 3.0);
        Punto centroCirculo = new Punto(2.0, 4.0);

        // 2. Instanciamos una Elipse (centro, sEjeMayor, sEjeMenor)
        Elipse elipse1 = new Elipse(centroElipse, 20.44, 46.86);

        // 3. Instanciamos un Circulo (radio, centro)
        Circulo circulo1 = new Circulo(10.0, centroCirculo);

        // 4. Mostramos las características de cada figura
        System.out.println("=== PRUEBA DE ELIPSE ===");
        elipse1.caracteristicas();

        System.out.println("\n=== PRUEBA DE CIRCULO ===");
        circulo1.caracteristicas();

        // 5. Probar método elMayor entre la elipse y el círculo
        Elipse mayor = elipse1.elMayor(circulo1);
        System.out.println("\nLa figura con mayor superficie es: " + mayor.nombreFigura());
    }
}