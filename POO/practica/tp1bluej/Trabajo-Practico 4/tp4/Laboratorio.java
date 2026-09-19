 

/**
 * Representa un laboratorio proveedor de la droguería con sus datos de contacto y condiciones comerciales.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Laboratorio {
    
    // Atributos privados
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor completo para instanciar un laboratorio con todos sus datos comerciales.
     * 
     * @param p_nombre Nombre del laboratorio.
     * @param p_domicilio Domicilio físico.
     * @param p_telefono Teléfono de contacto.
     * @param p_compraMinima Cantidad mínima de compra requerida.
     * @param p_diaEntrega Día pactado para la entrega de mercadería.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }

    /**
     * Constructor alternativo que inicializa la compra mínima y el día de entrega en 0.
     * 
     * @param p_nombre Nombre del laboratorio.
     * @param p_domicilio Domicilio físico.
     * @param p_telefono Teléfono de contacto.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }

    // Setters (Mutadores privados)

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    private void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }

    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    // Getters (Observadores públicos)

    /**
     * Obtiene el nombre del laboratorio.
     * 
     * @return Nombre del laboratorio.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el domicilio del laboratorio.
     * 
     * @return Domicilio del laboratorio.
     */
    public String getDomicilio() {
        return this.domicilio;
    }

    /**
     * Obtiene el teléfono de contacto.
     * 
     * @return Teléfono del laboratorio.
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Obtiene la cantidad correspondiente a la compra mínima.
     * 
     * @return Cantidad de la compra mínima.
     */
    public int getCompraMinima() {
        return this.compraMinima;
    }

    /**
     * Obtiene el día pactado de entrega.
     * 
     * @return Día de entrega.
     */
    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    // Métodos de comportamiento

    /**
     * Actualiza la compra mínima requerida por el laboratorio.
     * 
     * @param p_compraMinima Nueva cantidad de compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMinima) {
        this.setCompraMinima(p_compraMinima);
    }

    /**
     * Actualiza el día pactado de entrega del laboratorio.
     * 
     * @param p_diaEntrega Nuevo día de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEntrega) {
        this.setDiaEntrega(p_diaEntrega);
    }

    /**
     * Retorna una cadena formateada con los datos del laboratorio.
     * 
     * @return Datos básicos del laboratorio (nombre, domicilio y teléfono).
     */
    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " + this.getDomicilio() + " - " + "Teléfono: " + this.getTelefono();
    }
}
