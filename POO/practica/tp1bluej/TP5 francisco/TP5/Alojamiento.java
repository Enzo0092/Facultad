import java.util.ArrayList;

/**
 * Representa un alojamiento con su nombre, precio base, días de alquiler y servicios.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public abstract class Alojamiento
{
    //Atributos
    /**
     * Nombre del alojamiento.
     */
    private String nombre;

    /**
     * Precio base del alojamiento.
     */
    private double precioBase;

    /**
     * Cantidad de días de alquiler.
     */
    private int diasAlquiler;

    /**
     * Lista de servicios del alojamiento.
     */
    private ArrayList<Servicio> servicios;

    //Constructor
    /**
     * Construye un alojamiento con sus datos y servicios.
     *
     * @param p_nombre nombre del alojamiento
     * @param p_precioBase precio base del alojamiento
     * @param p_diasAlquiler cantidad de días de alquiler
     * @param p_servicios lista de servicios
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPreciobase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(p_servicios);
    }

    //Metodos
    /**
     * Establece el nombre del alojamiento.
     *
     * @param p_nombre nombre del alojamiento
     */
    private void setNombre(String p_nombre){
         this.nombre = p_nombre;
    }

    /**
     * Establece el precio base del alojamiento.
     *
     * @param p_precioBase precio base del alojamiento
     */
    private void setPreciobase(double p_precioBase){
        this.precioBase = p_precioBase;
    }

    /**
     * Establece la cantidad de días de alquiler.
     *
     * @param p_diasAlquiler cantidad de días de alquiler
     */
    private void setDiasAlquiler(int p_diasAlquiler){
        this.diasAlquiler = p_diasAlquiler;
    }

    /**
     * Establece la lista de servicios del alojamiento.
     *
     * @param p_servicios lista de servicios
     */
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }

    /**
     * Obtiene el nombre del alojamiento.
     *
     * @return nombre del alojamiento
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el precio base del alojamiento.
     *
     * @return precio base del alojamiento
     */
    public double getPreciobase(){
        return this.precioBase;
    }

    /**
     * Obtiene la cantidad de días de alquiler.
     *
     * @return cantidad de días de alquiler
     */
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }

    /**
     * Obtiene la lista de servicios del alojamiento.
     *
     * @return lista de servicios
     */
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }

    /**
     * Agrega un servicio a la lista de servicios.
     *
     * @param p_servicio servicio que se desea agregar
     * @return true si el servicio se agrega correctamente
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.servicios.add(p_servicio);
    }

    /**
     * Quita un servicio de la lista de servicios.
     *
     * @param p_servicio servicio que se desea quitar
     * @return true si se elimina el servicio
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.servicios.remove(p_servicio);
    }

    /**
     * Calcula el costo total del alojamiento.
     *
     * @return costo del alojamiento
     */
    public abstract double costo();

    /**
     * Muestra los servicios del alojamiento y sus precios.
     */
    public void listarServicios(){
        for (Servicio servicio : this.servicios){
            System.out.println(servicio.getDescripcion() + ": $" + servicio.getPrecio());
        }
    }

    /**
     * Cuenta los alojamientos que coinciden con el nombre indicado.
     *
     * @param p_alojamiento nombre del alojamiento a contar
     * @return cantidad de coincidencias
     */
    public abstract int contar(String p_alojamiento);

    /**
     * Calcula el costo total de los servicios.
     *
     * @return suma de los precios de los servicios
     */
    public double costoServicios(){
        double totalServicios = 0;

        for (Servicio servicio : this.servicios){
            totalServicios = totalServicios + servicio.getPrecio();
        }

        return totalServicios;
    }

    /**
     * Muestra los datos del alojamiento, su costo y los servicios.
     */
    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
    }
}