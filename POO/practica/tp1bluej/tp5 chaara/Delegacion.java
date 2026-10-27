import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

/**
 * Representa a un contingente o grupo organizado de personas que visita el zoológico.
 * Gestiona una colección de integrantes individuales sin admitir repeticiones
 * y calcula el costo de acceso aplicando un descuento institucional del 10%.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Delegacion extends Visitante {
    private ArrayList<Individuo> integrantes;

    /**
     * Construye una delegación inicializando su lista de integrantes vacía.
     * 
     * @param p_nombre denominación o nombre que identifica a la delegación.
     * @param p_fecha fecha en la que el contingente asiste al zoológico.
     */
    public Delegacion(String p_nombre, Calendar p_fecha) {
        super(p_nombre, p_fecha);
        this.setIntegrantes(new ArrayList<Individuo>());
    }

    /**
     * Construye una delegación con una colección inicial de integrantes.
     * 
     * @param p_nombre denominación o nombre que identifica a la delegación.
     * @param p_fecha fecha en la que el contingente asiste al zoológico.
     * @param p_individuos lista inicial de integrantes pertenecientes al grupo.
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_individuos) {
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_individuos);
    }

    // Accesors
    private void setIntegrantes(ArrayList<Individuo> p_individuos) {
        this.integrantes = p_individuos;
    }

    /**
     * Retorna el tipo de visitante correspondiente a esta clase.
     * 
     * @return texto literal "Delegación".
     */
    @Override
    public String tipoVisitante() {
        return "Delegación";
    }

    /**
     * Inscribe un nuevo individuo como integrante de la delegación, garantizando
     * que no se registre duplicado en el mismo grupo.
     * 
     * @param p_individuo instancia de Individuo a incorporar.
     */
    public void inscribirIndividuo(Individuo p_individuo) {
        if (!this.integrantes.contains(p_individuo)) {
            this.integrantes.add(p_individuo);
        }
    }

    /**
     * Remueve a un integrante de la colección de la delegación.
     * 
     * @param p_individuo individuo a dar de baja.
     * @return true si el integrante existía y fue removido; false en caso contrario.
     */
    public boolean quitarIntegrante(Individuo p_individuo) {
        return this.integrantes.remove(p_individuo);
    }

    /**
     * Determina la cantidad total de personas que conforman el grupo.
     * 
     * @return número entero con el total de integrantes registrados.
     */
    public int cantidadIntegrantes() {
        return this.integrantes.size();
    }

    /**
     * Muestra por consola el detalle completo del contingente: encabezado con el nombre,
     * listado de cada uno de sus integrantes y la cantidad total.
     */
    @Override
    public void mostrar() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes");
        for (Individuo unIndividuo : this.integrantes) {
            unIndividuo.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("-------------------------------------------------------");
    }

    /**
     * Calcula el costo total de la entrada para la delegación, equivalente a la suma
     * de las entradas individuales ($10 por integrante) con un 10% de bonificación.
     * 
     * @return importe total a abonar por el acceso del grupo.
     */
    @Override
    public double entrada() {
        double subtotal = this.cantidadIntegrantes() * 10.0;
        return subtotal * 0.90;
    }

    /**
     * Evalúa si la fecha de visita coincide con el día consultado y si el tipo consultado
     * corresponde a delegaciones. En caso afirmativo, emite su detalle por consola.
     * 
     * @param p_fecha fecha de consulta (año, mes y día).
     * @param p_visitante tipo de visitante solicitado ("Individuo" o "Delegación").
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante) {
        boolean mismoDia = this.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE);
        boolean mismoMes = this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH);
        boolean mismoAnio = this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR);
        boolean mismoTipo = this.tipoVisitante().equalsIgnoreCase(p_visitante);

        if (mismoDia && mismoMes && mismoAnio && mismoTipo) {
            this.mostrar();
        }
    }

    /**
     * Recopila y retorna el conjunto de todas las personas físicas integrantes de la delegación.
     * 
     * @return conjunto HashSet de instancias Persona.
     */
    @Override
    public HashSet<Persona> listarPersonas() {
        HashSet<Persona> personas = new HashSet<Persona>();
        for (Individuo unIndividuo : this.integrantes) {
            personas.add(unIndividuo.getPersona());
        }
        return personas;
    }
}