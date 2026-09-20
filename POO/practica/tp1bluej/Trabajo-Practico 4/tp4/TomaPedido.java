import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase ejecutable que simula la toma de un pedido para un cliente
 * lista los totales
 * quieta un producto del pedidovuelve a listar los totales
 * y vuelve a mostrar el detalle.
 * 
 * @author Enzo
 */
public class TomaPedido {

    public static void main(String[] args) {
        // 1. Instanciamos el laboratorio y los productos
        Laboratorio lab = new Laboratorio("Tech Lab", "Av. Siempre Viva 123", "011-1111-2222");

        Producto p1 = new Producto(1, "Informatica", "Pendrive", 9870.0, lab);
        Producto p2 = new Producto(2, "Libreria", "Libro-POO", 9500.0, lab);
        Producto p3 = new Producto(3, "Libreria", "Revista-user", 5300.0, lab);

        // 2. Instanciamos cliente y fecha
        Cliente cliente = new Cliente(30123456, "Gómez", "Carlos", 10000.0);
        Calendar fecha = new GregorianCalendar(2023, Calendar.AUGUST, 14);

        // 3. Crear el pedido agregando los productos iniciales
        Pedido pedido = new Pedido(fecha, cliente, p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // 4. Listar los totales iniciales (antes de quitar nada)
        System.out.println("=== TOTALES INICIALES ===");
        System.out.println("Total Contado: $" + pedido.totalAlContado());
        System.out.println("Total Financiado: $" + pedido.totalFinanciado());
        System.out.println();

        // 5. Quitar un producto del pedido
        System.out.println("--> Quitando el producto: " + p3.getDescripcion() + "...");
        pedido.quitarProducto(p3);
        System.out.println();

        // 6. Volver a listar los totales
        System.out.println("=== TOTALES LUEGO DE REMOVER UN PRODUCTO ===");
        System.out.println("Total Contado: $" + pedido.totalAlContado());
        System.out.println("Total Financiado: $" + pedido.totalFinanciado());
        System.out.println();

        // 7. Emitir el detalle del pedido completo
        System.out.println("=== EMISIÓN DEL DETALLE DEL PEDIDO ===");
        pedido.mostrarPedido();
    }
}