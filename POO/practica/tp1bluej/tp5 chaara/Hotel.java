import java.util.ArrayList;

/**
 * Representa un tipo de alojamiento en hotel.
 * Modela el cálculo de costos con recargo diario según el tipo de habitación ("Single" o "Doble")
 * y emite la liquidación correspondiente.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Hotel extends Alojamiento {
    private String tipoHabitacion;

    /**
     * Construye un hotel sin servicios iniciales contratados.
     * 
     * @param p_nombre nombre comercial del hotel.
     * @param p_precioBase precio base diario de estadía.
     * @param p_diasAlquiler cantidad de días contratados.
     * @param p_tipoHabitacion categoría o tipo de habitación ("Single" o "Doble").
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    /**
     * Construye un hotel con una colección inicial de servicios extras contratados.
     * 
     * @param p_nombre nombre comercial del hotel.
     * @param p_precioBase precio base diario de estadía.
     * @param p_diasAlquiler cantidad de días contratados.
     * @param p_tipoHabitacion categoría o tipo de habitación ("Single" o "Doble").
     * @param p_servicios lista inicial de servicios adicionales contratados.
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, String p_tipoHabitacion, ArrayList<Servicio> p_servicios) {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    // Accesors
    private void setTipoHabitacion(String p_tipoHabitacion) {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    /**
     * Calcula el costo neto de la estadía sumando el recargo diario por tipo de habitación:
     * $20 por día para "Single" y $35 por día para "Doble".
     * 
     * @return costo total del hotel sin incluir los servicios extras.
     */
    @Override
    public double costo() {
        return super.costo() + (this.getTipoHabitacion().equalsIgnoreCase("Single") ? 20.0 : 35.0) * this.getDiasAlquiler();
    }

    /**
     * Determina si este alojamiento corresponde al tipo "Hotel".
     * 
     * @param p_alojamiento cadena con el tipo de alojamiento a consultar.
     * @return 1 si coincide con el tipo hotel, 0 en caso contrario.
     */
    @Override
    public int contar(String p_alojamiento) {
        return p_alojamiento.equalsIgnoreCase("Hotel") ? 1 : 0;
    }

    /**
     * Muestra la liquidación completa del hotel, imprimiendo los datos comunes,
     * el tipo de habitación y el total definitivo a abonar (estadía más servicios).
     */
    @Override
    public void liquidar() {
        super.liquidar();
        System.out.println("   Habitacion " + this.getTipoHabitacion());
        double total = this.costo() + this.costoServicios();
        System.out.println("\nTotal: ------> $" + total);
    }
}