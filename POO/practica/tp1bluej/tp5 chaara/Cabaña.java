import java.util.ArrayList;

/**
 * Representa un tipo de alojamiento cabaña.
 * Modela el cálculo de costos con recargo diario por cantidad de habitaciones
 * y emite la liquidación correspondiente.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Cabaña extends Alojamiento {
    private int nroHabitaciones;

    /**
     * Construye una cabaña sin servicios iniciales contratados.
     * 
     * @param p_nombre nombre comercial de la cabaña.
     * @param p_precioBase precio base diario de estadía.
     * @param p_diasAlquiler cantidad de días de alquiler contratados.
     * @param p_nroHabitaciones número de habitaciones con las que cuenta la cabaña.
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, int p_nroHabitaciones) {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    /**
     * Construye una cabaña con una colección inicial de servicios extras.
     * 
     * @param p_nombre nombre comercial de la cabaña.
     * @param p_precioBase precio base diario de estadía.
     * @param p_diasAlquiler cantidad de días de alquiler contratados.
     * @param p_nroHabitaciones número de habitaciones con las que cuenta la cabaña.
     * @param p_servicios lista inicial de servicios adicionales contratados.
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_diasAlquiler, int p_nroHabitaciones, ArrayList<Servicio> p_servicios) {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    // Accesors
    private void setNroHabitaciones(int p_nroHabitaciones) {
        this.nroHabitaciones = p_nroHabitaciones;
    }

    public int getNroHabitaciones() {
        return this.nroHabitaciones;
    }

    /**
     * Calcula el costo neto de la estadía agregando $30 diarios por cada habitación al costo base.
     * 
     * @return costo total del alquiler de la cabaña sin incluir servicios extras.
     */
    @Override
    public double costo() {
        return super.costo() + (30.0 * this.getNroHabitaciones() * this.getDiasAlquiler());
    }

    /**
     * Determina si este alojamiento corresponde al tipo "Cabaña".
     * 
     * @param p_alojamiento cadena con el tipo de alojamiento a consultar.
     * @return 1 si coincide con el tipo cabaña, 0 en caso contrario.
     */
    @Override
    public int contar(String p_alojamiento) {
        if (p_alojamiento.equalsIgnoreCase("Cabaña") || p_alojamiento.equalsIgnoreCase("Cabania")) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Muestra la liquidación completa de la cabaña, imprimiendo los datos comunes,
     * el detalle de habitaciones y el total definitivo a abonar.
     */
    @Override
    public void liquidar() {
        super.liquidar();
        System.out.println("   Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        double total = this.costo() + this.costoServicios();
        System.out.println("\nTotal: ------> $" + total);
    }
}