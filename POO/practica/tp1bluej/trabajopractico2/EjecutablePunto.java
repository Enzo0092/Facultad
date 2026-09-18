import java.util.Scanner;

/**
 * Clase ejecutable para probar la clase Punto mediante ingreso por teclado.
 * 
 * @author Enzo Romero
 */
public class EjecutablePunto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CREANDO PUNTO CON VALORES INICIALES ===");
        System.out.print("Ingrese coordenada X: ");
        double x = teclado.nextDouble();

        System.out.print("Ingrese coordenada Y: ");
        double y = teclado.nextDouble();

        // Se instancia el punto usando el constructor con parámetros
        Punto unPunto = new Punto(x, y);

        System.out.println("\nEstado inicial del punto:");
        unPunto.mostrar();
        System.out.println("Coordenadas formateadas: " + unPunto.coordenadas());

        System.out.println("\n=== DESPLAZANDO EL PUNTO ===");
        System.out.print("Ingrese el desplazamiento en X (dx): ");
        double dx = teclado.nextDouble();

        System.out.print("Ingrese el desplazamiento en Y (dy): ");
        double dy = teclado.nextDouble();

        // Desplazamos el punto
        unPunto.desplazar(dx, dy);

        System.out.println("\nEstado del punto después del desplazamiento:");
        unPunto.mostrar();
        System.out.println("Nuevas coordenadas: " + unPunto.coordenadas());

        teclado.close();
    }
}