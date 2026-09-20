import java.util.Scanner;
// libreria scanner para el ingreso por teclado
/**
 * permite crear un contenedor estatico de 6 elementos llamado  punto 
 * agregar como elementos instancia de la clase punto ingresando por teclado
 * recorrer el array e imprimir las coordenadas de cada elemento usando el metodo prrevisto
 *  permite el calculo de distancia entre elementos consecutivos
 *@author enzo romero
 * @version 1.0
 * 
 */

public class ArrayDePuntos{
    /**
     * metodo principal que ejecuta la logica de carga 
     * lsitado y calculo  de distancias sobre un arreglo estatico de objetos punto
     * 
     * 
     */
    public static void main(String[]args){
        //instncio un objeto de tipo escaner para usarlo de variable auxiliar 
        // para la entrada por teclado
        Scanner scanner= new Scanner (System.in);
        //declaro e instancio el contenedor estatico de 6 posiciones
        Punto [] puntos= new Punto [6];
        // carga de datos por teclado
        System.out.println("--- carga de 6 puntos---");
        //ciclo for para la carga de datos
        for (int i=0; i< puntos.length;i++){
            System.out.println("punto" +(i+1) + ":");
            System.out.print("ingrese coordenda x:");
            double x = scanner.nextDouble();
            System.out.print("ingrese coordenada y :");
            double y= scanner.nextDouble();
            // instanciacion de cada objeto punto dentro del arreglo
            puntos[i]= new Punto(x,y);
        }
        // recorrido del arreglo e impresion de coordenadas
        System.out.println("--cordenadas de los puntos ---");
        for (int i=0; i< puntos.length;i++){
            System.out.println("punto" +(i+1)+ ":" + puntos[i].coordenadas());
        }
        // calculo e impresion de distencias entre elementos consecutivos
        System.out.println("--- distancias entre puntos consecutivos");
        for(int i=0;i< puntos.length -1;i++){
            //se calcula la didstancia desde el punto actual al punto siguiente
            double distancia= puntos [i].distanciaA(puntos[i+1]);
            System.out.println("distancia punto" + (i+1) +"->punto" +(i +2) + ":" +distancia);
            
        }
    }
}