import java.util.Scanner;
public class RegistroCivil
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //Objeto Mujer
        System.out.println("Ingrese nombre de la mujer: ");
        String nombre = teclado.next();
        
        System.out.println("Ingrese apellido de la mujer: ");
        String apellido = teclado.next();

        System.out.println("Ingrese edad de la mujer: ");
        int edad = teclado.nextInt();
        
        Mujer mujer1 = new Mujer(nombre, apellido, edad);
        
        //Objeto Hombre        
        System.out.println("Ingrese nombre del hombre: ");
        String nombreHombre = teclado.next();
        
        System.out.println("Ingrese apellido del hombre: ");
        String apellidoHombre = teclado.next();

        System.out.println("Ingrese edad del hombre: ");
        int edadHombre = teclado.nextInt();
        
        Hombre hombre1 = new Hombre(nombreHombre, apellidoHombre, edadHombre);
        
        mujer1.casarseCon(hombre1);
        hombre1.casarseCon(mujer1);

        hombre1.casadoCon();
    }
}