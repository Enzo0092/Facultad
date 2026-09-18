 

/**
 * Representa un producto comercializado por la droguería y sus condiciones de stock y precio.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Producto {
    
    // Atributos privados
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio; // Relación de conocimiento / Colaborador

    /**
     * Constructor completo para instanciar un producto con todos sus datos.
     * 
     * @param p_codigo Código identificador del producto.
     * @param p_rubro Rubro al que pertenece el producto.
     * @param p_desc Descripción del producto.
     * @param p_costo Precio de costo base.
     * @param p_porcPtoRepo Porcentaje para el punto de reposición.
     * @param p_existMinima Existencia mínima requerida.
     * @param p_lab Laboratorio que fabrica el producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0); // Regla de negocio: inicia en 0
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }

    /**
     * Constructor alternativo para dar de alta un producto por primera vez.
     * 
     * @param p_codigo Código identificador del producto.
     * @param p_rubro Rubro al que pertenece el producto.
     * @param p_desc Descripción del producto.
     * @param p_costo Precio de costo base.
     * @param p_lab Laboratorio que fabrica el producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0); // Regla de negocio: inicia en 0
        this.setLaboratorio(p_lab);
    }

    // Setters (Mutadores privados)

    private void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }

    private void setRubro(String p_rubro) {
        this.rubro = p_rubro;
    }

    private void setDescripcion(String p_desc) {
        this.descripcion = p_desc;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    private void setPorcPtoRepo(double p_porcPtoRepo) {
        this.porcPtoRepo = p_porcPtoRepo;
    }

    private void setExistMinima(int p_existMinima) {
        this.existMinima = p_existMinima;
    }

    private void setLaboratorio(Laboratorio p_laboratorio) {
        this.laboratorio = p_laboratorio;
    }

    // Getters (Observadores públicos)

    public int getCodigo() {
        return this.codigo;
    }

    public String getRubro() {
        return this.rubro;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    public int getStock() {
        return this.stock;
    }

    public double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }

    public int getExistMinima() {
        return this.existMinima;
    }

    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    // Comportamiento de la clase

    /**
     * Permite modificar el stock agregando o quitando unidades.
     * 
     * @param p_cantidad Cantidad a ajustar (positiva o negativa).
     */
    public void ajuste(int p_cantidad) {
        this.setStock(this.getStock() + p_cantidad);
    }

    /**
     * Calcula el precio de lista sumando un 12% al precio de costo.
     * 
     * @return El precio de lista calculado.
     */
    public double precioLista() {
        return this.getCosto() * 1.12;
    }

    /**
     * Calcula el precio contado aplicando un 5% de descuento al precio de lista.
     * 
     * @return El precio pago al contado.
     */
    public double precioContado() {
        return this.precioLista() * 0.95;
    }

    /**
     * Calcula el valor total del stock actual aplicando la rentabilidad del 12% sobre el costo.
     * 
     * @return El monto del stock valorizado.
     */
    public double stockValorizado() {
        return this.getStock() * this.precioLista();
    }

    /**
     * Asigna un nuevo porcentaje para el punto de reposición.
     * 
     * @param p_porce Nuevo porcentaje de reposición.
     */
    public void ajustarPtoRepo(double p_porce) {
        this.setPorcPtoRepo(p_porce);
    }

    /**
     * Asigna una nueva cantidad de existencia mínima.
     * 
     * @param p_cantidad Nueva cantidad para la existencia mínima.
     */
    public void ajustarExistMin(int p_cantidad) {
        this.setExistMinima(p_cantidad);
    }

    /**
     * Muestra en pantalla la información completa del producto y su laboratorio.
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: " + this.getLaboratorio().getDomicilio() + " Teléfono: " + this.getLaboratorio().getTelefono());
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripción: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - Stock Valorizado: $" + this.stockValorizado());
    }

    /**
     * Retorna una línea resumida con la descripción, precio de lista y precio de contado.
     * 
     * @return Cadena de texto formateada en una sola línea.
     */
    public String mostrarLinea() {
        return this.getDescripcion() + " " + this.precioLista() + " " + this.precioContado();
    }
}
