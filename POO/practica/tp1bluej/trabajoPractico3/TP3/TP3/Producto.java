/**
 * Representa un producto.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Producto
{
    //Atributos
    /**
     * Codigo del producto.
     */
    private int codigo;
    
    /**
     * Rubro al que pertenece el producto.
     */
    private String rubro;
    
    /**
     * Descripcion del producto.
     */
    private String descripcion;
    
    /**
     * Costo del producto.
     */
    private double costo;
    
    /**
     * Cantidad de unidades disponibles del producto.
     */
    private int stock;
    
    /**
     * Porcentaje del punto de reposicion del producto.
     */
    private double porcPtoRepo;
    
    /**
     * Existencia minima del producto.
     */
    private int existMinima;
    
    /**
     * Laboratorio asociado al producto.
     */
    private Laboratorio laboratorio;
    
    //Constructores
    /**
     * Construye un producto con los datos indicados.
     *
     * @param p_codigo Codigo del producto.
     * @param p_rubro Rubro al que pertenece el producto.
     * @param p_descripcion Descripcion del producto.
     * @param p_costo Costo del producto.
     * @param p_porcPtoRepo Porcentaje del punto de reposicion.
     * @param p_existMinima Existencia minima del producto.
     * @param p_laboratorio Laboratorio asociado al producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, double p_porcPtoRepo, 
    int p_existMinima, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
        this.stock = 0;
    }
    
    /**
     * Construye un producto con los datos indicados.
     *
     * @param p_codigo Codigo del producto.
     * @param p_rubro Rubro al que pertenece el producto.
     * @param p_descripcion Descripcion del producto.
     * @param p_costo Costo del producto.
     * @param p_laboratorio Laboratorio asociado al producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setLaboratorio(p_laboratorio);
        this.stock = 0;
    }
    
    //Metodos
    /**
     * Establece el codigo del producto.
     *
     * @param p_codigo Codigo del producto.
     */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    /**
     * Establece el rubro del producto.
     *
     * @param p_rubro Rubro del producto.
     */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    /**
     * Establece la descripcion del producto.
     *
     * @param p_descripcion Descripcion del producto.
     */
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    
    /**
     * Establece el costo del producto.
     *
     * @param p_costo Costo del producto.
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    /**
     * Establece el porcentaje del punto de reposicion.
     *
     * @param p_porcPtoRepo Porcentaje del punto de reposicion.
     */
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }

    /**
     * Establece la existencia minima del producto.
     *
     * @param p_existMinima Existencia minima del producto.
     */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    /**
     * Establece el laboratorio asociado al producto.
     *
     * @param p_laboratorio Laboratorio asociado al producto.
     */
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    
    /**
     * Obtiene el codigo del producto.
     *
     * @return Codigo del producto.
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Obtiene el rubro del producto.
     *
     * @return Rubro del producto.
     */
    public String getRubro(){
        return this.rubro;
    }
    
    /**
     * Obtiene la descripcion del producto.
     *
     * @return Descripcion del producto.
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Obtiene el costo del producto.
     *
     * @return Costo del producto.
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Obtiene el porcentaje del punto de reposicion.
     *
     * @return Porcentaje del punto de reposicion.
     */
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
   
    /**
     * Obtiene la existencia minima del producto.
     *
     * @return Existencia minima del producto.
     */
    public int getExistMinima(){
        return this.existMinima;
    }
    
    /**
     * Obtiene el laboratorio asociado al producto.
     *
     * @return Laboratorio asociado al producto.
     */
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    /**
     * Obtiene el stock del producto.
     *
     * @return Stock del producto.
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Muestra los datos del producto.
     */
    public void mostrar(){
        System.out.println("Laboratorio: " + this.laboratorio.getNombre());
        System.out.println("Domicilio: " + this.laboratorio.getDomicilio() + " - Telefono: " + this.laboratorio.getTelefono());
        System.out.println("Rubro: " + this.rubro);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio Costo: " + this.costo);
        System.out.println("Stock: " + this.stock + " - Stock Valorizado: $" + this.stockValorizado());
    }
    
    /**
     * Ajusta el stock del producto.
     *
     * @param p_cantidad Cantidad a agregar o quitar del stock.
     */
    public void ajuste(int p_cantidad){
        this.stock = this.stock + p_cantidad;
    }
    
    /**
     * Calcula el valor del stock del producto.
     *
     * @return Valor del stock del producto.
     */
    public double stockValorizado(){
        return (this.stock * this.costo) * 1.12;
    }
    
    /**
     * Calcula el precio de lista del producto.
     *
     * @return Precio de lista del producto.
     */
    public double precioLista(){
        return this.costo * 1.12;
    }
    
    /**
     * Calcula el precio de contado del producto.
     *
     * @return Precio de contado del producto.
     */
    public double precioContado(){
        return this.precioLista() * 0.95;
    }
    
    /**
     * Muestra los datos principales del producto en forma textual.
     *
     * @return Datos principales del producto.
     */
    public String mostrarLinea(){
        return descripcion + " " + precioLista() + " " + precioContado();
    }
    
    /**
     * Ajusta el porcentaje del punto de reposicion.
     *
     * @param p_porce Porcentaje del punto de reposicion.
     */
    public void ajustarPtoRepo(double p_porce){
        this.porcPtoRepo = p_porce;
    }
    
    /**
     * Ajusta la existencia minima del producto.
     *
     * @param p_cantidad Cantidad correspondiente a la existencia minima.
     */
    public void ajustarExistMin(int p_cantidad){
        this.existMinima = p_cantidad;
    }   
}
   