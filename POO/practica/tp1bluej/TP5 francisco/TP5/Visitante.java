import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa un visitante del zoológico.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public abstract class Visitante
{
    //Atributo
    /**
     * Nombre del visitante.
     */
    private String nombre;

    /**
     * Fecha de la visita.
     */
    private Calendar fechaVisita; 

    //Constructor
    /**
     * Construye un visitante con su nombre y fecha de visita.
     *
     * @param p_nombre nombre del visitante
     * @param p_fechaVisita fecha de la visita
     */
    public Visitante(String p_nombre, Calendar p_fechaVisita){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }

    //Metodo
    /**
     * Establece el nombre del visitante.
     *
     * @param p_nombre nombre del visitante
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Establece la fecha de visita.
     *
     * @param p_fechaVisita fecha de la visita
     */
    private void setFechaVisita(Calendar p_fechaVisita){
        this.fechaVisita = p_fechaVisita;
    }

    /**
     * Obtiene el nombre del visitante.
     *
     * @return nombre del visitante
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la fecha de visita.
     *
     * @return fecha de la visita
     */
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }

    /**
     * Muestra la información del visitante.
     */
    public abstract void mostrar();

    /**
     * Calcula el precio de la entrada del visitante.
     *
     * @return precio de la entrada
     */
    public abstract double entrada();

    /**
     * Lista visitantes según la fecha y el tipo indicado.
     *
     * @param p_fecha fecha de la visita
     * @param p_visitante tipo de visitante
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);

    /**
     * Obtiene el tipo de visitante.
     *
     * @return tipo de visitante
     */
    public abstract String tipoVisitante();

    /**
     * Obtiene las personas asociadas al visitante.
     *
     * @return conjunto de personas
     */
    public abstract HashSet<Persona> listarPersonas();
}