import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa una delegación de visitantes del zoológico.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Delegacion extends Visitante
{
    //Atributos
    /**
     * Lista de integrantes de la delegación.
     */
    private ArrayList<Individuo> integrantes;

    //Constructor
    /**
     * Construye una delegación con sus integrantes, nombre y fecha de visita.
     *
     * @param p_integrantes lista de integrantes de la delegación
     * @param p_nombre nombre de la delegación
     * @param p_fechaVisita fecha de la visita
     */
    public Delegacion(ArrayList<Individuo> p_integrantes, String p_nombre, Calendar p_fechaVisita)
    {
        super(p_nombre, p_fechaVisita);
        this.setIntegrantes(p_integrantes);
    }

    //Metodos
    /**
     * Establece la lista de integrantes de la delegación.
     *
     * @param p_integrantes lista de integrantes
     */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }

    /**
     * Obtiene la lista de integrantes de la delegación.
     *
     * @return lista de integrantes
     */
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }

    /**
     * Obtiene el tipo de visitante.
     *
     * @return tipo de visitante
     */
    public String tipoVisitante(){
        return "Delegacion"; 
    }

    /**
     * Inscribe un individuo en la delegación.
     *
     * @param p_individuo individuo que se desea inscribir
     */
    public void inscribirIndividuo(Individuo p_individuo){
        this.integrantes.add(p_individuo);
    }

    /**
     * Quita un integrante de la delegación.
     *
     * @param p_individuo individuo que se desea quitar
     * @return true si se elimina el integrante
     */
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.integrantes.remove(p_individuo);
    }

    /**
     * Cuenta la cantidad de integrantes de la delegación.
     *
     * @return cantidad de integrantes
     */
    public int cantidadIntegrantes(){
        int total = 0;

        for (Individuo individuo : integrantes) {
            total = total + 1;
        }

        return total;
    }

    /**
     * Muestra los datos de la delegación y sus integrantes.
     */
    public void mostrar(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Delegacion: " + getNombre());
        System.out.println("Integrantes: ");
        for (Individuo individuo : integrantes) {
            individuo.mostrar();
        }
        System.out.println("-------------------------------------------------------------");
    }

    /**
     * Calcula el precio total de las entradas de la delegación con el descuento correspondiente.
     *
     * @return precio total de las entradas
     */
    public double entrada(){
        double total = 0;

        for (Individuo individuo : integrantes) {
            total = (total + 10.00);
        }

        return total  * 0.90;
    }

    /**
     * Muestra la delegación si coincide la fecha y el tipo de visitante indicados.
     *
     * @param p_fecha fecha de la visita
     * @param p_visitante tipo de visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(getFechaVisita().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)){
            this.mostrar();
        }
    }

    /**
     * Obtiene las personas asociadas a los integrantes de la delegación.
     *
     * @return conjunto de personas de los integrantes
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> persona = new HashSet<Persona>();
            for (Individuo individuo : integrantes) {
                persona.add(individuo.getPersona());
            }

        return persona;
    }
}