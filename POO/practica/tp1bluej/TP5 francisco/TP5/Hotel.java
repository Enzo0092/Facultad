import java.util.ArrayList;

/**
 * Representa un hotel con un tipo de habitación determinado.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Hotel extends Alojamiento
{
    //Atributos
    /**
     * Tipo de habitación del hotel.
     */
    private String tipoHabitacion;

    //Constructor
    /**
     * Construye un hotel con sus datos y servicios.
     *
     * @param p_tipoHabitacion tipo de habitación
     * @param p_nombre nombre del hotel
     * @param p_precioBase precio base del hotel
     * @param p_diasAlquiler cantidad de días de alquiler
     * @param p_servicios lista de servicios
     */
    public Hotel(String p_tipoHabitacion, String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    //Metodos
    /**
     * Establece el tipo de habitación.
     *
     * @param p_tipoHabitacion tipo de habitación
     */
    private void setTipoHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion = p_tipoHabitacion;
    }

    /**
     * Obtiene el tipo de habitación.
     *
     * @return tipo de habitación
     */
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }

    /**
     * Indica si el alojamiento corresponde a un hotel.
     *
     * @param p_alojamiento tipo de alojamiento a comparar
     * @return 1 si es un hotel, 0 en caso contrario
     */
    public int contar(String p_alojamiento){
        if (p_alojamiento.equals("Hotel")){
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Calcula el costo del hotel según el precio base, el tipo de habitación y los días de alquiler.
     *
     * @return costo del hotel
     */
    public double costo(){
        if(this.tipoHabitacion.equals("Single")){
            return getPreciobase() + 20 * getDiasAlquiler();
        }else{
            return getPreciobase() + 35 * getDiasAlquiler();
        }
    }

    /**
     * Muestra el tipo de habitación y el costo total del hotel.
     */
    public void liquidar(){
        System.out.println("Habitacion " + this.tipoHabitacion); 
        System.out.println("Total: ------> $" + this.costo());
    }
}