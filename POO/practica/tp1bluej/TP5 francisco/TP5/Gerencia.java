import java.util.ArrayList;

/**
 * Representa una gerencia que administra los alojamientos alquilados.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Gerencia
{
    //Atributos
    /**
     * Nombre de la gerencia.
     */
    private String nombre;

    /**
     * Lista de alojamientos alquilados.
     */
    private ArrayList<Alojamiento> alojamientosAlquilados;

    //Constructor
    /**
     * Construye una gerencia con su nombre y sus alojamientos alquilados.
     *
     * @param p_nombre nombre de la gerencia
     * @param p_alojamientosAlquilados lista de alojamientos alquilados
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados)
    {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientosAlquilados);
    }

    //Metodos
    /**
     * Establece el nombre de la gerencia.
     *
     * @param p_nombre nombre de la gerencia
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre; 
    }

    /**
     * Establece la lista de alojamientos alquilados.
     *
     * @param p_alojamientosAlquilados lista de alojamientos alquilados
     */
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados){
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }

    /**
     * Obtiene el nombre de la gerencia.
     *
     * @return nombre de la gerencia
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la lista de alojamientos alquilados.
     *
     * @return lista de alojamientos alquilados
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }

    /**
     * Agrega un alojamiento a la lista de alojamientos alquilados.
     *
     * @param p_alojamiento alojamiento que se desea agregar
     * @return true si el alojamiento se agrega correctamente
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.alojamientosAlquilados.add(p_alojamiento);
    }

    /**
     * Quita un alojamiento de la lista de alojamientos alquilados.
     *
     * @param p_alojamiento alojamiento que se desea quitar
     * @return true si se elimina el alojamiento
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.alojamientosAlquilados.remove(p_alojamiento);
    }

    /**
     * Cuenta los alojamientos del tipo indicado.
     *
     * @param tipoAlojamiento tipo de alojamiento que se desea contar
     * @return cantidad de alojamientos del tipo indicado
     */
    public int contarAlojamiento(String tipoAlojamiento){
        int total = 0;

        for (Alojamiento alojamiento : this.alojamientosAlquilados){
            total = total + alojamiento.contar(tipoAlojamiento);
        }

        return total;
    }

    /**
     * Muestra la liquidación de los alojamientos alquilados.
     */
    public void liquidar(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación-------------------");

        for (Alojamiento alojamiento : this.alojamientosAlquilados){
            System.out.println("Alojamiento: " + alojamiento.getNombre());
            System.out.println("Costo por " + alojamiento.getDiasAlquiler() + " dias: $" + alojamiento.getPreciobase() 
            * alojamiento.getDiasAlquiler());

            alojamiento.listarServicios();
            alojamiento.liquidar();
        }
    }

    /**
     * Muestra la liquidación y la cantidad de alojamientos de cada tipo.
     */
    public void mostrarLiquidacion(){
        this.liquidar();
        System.out.println("Alojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + this.contarAlojamiento("Hotel"));
    }
}