// Importamos la clase Scanner que está dentro del paquete 'java.util'.
// Sirve para crear un lector de datos que capte lo que el usuario escribe en el teclado.
import java.util.Scanner;

// Declaración de la clase ejecutable. El nombre debe coincidir con el nombre del archivo.
public class CircunferenciaVersion2 { 

    // Punto de entrada del programa. Todo código procedural que se ejecuta arranca dentro del main.
    public static void main(String[] args) {
        
        // INSTANCIACIÓN DEL SCANNER:
        // Creamos un nuevo objeto 'teclado' de la clase Scanner.
        // System.in le indica al Scanner que debe leer la entrada estándar (el teclado).
        Scanner teclado = new Scanner(System.in);
        
        // DECLARACIÓN E INICIALIZACIÓN DE LA VARIABLE DE CONTROL:
        // Inicializamos 'respuesta' con "s" para asegurar que la condición del bucle 'while'
        // sea verdadera (true) al menos la primera vez y el ciclo pueda comenzar.
        String respuesta = "s";
        
        // ESTRUCTURA DE CONTROL ITERATIVA (WHILE):
        // Se repite MIENTRAS la condición sea verdadera.
        // Usamos .equals("s") en lugar de == porque para comparar el contenido de textos (Strings) 
        // en Java se debe usar el método .equals().
        while (respuesta.equals("s")) {
            
            // Imprime en consola la solicitud de datos para orientar al usuario.
            System.out.println("ingrese el valor del radio ");
            
            // LECTURA DE ENTERO:
            // El programa se frena acá a la espera de que el usuario escriba un número entero y presione Enter.
            // El valor ingresado se guarda en la variable local 'radio'.
            int radio = teclado.nextInt();
            
            // CÁLCULO MATEMÁTICO:
            // Calculamos el perímetro usando Math.PI (una constante predefinida en Java con el valor de Pi).
            // La multiplicación da como resultado un número con decimales, por eso guardamos en un 'double'.
            double perimetro = 2 * Math.PI * radio;
            
            // SALIDA POR PANTALLA:
            // Mostramos el resultado concatenando el texto con la variable 'perimetro'.
            System.out.println("el perimetro de la circunferencia es " + perimetro);
            
            // PREGUNTA AL USUARIO:
            System.out.println("quiere calcular otra circunferencia ?s/n:");
            
            // LECTURA DE TEXTO (STRING):
            // teclado.next() lee la siguiente palabra/cadena que escribe el usuario.
            // Si el usuario escribe "s", en la próxima vuelta del while la condición se vuelve a cumplir.
            // Si escribe "n" (o cualquier otra cosa), la condición da falso y sale del bucle.
            respuesta = teclado.next();
        }
        
        // BUENA PRÁCTICA:
        // Cierra el flujo del Scanner para liberar los recursos del sistema que estaban escuchando el teclado.
        teclado.close();
    }
}