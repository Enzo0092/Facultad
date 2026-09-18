import java.util.Scanner;

public class Banco
{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero de DNI: ");
        int nroDni = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Ingrese nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese apellido: ");
        String apellido = teclado.nextLine();
        
        System.out.println("Ingrese año de nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        
        Persona persona1 = new Persona(nroDni, nombre, apellido, anioNacimiento);
        
        System.out.println("Ingrese numero de cuenta: ");
        int nroCuenta = teclado.nextInt();
        
        CuentaCorriente cuenta1 = new CuentaCorriente(nroCuenta, persona1);
        
        System.out.println("Ingrese numero de cuenta de la caja de ahorro: ");
        int nroCuentaCaja = teclado.nextInt();

        CajaDeAhorro caja1 = new CajaDeAhorro(nroCuentaCaja, persona1);
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Depositar en Cuenta Corriente");
        System.out.println("2. Extraer de Cuenta Corriente");
        System.out.println("3. Depositar en Caja de Ahorro");
        System.out.println("4. Extraer de Caja de Ahorro");
        System.out.println("5. Mostrar Cuenta Corriente");
        System.out.println("6. Mostrar Caja de Ahorro");

        int opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingrese el monto a depositar en Cuenta Corriente: ");
                double importeCuenta = teclado.nextDouble();
                cuenta1.depositar(importeCuenta);
                break;
            case 2:
                 System.out.println("Ingrese el monto a extraer de Cuenta Corriente: ");
                 double extraerCuenta = teclado.nextDouble();
                 cuenta1.extraer(extraerCuenta);
                break;
            case 3:
                System.out.println("Ingrese el monto a depositar en Caja de Ahorro: ");
                double importeCaja = teclado.nextDouble();
                caja1.depositar(importeCaja);
                break;
            case 4:
                System.out.println("Ingrese el monto a extraer de Caja de Ahorro: ");
                double extraerCaja = teclado.nextDouble();
                caja1.extraer(extraerCaja);
                break;
            case 5:
                cuenta1.mostrar();
                break;
            case 6:
                caja1.mostrar();
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
}
        