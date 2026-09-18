/**clase ejecutable para crear figura geometricas
 * @author romero Enzo
   
   
   */
import java.util.Random;

public class CrearFigura{
    /**metodo pricipal de ejecucion 
     *@param args argumentos de la loinea de comandos.
       */
    public static void main(String[]args){
    // instanciamos un onjeto del tipo random para obtener un numero aleatorio
        Random unNumero= new Random();
        // punto en ele origen y radio aleatorio;
        //variables temporales 
        Punto centro1= new Punto(0.0,0.0);
        double radio1 =unNumero.nextDouble() *100.0;
        Circulo circulo1 = new Circulo(radio1,centro1);
        circulo1.caracteristicas();
        //2 desplazar : 240 a la izquierda (-240) y 230 havia abajo -230
        circulo1.desplazar(-240.0, -230.0);
        //3. m9ostrar caracteristicas del primer cirulo 
        System.out.println("---PRIMER CIRCULO (LUEGO DEL DESPLAZAMIENTO )---");
        circulo1.caracteristicas();
        //4. segundo circulo centrado en (5.2, 0.5) con otro radio aleastorio;
        Punto centro2= new Punto(5.2,0.5);
        double radio2= unNumero.nextDouble()*100.0;
        Circulo circulo2=new Circulo(radio2, centro2);
        System.out.println("--- SEGUNDO CIRCULO CREADO---");
        circulo2.caracteristicas();
        // 5. determinar y mostrar las caracteristicas deel mayor
        Circulo mayor= circulo1.elMayor(circulo2);
        System.out.println("--caracteristicas del ciruclo mayor---" );
        mayor.caracteristicas();
        //6. mostrar la distancia entre ambos circulos
        double distancia=circulo1.distanciaA(circulo2);
        System.out.println(" distancia entre el circulo 1 y  el circulo 2");
        
        // prubea de recatangulos del ejercicio 4
        //1. crear rectangulo en (0,0) con deimesiones aleatorias
        double ancho1= unNumero.nextDouble()*100.0;
        double alto1 = unNumero.nextDouble() * 100.0;
        Rectangulo rect1= new Rectangulo(ancho1,alto1); // dimensionreces aleatorias
        //2. despzar 40 a la derecha (+40) y 20 hacia abajo (-20)
        rect1.desplazar(40.0, -20.0);
        //3. mostrar caracteristicas 
        System.out.println("-- primer rectangulo desplazado---");
        rect1.caracteristicas();
        // 4. Crear otro rectángulo en (7.4, 4.5) con nuevas dimensiones aleatorias
        Punto origen2 = new Punto(7.4, 4.5);
        double ancho2 = unNumero.nextDouble() * 100.0;
        double alto2 = unNumero.nextDouble() * 100.0;
        Rectangulo rect2 = new Rectangulo(origen2, ancho2, alto2);

        // 5. Mostrar las características del mayor
        System.out.println("\n--- RECTÁNGULO MAYOR ---");
        Rectangulo rectMayor = rect1.elMayor(rect2);
        rectMayor.caracteristicas();

        // 6. Mostrar distancia entre ambos rectángulos
        System.out.println("\nDistancia entre rectángulos: " + rect1.distanciaA(rect2));
    }
    }
    
