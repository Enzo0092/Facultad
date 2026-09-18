public class EjecutableProducto
{
    public static void main(String args[]){
        Laboratorio laboratorio1 = new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11 -4239-8447");
        
        Producto producto1 = new Producto(201, "Perfumería", "Jabón Deluxe", 5.25, 10.0, 100,  laboratorio1);
        
        producto1.ajuste(500);
        
        producto1.mostrar();
        
        producto1.ajuste(-200);
        
        producto1.mostrar();
        
        System.out.println("Precio de lista: $" + producto1.precioLista());
        System.out.println("Precio al contado: $" + producto1.precioContado());
        
        System.out.println(producto1.mostrarLinea());
    }
}