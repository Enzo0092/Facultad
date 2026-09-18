/**
 * Representa un laboratorio y su informacion.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Laboratorio
{
    //Atributos  
    /** 
      * Nombre del laboratorio. 
      */ 
    private String nombre; 
    /** 
      * Domicilio del laboratorio. 
      */ 
    private String domicilio; 
    /** 
      * Numero de telefono del laboratorio. 
      */ 
    private String telefono; 
    /** 
      * Compra minima del laboratorio. 
      */ 
    private int compraMinima; 
    /** 
      * Dia de entrega de la compra. 
      */ 
    private int diaEntrega;
    
    //Constructores
    /**
     * Construye un laboratorio con todos los datos indicados.
     * 
     * @param p_nombre nombre del laboratorio.
     * @param p_domicilio domicilio del laboratorio.
     * @param p_telefono número de teléfono del laboratorio.
     * @param p_compraMinima compra mínima del laboratorio.
     * @param p_diaEntrega día de entrega de la compra.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * Construye un laboratorio con los datos básicos indicados.
     * 
     * @param p_nombre nombre del laboratorio.
     * @param p_domicilio domicilio del laboratorio.
     * @param p_telefono número de teléfono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    //Metodos
    /**
     * Establece el nombre del laboratorio.
     *
     * @param p_nombre Nombre del laboratorio.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el domicilio del laboratorio.
     *
     * @param p_domicilio Domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Establece el telefono del laboratorio.
     *
     * @param p_telefono Telefono del laboratorio.
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    /**
     * Establece la compra minima del laboratorio.
     *
     * @param p_compraMinima Compra minima del laboratorio.
     */
    private void setCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    
    /**
     * Establece el dia de entrega de la compra del laboratorio.
     *
     * @param p_diaEntrega Dia de entrega de la compra del laboratorio.
     */
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    /**
     * Obtiene el nombre del laboratorio.
     *
     * @return Nombre del laboratorio.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el domicilio del laboratorio.
     *
     * @return Domicilio del laboratorio.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Obtiene el telefono del laboratorio.
     *
     * @return Telefono del laboratorio.
     */
    public String getTelefono(){
        return this.telefono;
    }
    
    /**
     * Obtiene la compra minima del laboratorio.
     *
     * @return Compra minima del laboratorio.
     */
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    /**
     * Obtiene el dia de entrega del laboratorio.
     *
     * @return Dia de entrega del laboratorio.
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * Actualiza el valor de la compra minima del laboratorio.
     *
     * @param p_compraMinima Nuevo valor de la compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    
    /**
     * Actualiza el dia de entrega del laboratorio.
     *
     * @param p_diaEntrega Nuevo dia de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    /**
     * Muestra los datos del laboratorio.
     */
    public String mostrar(){
        return "Laboratorio: " + this.nombre + "\n" + "Domicilio: " + this.domicilio + " - Telefono: " + this.telefono;
    }
}