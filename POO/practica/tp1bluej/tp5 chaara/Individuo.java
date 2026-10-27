import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa a un visitante particular e independiente que concurre al zoológico.
 * Modela la interacción con la clase Persona y fija el valor base de su entrada.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Individuo extends Visitante {
    private Persona persona;

    /**
     * Construye un visitante de tipo Individuo vinculándolo con una persona física.
     * 
     * @param p_nombre denominación o nombre del visitante.
     * @param p_fechaVisita fecha en la que se registra la concurrencia.
     * @param p_persona instancia de Persona con los datos personales completos.
     */
    public Individuo(String p_nombre, Calendar p_fechaVisita, Persona p_persona) {
        super(p_nombre, p_fechaVisita);
        this.setPersona(p_persona);
    }

    // Accesors
    private void setPersona(Persona p_persona) {
        this.persona = p_persona;
    }

    public Persona getPersona() {
        return this.persona;
    }

    /**
     * Retorna el tipo de visitante correspondiente a esta clase.
     * 
     * @return texto con el valor literal "Individuo".
     */
    @Override
    public String tipoVisitante() {
        return "Individuo";
    }

    /**
     * Evalúa si la fecha de visita coincide con el día consultado y si el tipo coincide con "Individuo".
     * En caso afirmativo, imprime los datos de la persona por consola.
     * 
     * @param p_fecha fecha de consulta a contrastar (año, mes y día).
     * @param p_visitante cadena con el tipo de visitante solicitado.
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        boolean mismoAnio = this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR);
        boolean mismoMes = this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH);
        boolean mismoDia = this.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE);

        boolean esMismaFecha = mismoMes && mismoAnio && mismoDia;
        boolean esMismoTipo = this.tipoVisitante().equalsIgnoreCase(p_visitante);

        if (esMismaFecha && esMismoTipo) {
            this.mostrar();
        }
    }

    /**
     * Imprime por consola los datos personales del individuo conforme al formato requerido.
     */
    @Override
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.getPersona().nomYApe());
        System.out.println("DNI: " + this.getPersona().getDNI() + "   Edad: " + this.getPersona().edad() + " años");
    }

    /**
     * Retorna el importe fijado para la entrada individual al zoológico.
     * 
     * @return costo de entrada individual ($10.0).
     */
    @Override
    public double entrada() {
        return 10.0;
    }

    /**
     * Retorna un conjunto que contiene únicamente a la persona física que compone este individuo.
     * 
     * @return HashSet de Persona con un solo elemento.
     */
    @Override
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<Persona>();
        personas.add(this.getPersona());
        return personas;
    }
}