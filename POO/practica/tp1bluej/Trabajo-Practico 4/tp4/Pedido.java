import java.util.Calendar;
import java.util.ArrayList;
/**
 * clase que representa un pedidio realizado por un cliente
 * administra una coleccion de producots mediante un Array List
 * @author Enzo Romero
 * @version 1.0
 */
public class Pedido{
    private Cliente cliente;
    private Calendar fecha;
    private ArrayList productos; // varaible de instancia para unalista dinamica homogenea
    
    /**
     * constructor que recibe la lista completa de producos
     * @param p_fecha fecha en la que se realiza el pedido
     * @param p_cliente cliente que realiza el pedido
     * @para p_productos lista dinamicamente instanciada con los productos
     */    
    public Pedido(Calendar p_fecha, Cliente p_cliente,ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
       
      /**
     * constructor que recibe un solo producto inicial
     * inicializa el array list y le agrega el producto recibido
     * @param p_fecha fecha en la que se realiza el pedido 
     * @param p_cliente cliente que realiza el pedido
     * @p_producto primer producto a incluir en el pedido
     */ 
  
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
    this.setFecha(p_fecha);
    this.setCliente(p_cliente);
    this.setProductos(new ArrayList());
    this.agregarProducto(p_producto);
    
}
// seters privados y getters publicos
    private void setFecha(Calendar p_fecha){
        this.fecha=p_fecha;
    }
    private void setCliente(Cliente p_cliente){
        this.cliente=p_cliente;
    }
    private void setProductos(ArrayList p_productos){
        this.productos=p_productos;
    }
    //getters publicos
    /**
     * @return la fecha del pedido
     */
    public Calendar getFecha(){
        return this.fecha;
    }
    /**
     * @return el cliente asociado al pedido
     */
    public Cliente getCliente(){
        return this.cliente;
    }
    /**
     * @return la lista e productos del pedido
     */
    
    public ArrayList getProductos(){
        return this.productos;
    }
    // metodos de administracionde coleccion---
    /**
     * agrega unproducto a la lista del pedido
     * @param p_producto objeto producto a incorporar
     * @return true si se agrego correctamente
     * 
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
        
    }
    /**
     * @param p_producto Objeto Pruducto a remover
     * @return true si el producto existia y se removio
     */
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    // metodos de calculo de totales---
    /**
     * calcula la suma de los precios al contado de todos los productos
     * @return el importe total al contado
     */
    public double totalAlContado(){
        double total=0.0;
        for(Object obj :this.getProductos()){
            Producto prod= (Producto) obj; // casteo explicito
            total+=prod.precioContado();
        }
        return total;
        }
    /**
     * calcula la suma de los precios de lista 8 financiados) de todos los 
     * producos del pedido
     * @return el importe total financiado
     */
    
    public double totalFinanciado(){
        double total=0.0;
        for(Object obj: this.getProductos()){
        Producto prod=(Producto) obj; //casteo explicito
        total += prod.precioLista();
    }
    return total;
    }
    // metodos de mostrado 
    /** muestra por consola el detalle competo del pedido
     * incluyendo fecha ,datos del cliente la lista de productos
     * mediante mostrarLinea()y los totales finales
     */
    public void mostrarPedido(){
        int dia=this.getFecha().get(Calendar.DATE);
        int mes = this.getFecha().get(Calendar.MONTH)+1;
        int anio= this.getFecha().get(Calendar.YEAR);
        System.out.println("****** Detalle del Pedido ******");
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
        System.out.println("Cliente: " + this.getCliente().nomYApe());
        System.out.println("------------------------------------------------");
        for (Object obj: this.getProductos()){
            Producto prod= (Producto) obj;
            System.out.println(prod.mostrarLinea());
        }
        System.out.println("------------------------------------------------");
        System.out.println("Total Contado: $" + this.totalAlContado());
        System.out.println("Total Financiado: $" + this.totalFinanciado());
    }
}

  
