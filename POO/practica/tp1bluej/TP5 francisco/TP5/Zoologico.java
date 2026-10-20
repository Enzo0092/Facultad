import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa un zoológico con su nombre y los visitantes registrados.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Zoologico
{
    //Atributos
    /**
     * Nombre del zoológico.
     */
    private String nombre;

    /**
     * Lista de visitantes del zoológico.
     */
    private ArrayList<Visitante> visitantes;

    //Constructor
    /**
     * Construye un zoológico con su nombre y una lista de visitantes.
     *
     * @param p_nombre nombre del zoológico
     * @param p_visitantes lista de visitantes
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes)
    {
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }

    //Metodos
    /**
     * Establece el nombre del zoológico.
     *
     * @param p_nombre nombre del zoológico
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Establece la lista de visitantes.
     *
     * @param p_visitantes lista de visitantes
     */
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }

    /**
     * Obtiene el nombre del zoológico.
     *
     * @return nombre del zoológico
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la lista de visitantes.
     *
     * @return lista de visitantes
     */
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }

    /**
     * Agrega un nuevo visitante al zoológico.
     *
     * @param p_visitante visitante que se desea agregar
     */
    public void nuevoVisitante(Visitante p_visitante){
         this.visitantes.add(p_visitante);
    }

    /**
     * Quita un visitante de la lista.
     *
     * @param p_visitante visitante que se desea quitar
     * @return true si se elimina el visitante
     */
    public boolean quitarVisitante(Visitante p_visitante){
        return this.visitantes.remove(p_visitante);
    }

    /**
     * Muestra los visitantes de un tipo determinado que asistieron en una fecha.
     *
     * @param p_fecha fecha de la visita
     * @param p_tipoVisitante tipo de visitante
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for (Visitante visitante : this.visitantes){
            if (visitante.tipoVisitante().equals(p_tipoVisitante) &&
                visitante.getFechaVisita().equals(p_fecha)){
                visitante.mostrar();
            }
        }
    }

    /**
     * Muestra los visitantes registrados en una fecha determinada.
     *
     * @param p_fecha fecha de la visita
     */
    public void listarVisitantePorFecha(Calendar p_fecha){
        for (Visitante visitante : this.visitantes){
           if (visitante.getFechaVisita().equals(p_fecha)){
              visitante.mostrar();
           }
        }
    }

    /**
     * Calcula la recaudación entre dos fechas, inclusive.
     *
     * @param p_fechaDesde fecha inicial del período
     * @param p_fechaHasta fecha final del período
     * @return recaudación total del período
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0;

        for (Visitante visitante : this.visitantes){
           if (!visitante.getFechaVisita().before(p_fechaDesde) &&
              !visitante.getFechaVisita().after(p_fechaHasta)){
              total = total + visitante.entrada();
           }
        }

        return total;
    }

    /**
     * Obtiene el conjunto de personas que visitaron el zoológico.
     *
     * @return conjunto de personas que realizaron visitas
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> persona = new HashSet<Persona>();
            for (Visitante visitante : visitantes) {
                persona.addAll(visitante.listarPersonas());
            }    
        return persona;
    }
}