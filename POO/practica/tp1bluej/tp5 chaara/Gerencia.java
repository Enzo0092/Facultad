import java.util.ArrayList;

/**
 * Representa la administración de una gerencia regional de la cadena de alojamientos.
 * Gestiona el conjunto de alojamientos alquilados (cabañas y hoteles), coordina
 * sus liquidaciones individuales e informa los totales acumulados por categoría.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Gerencia {
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    /**
     * Construye una gerencia inicializando la colección de alojamientos alquilados vacía.
     * 
     * @param p_nombre denominación comercial o regional de la gerencia.
     */
    public Gerencia(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList<Alojamiento>());
    }

    /**
     * Construye una gerencia asignando una colección preexistente de alojamientos alquilados.
     * 
     * @param p_nombre denominación comercial o regional de la gerencia.
     * @param p_alojamientos lista inicial de alojamientos alquilados.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos) {
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alojamientos);
    }

    // Accesors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientos) {
        this.alojamientosAlquilados = p_alojamientos;
    }

    public ArrayList<Alojamiento> getAlojamientosAlquilados() {
        return this.alojamientosAlquilados;
    }

    /**
     * Incorpora un nuevo alojamiento alquilado a la colección administrada.
     * 
     * @param p_alojamiento instancia de Alojamiento (Cabaña u Hotel) a dar de alta.
     * @return true si la operación de agregación se completó exitosamente.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
        return this.alojamientosAlquilados.add(p_alojamiento);
    }

    /**
     * Da de baja un alojamiento de la colección de alquileres vigentes.
     * 
     * @param p_alojamiento instancia de Alojamiento a remover.
     * @return true si el alojamiento se encontraba registrado y pudo removerse; false en caso contrario.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
        if (this.alojamientosAlquilados.size() > 0) {
            return this.alojamientosAlquilados.remove(p_alojamiento);
        } else {
            return false;
        }
    }

    /**
     * Cuantifica polimórficamente los alojamientos registrados que pertenecen al tipo consultado.
     * 
     * @param tipoAlojamiento etiqueta del tipo de alojamiento ("Cabaña" u "Hotel").
     * @return cantidad total de unidades alquiladas que coinciden con el tipo recibido.
     */
    public int contarAlojamiento(String tipoAlojamiento) {
        int total = 0;
        for (Alojamiento unAlojamiento : this.alojamientosAlquilados) {
            total += unAlojamiento.contar(tipoAlojamiento);
        }
        return total;
    }

    /**
     * Ejecuta polimórficamente la emisión de la liquidación de cada alojamiento registrado.
     */
    public void liquidar() {
        for (Alojamiento unAlojamiento : this.alojamientosAlquilados) {
            unAlojamiento.liquidar();
            System.out.println();
        }
    }

    /**
     * Emite por consola el reporte general consolidado de la gerencia:
     * encabezado descriptivo, liquidaciones detalladas por unidad y totales clasificados por tipo.
     */
    public void mostrarLiquidacion() {
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación----------------------------");
        System.out.println();
        
        this.liquidar();

        System.out.println("Alojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + this.contarAlojamiento("Hotel"));
    }
}