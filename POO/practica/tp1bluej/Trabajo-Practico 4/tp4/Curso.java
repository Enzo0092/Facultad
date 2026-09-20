import java.util.HashMap;

/**
 * Gestiona la nómina de alumnos inscriptos mediante un HashMap (LU -> Alumno).
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Curso {

    private String nombre;
    private HashMap alumnos; // <Integer (LU), Alumno>

    public Curso(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }

    public Curso(String p_nombre, HashMap p_alumnos) {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

    // Mutadores y Observadores
    private void setNombre(String p_nombre) { this.nombre = p_nombre; }
    private void setAlumnos(HashMap p_alumnos) { this.alumnos = p_alumnos; }

    public String getNombre() { return this.nombre; }
    public HashMap getAlumnos() { return this.alumnos; }

    // MÉTODOS DEL HASHMAP

    /**
     * Inscribe un alumno guardándolo con su LU como clave.
     */
    public void inscribirAlumno(Alumno p_alumno) {
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }

    /**
     * Remueve al alumno asociado a la LU dada.
     */
    public Alumno quitarAlumno(int p_lu) {
        return (Alumno) this.getAlumnos().remove(p_lu);
    }

    /**
     * Devuelve la cantidad de alumnos inscriptos.
     */
    public int cantidadDeAlumnos() {
        return this.getAlumnos().size();
    }

    /**
     * Verifica si una LU existe como clave en el mapa.
     */
    public boolean estaInscripto(int p_lu) {
        return this.getAlumnos().containsKey(p_lu);
    }

    /**
     * Verifica si un objeto Alumno existe como valor en el mapa.
     */
    public boolean estaInscripto(Alumno p_alumno) {
        return this.getAlumnos().containsValue(p_alumno);
    }

    /**
     * Obtiene el alumno por su clave (LU).
     */
    public Alumno buscarAlumno(int p_lu) {
        return (Alumno) this.getAlumnos().get(p_lu);
    }

    /**
     * Busca al alumno y muestra su promedio en pantalla.
     */
    public void imprimirPromedioDelAlumno(int p_lu) {
        Alumno alu = this.buscarAlumno(p_lu);
        if (alu != null) {
            System.out.println("Promedio: " + alu.promedio());
        } else {
            System.out.println("El alumno no está inscripto.");
        }
    }

    /**
     * Recorre todos los valores del HashMap para listar los alumnos.
     */
    public void mostrarInscriptos() {
        for (Object obj : this.getAlumnos().values()) {
            Alumno alu = (Alumno) obj;
            System.out.println(alu.getLu() + " " + alu.nomYApe());
        }
    }
}