import java.util.ArrayList;

/**
 * Superclase abstracta que define la estructura y comportamiento base
 * de cualquier tipo de alojamiento ofrecido por la cadena hotelera.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public abstract class Alojamiento {
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    /**
     * Constructor que inicializa un alojamiento sin servicios adicionales.
     * 
     * @param p_nombre nombre comercial o fantasía del alojamiento.
     * @param p_precioBase costo base fijado por cada día de alquiler.
     * @param p_diasAlquiler cantidad total de días que durará la estadía.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<Servicio>());
    }

    /**
     * Constructor sobrecargado que inicializa un alojamiento con una lista preexistente de servicios.
     * 
     * @param p_nombre nombre comercial del alojamiento.
     * @param p_precioBase costo base diario.
     * @param p_diasAlquiler cantidad de días contratados.
     * @param p_servicios colección inicial de servicios extras solicitados.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios) {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    // Accesors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setPrecioBase(double p_precioBase) {
        this.precioBase = p_precioBase;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    private void setDiasAlquiler(int p_diasAlquiler) {
        this.diasAlquiler = p_diasAlquiler;
    }

    public int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    private void setServicios(ArrayList<Servicio> p_servicios) {
        this.servicios = p_servicios;
    }

    // Métodos para administrar la colección
    public boolean agregarServicio(Servicio p_servicio) {
        return this.servicios.add(p_servicio);
    }

    public boolean quitarServicio(Servicio p_servicio) {
        return this.servicios.remove(p_servicio);
    }

    public void listarServicios() {
        for (Servicio unServicio : this.servicios) {
            System.out.println("   " + unServicio.getDescripcion() + ": $" + unServicio.getPrecio());
        }
    }

    public double costoServicios() {
        double total = 0.0;
        for (Servicio unServicio : this.servicios) {
            total += unServicio.getPrecio();
        }
        return total;
    }

    /**
     * Calcula el costo base del alojamiento según los días de estadía y el precio diario.
     * 
     * @return costo base sin servicios ni adicionales propios de subclase.
     */
    public double costo() {
        return this.getDiasAlquiler() * this.getPrecioBase();
    }

    /**
     * Emite por consola la sección de liquidación común a todos los tipos de alojamiento.
     */
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
    }

    // Único método abstracto según el diagrama UML
    /**
     * Determina polimórficamente si el alojamiento coincide con el tipo consultado por la gerencia.
     * 
     * @param p_alojamiento etiqueta representativa del tipo ("Cabaña" u "Hotel").
     * @return 1 si el tipo coincide, 0 en caso contrario.
     */
    public abstract int contar(String p_alojamiento);
}