import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa a un visitante individual de un zoológico.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Individuo extends Visitante
{
    //Atributos
    /** Persona asociada al visitante. */
    private Persona persona;

    //Constructor
    /**
     * Construye un visitante individual.
     *
     * @param p_persona persona asociada al visitante
     * @param p_nombre nombre del visitante
     * @param p_fechaVisita fecha de la visita
     */
    public Individuo(Persona p_persona, String p_nombre, Calendar p_fechaVisita)
    {
        super(p_nombre, p_fechaVisita);
        this.setPersona(p_persona);
    }

    //Metodos
    /**
     * Establece la persona asociada al visitante.
     *
     * @param p_persona persona que se asociará al visitante
     */
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }

    /**
     * Devuelve la persona asociada al visitante.
     *
     * @return persona asociada al visitante
     */
    public Persona getPersona(){
        return this.persona;
    }

    /**
     * Indica el tipo de visitante.
     *
     * @return tipo de visitante
     */
    public String tipoVisitante(){
        return "Individuo";
    }

    /**
     * Muestra al visitante si coincide con la fecha y el tipo indicados.
     *
     * @param p_fecha fecha que se desea consultar
     * @param p_visitante tipo de visitante que se desea consultar
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)){
            this.mostrar();
        }
    }

    /**
     * Muestra los datos del visitante, incluyendo su DNI y edad.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + getNombre());
        System.out.println("DNI: " + this.getPersona().getDNI() + " Edad: " + this.getPersona().edad());
    }

    /**
     * Devuelve el precio de la entrada individual.
     *
     * @return precio de la entrada
     */
    public double entrada(){
        double valor = 10.00;
        return valor;
    }

    /**
     * Devuelve un conjunto con la persona asociada al visitante.
     *
     * @return conjunto de personas
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> persona = new HashSet<Persona>();
        persona.add(getPersona());
        return persona;
    }

}