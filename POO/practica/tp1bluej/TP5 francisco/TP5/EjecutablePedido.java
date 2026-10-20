/**
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
import java.util.ArrayList;

public class EjecutablePedido
{
    public static void main(){
        
        //Premium
        int colores = 3;
        double costop = 500;
        
        Premium premium = new Premium(colores, costop);
        
        //Comun 
        double plus = 100;
        double costoc = 500;

        Comun comun = new Comun(plus, costoc);
    
        //renglones
        int cantidad = 5;
        double preciop = premium.precio(5);
        double precioc = comun.precio(5);
        
        Renglon renglonPremium = new Renglon(cantidad, preciop, premium);
        Renglon renglonComun = new Renglon(cantidad, precioc, comun);
        
        //Pedido
        ArrayList<Renglon> renglones = new ArrayList<Renglon>();
        renglones.add(renglonPremium);
        renglones.add(renglonComun);
        
        Pedido pedido = new Pedido(renglones);
        
        pedido.mostrar();
    }
}