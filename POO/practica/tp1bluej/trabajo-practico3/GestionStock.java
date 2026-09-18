/**
   El enunciado del práctico te pide realizar las siguientes acciones en el main():  
   Instanciar 1 producto (pasándole un laboratorio). 
   Asignarle un stock inicial de 500 unidades (usando el método ajuste()). 
   Mostrar por pantalla los datos completos del producto y su stock valorizado. 
   Simular la baja de 200 productos por rotura (usando ajuste(-200)) 
   y volver a mostrar su estado.
   Mostrar el precio de lista y el precio de contado ante la consulta de un cliente.  */
public class GestionStock{
    public static void main (String[]args){
        //instanciamos un objeto laboratorio (colaborador)
        Laboratorio laboratorio1= new Laboratorio("Colgate s.a","scalabrini ortiz 5524","54-11-4239-8447");
        //instanciamos el produto( su stock nace en 0 por regla de negocio)
        Producto producto1 = new Producto( 101, "perfumeria","jabon deluxe", 5.25, 10.0,50, laboratorio1);
        producto1.ajuste(500);
        System.out.println("estado inicial ");
        producto1.mostrar();
        producto1.ajuste(-200);
        producto1.mostrar();
        
        
    }
}