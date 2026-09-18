import java.util.Scanner;
/** 
   *clase ejecutable para probar la instanciacion de cliente
   *utilizando la entrada de parametros desde el argumento del metodo main
   *@autor Enzo Romero
   *
   */
  public class ClienteTest{
      public static void main (String []args){
      if(args.length >=4){
          int dni = Integer.parseInt(args[0]);
          String apellido = args[1];
          String nombre=args[2];
          double saldo= Double.parseDouble(args[3]);
          Cliente unCliente= new Cliente(dni,apellido,nombre,saldo);
          unCliente.mostrar();
      }else{
          System.out.println("faltan argumentos");
      }
     
  }
}