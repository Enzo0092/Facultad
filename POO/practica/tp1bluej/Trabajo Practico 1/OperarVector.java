// Importamos la clase Scanner para poder leer datos ingresados por el teclado
import java.util.Scanner;

public class OperarVector {

    public static void main(String[] args) {
        // INSTANCIACIÓN DEL SCANNER:
        // Objeto 'teclado' encargado de capturar lo que escribe el usuario
        Scanner teclado = new Scanner(System.in);

        // DECLARACIÓN DE VARIABLES:
        int i; // Variable de control para usar en los bucles 'for'

        // ARREGLO/VECTOR: Reservamos espacio en memoria para guardar 5 enteros.
        // Los índices válidos irán desde 0 hasta 4 (vectorNotas[0] ... vectorNotas[4]).
        int[] vectorNotas = new int[5];

        int acumulador = 0; // Guardará la suma total de las notas ingresadas
        double promedio = 0; // Guardará el promedio final (permite decimales)
        int mayor = 0; // Guardará la nota más alta encontrada

        // 1. BUCLE DE CARGA:
        // Recorre las posiciones 0, 1, 2, 3 y 4 del vector para solicitar y guardar las notas
        for (i = 0; i < 5; i++) {
            System.out.println("Ingrese nota del alumno:");
            vectorNotas[i] = teclado.nextInt(); // Guarda la nota ingresada en la posición 'i'
        }

        // 2. BUCLE DE PROCESAMIENTO:
        // Recorre nuevamente el vector para buscar la nota mayor y calcular la suma total
        for (i = 0; i < 5; i++) {
            // ALGORITMO DE BÚSQUEDA DEL MAYOR:
            // Si la nota actual en la posición 'i' es más grande que el valor guardado en 'mayor'...
            if (vectorNotas[i] > mayor) {
                mayor = vectorNotas[i]; // ...actualizamos 'mayor' con esta nueva nota más alta
            }

            // ACUMULADOR: Sumamos el valor de la nota actual al total acumulado
            acumulador = acumulador + vectorNotas[i];
        }

        // CÁLCULO DEL PROMEDIO:
        // Usamos (double) para hacer un "CASTING" (conversión de tipo).
        // Obliga a Java a hacer una división con decimales en vez de una división entera.
        promedio = (double) acumulador / 5;

        // MUESTRA DE RESULTADOS FINALES:
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("La mayor nota es: " + mayor);
        System.out.println("Notas ingresadas:");

        // 3. BUCLE DE IMPRESIÓN:
        // Recorre el vector para mostrar todos los elementos guardados en una sola línea horizontal
        for (i = 0; i < 5; i++) {
            // USAMOS print EN LUGAR DE println:
            // System.out.print no hace salto de línea, permitiendo que las notas se muestren de corrido.
            // "\t" agrega un espacio de tabulación entre cada nota.
            System.out.print(vectorNotas[i] + "\t");
        }
        System.out.println(); // Salto de línea final para prolijidad de la consola

        // Buena práctica: cerramos el recurso del teclado al finalizar
        teclado.close();
    }
}
