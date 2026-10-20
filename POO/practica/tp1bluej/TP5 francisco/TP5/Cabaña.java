import java.util.ArrayList;

/**
 * Representa una cabaña con una cantidad determinada de habitaciones.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Cabaña extends Alojamiento
{
    //Atributos
    /**
     * Cantidad de habitaciones de la cabaña.
     */
    private int nroHabitaciones;

    //Constructor
    /**
     * Construye una cabaña con sus datos y servicios.
     *
     * @param p_nroHabitaciones cantidad de habitaciones
     * @param p_nombre nombre de la cabaña
     * @param p_precioBase precio base de la cabaña
     * @param p_diasAlquiler cantidad de días de alquiler
     * @param p_servicios lista de servicios
     */
    public Cabaña(int p_nroHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    //Metodos
    /**
     * Establece la cantidad de habitaciones.
     *
     * @param p_nroHabitaciones cantidad de habitaciones
     */
    private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }

    /**
     * Obtiene la cantidad de habitaciones.
     *
     * @return cantidad de habitaciones
     */
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }

    /**
     * Indica si el alojamiento corresponde a una cabaña.
     *
     * @param p_alojamiento tipo de alojamiento a comparar
     * @return 1 si es una cabaña, 0 en caso contrario
     */
    public int contar(String p_alojamiento){
        if (p_alojamiento.equals("Cabaña")){
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Calcula el costo de la cabaña según su precio base, habitaciones y días de alquiler.
     *
     * @return costo de la cabaña
     */
    public double costo(){
        return getPreciobase() + this.getNroHabitaciones() * getDiasAlquiler() * 30;
    }

    /**
     * Muestra las características y el costo total de la cabaña.
     */
    public void liquidar(){
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: ------> $" + this.costo());
    }
}