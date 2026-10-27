import java.util.Calendar;
import java.util.HashSet;

/**
 * Superclase abstracta que modela los datos comunes de cualquier visitante
 * al parque zoológico (individuos o delegaciones).
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public abstract class Visitante {
    private String nombre;
    private Calendar fechaVisita;

    /**
     * Construye un visitante asignando su denominación y fecha de concurrencia.
     * 
     * @param p_nombre nombre del visitante o identificación del grupo.
     * @param p_fechaVisita fecha en la que se realiza la visita al zoológico.
     */
    public Visitante(String p_nombre, Calendar p_fechaVisita) {
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }

    // Accesors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setFechaVisita(Calendar p_fechaVisita) {
        this.fechaVisita = p_fechaVisita;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Calendar getFechaVisita() {
        return this.fechaVisita;
    }

    // Métodos abstractos a implementar obligatoriamente por las subclases
    /**
     * Muestra por consola la información y detalle del visitante según su tipo.
     */
    public abstract void mostrar();

    /**
     * Calcula el costo neto de la entrada para el visitante.
     * 
     * @return importe monetario de la entrada.
     */
    public abstract double entrada();

    /**
     * Muestra los datos del visitante si coincide con la fecha y el tipo consultados.
     * 
     * @param p_fecha fecha de visita a filtrar.
     * @param p_visitante tipo de visitante a filtrar ("Individuo" o "Delegación").
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);

    /**
     * Retorna una cadena identificatoria del tipo concreto de visitante.
     * 
     * @return "Individuo" o "Delegación".
     */
    public abstract String tipoVisitante();

    /**
     * Retorna el conjunto de personas físicas asociadas a la visita sin repeticiones.
     * 
     * @return colección HashSet con las instancias de Persona.
     */
    public abstract HashSet<Persona> listarPersonas();
}