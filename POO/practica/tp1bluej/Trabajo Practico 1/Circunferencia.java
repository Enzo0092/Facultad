public class Circunferencia {//creo la clase Circunferencia 
    //calcular el perimetro de una circuneferencia pasando el radio como parametro del main 
    public static void main (String[] args){
    int radio=Integer.parseInt(args[0]);
    double perimetro= 2* Math.PI * radio;
    System.out.println("el perimetro de la circunferencia es "+ perimetro);
}
}