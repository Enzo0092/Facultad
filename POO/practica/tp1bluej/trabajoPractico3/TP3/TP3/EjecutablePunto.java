public class EjecutablePunto
{
    public static void main(String args[]){
        Punto punto1 = new Punto(
        Double.parseDouble(args[1]),
        Double.parseDouble(args[1]));
        
        Punto punto2 = new Punto(
        Double.parseDouble(args[1]), 
        Double.parseDouble(args[1]));
        
        punto1.mostrar();
        punto2.mostrar();
        
        System.out.println("Distancia entre los puntos: " + punto1.distanciaA(punto2));        
    }
}