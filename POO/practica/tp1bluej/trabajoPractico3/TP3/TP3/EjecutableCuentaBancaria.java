import java.util.Scanner;

public class EjecutableCuentaBancaria
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese DNI:"); 
        int dni = teclado.nextInt(); 
        
        System.out.println("Ingrese nombre:"); 
        String nombre = teclado.next(); 
        
        System.out.println("Ingrese apellido:"); 
        String apellido = teclado.next(); 
        
        System.out.println("Ingrese año de nacimiento:"); 
        int anioNacimiento = teclado.nextInt(); 
        
        Persona persona1 = new Persona(dni, nombre, apellido, anioNacimiento); 
        
        System.out.println("Ingrese número de cuenta:"); 
        int numeroCuenta = teclado.nextInt(); 
        
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta, persona1);

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Depositar");
        System.out.println("2. Extraer");
        System.out.println("3. Consultar saldo");
        int opcion = teclado.nextInt();
        
        if(opcion == 1){
            System.out.println("Ingrese el importe a depositar:");
            double importe = teclado.nextDouble();
            cuenta1.depositar(importe);
            }else if(opcion == 2){
                System.out.println("Ingrese el importe a extraer:");
                double importe = teclado.nextDouble();
                cuenta1.extraer(importe);
                }else if(opcion == 3){
                    System.out.println("Saldo actual: $" + cuenta1.getSaldo());
                }else{
                    System.out.println("Opción incorrecta.");
                }
    }
} 