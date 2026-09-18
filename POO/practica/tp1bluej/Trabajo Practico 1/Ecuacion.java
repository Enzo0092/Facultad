public class Ecuacion {
    public static void main (String []args){
    double a= Double.parseDouble(args[0]);
    double b= Double.parseDouble(args[1]);
    double c= Double.parseDouble(args[2]);
    double raiz1, raiz2;
    double discriminante= Math.pow (b,2) -4*a*c;
        if(discriminante ==0){
            raiz1= (-b)/2*a;
            System.out.println("raiz doble:"+ raiz1);
        }else{
            if(discriminante >0){
                raiz1=(((-b)+ Math.sqrt (discriminante))/(2*a));
                raiz2=(((-b)- Math.sqrt (discriminante))/(2*a));
                System.out.println("raiz 1:" + raiz1);
                System.out.println("raiz 2 :" +raiz2);
                
            }else{
                System.out.println("raices complejas ");
            }
        }
    
    }
}