import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

/**
 * Clase contenedora que gestiona la venta y registro de entradas al zoológico.
 * Permite administrar visitantes (individuos y delegaciones), generar listados
 * filtrados por fecha o tipo, calcular la recaudación en rangos temporales
 * y consolidar las personas concurrentes sin duplicados.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Zoologico {
    private String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Construye un zoológico inicializando su colección de visitantes vacía.
     * 
     * @param p_nombre denominación del zoológico.
     */
    public Zoologico(String p_nombre) {
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }

    /**
     * Construye un zoológico con una lista previa de visitantes.
     * 
     * @param p_nombre denominación del zoológico.
     * @param p_visitantes colección inicial de visitantes.
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes) {
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }

    // Accesors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setVisitantes(ArrayList<Visitante> p_visitantes) {
        this.visitantes = p_visitantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     * Registra un nuevo visitante en el zoológico asegurando que no se duplique.
     * 
     * @param p_visitante visitante (Individuo o Delegación) a incorporar.
     */
    public void nuevoVisitante(Visitante p_visitante) {
        if (!this.visitantes.contains(p_visitante)) {
            this.visitantes.add(p_visitante);
        }
    }

    /**
     * Remueve a un visitante de la colección del zoológico.
     * 
     * @param p_visitante visitante a dar de baja.
     * @return true si el visitante fue removido; false en caso contrario.
     */
    public boolean quitarVisitante(Visitante p_visitante) {
        return this.visitantes.remove(p_visitante);
    }

    /**
     * Emite por consola el detalle de los visitantes que concurrieron en una fecha específica
     * y pertenecen a un tipo determinado ("Individuo" o "Delegación").
     * 
     * @param p_fecha fecha de visita a filtrar.
     * @param p_tipoVisitante categoría de visitante solicitada.
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante) {
        for (Visitante unVisitante : this.visitantes) {
            unVisitante.listarPorFecha(p_fecha, p_tipoVisitante);
        }
    }

    /**
     * Emite por consola el detalle de todos los visitantes que concurrieron en una fecha específica,
     * sin discriminar por tipo.
     * 
     * @param p_fecha fecha de visita a consultar.
     */
    public void listarVisitantePorFecha(Calendar p_fecha) {
        for (Visitante unVisitante : this.visitantes) {
            unVisitante.listarPorFecha(p_fecha, unVisitante.tipoVisitante());
        }
    }

    /**
     * Calcula la recaudación acumulada por entradas vendidas dentro de un intervalo de fechas (inclusivo).
     * 
     * @param p_fechaDesde fecha inicial del período.
     * @param p_fechaHasta fecha final del período.
     * @return suma monetaria total recaudada en el rango indicado.
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double total = 0.0;
        for (Visitante unVisitante : this.visitantes) {
            boolean despuesOIgualDesde = !unVisitante.getFechaVisita().before(p_fechaDesde);
            boolean antesOIgualHasta = !unVisitante.getFechaVisita().after(p_fechaHasta);

            if (despuesOIgualDesde && antesOIgualHasta) {
                total += unVisitante.entrada();
            }
        }
        return total;
    }

    /**
     * Consolida y retorna el conjunto de todas las personas físicas que visitaron el zoológico,
     * eliminando repeticiones mediante una estructura de conjunto.
     * 
     * @return colección HashSet con las instancias únicas de Persona registradas.
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo() {
        HashSet<Persona> personas = new HashSet<Persona>();
        for (Visitante unVisitante : this.visitantes) {
            personas.addAll(unVisitante.listarPersonas());
        }
        return personas;
    }
}