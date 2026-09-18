/**
 * La clase Alumno representa a un estudiante universitario.
 * Permite gestionar sus datos personales, calificaciones, cálculo de promedio
 * y determinar su condición de aprobación.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Alumno {

    // Atributos de instancia (privados)
    private int LU;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    /**
     * Constructor de la clase Alumno.
     * Inicializa los datos del alumno y establece las notas iniciales en 0.
     * 
     * @param p_LU Libreta Universitaria del alumno.
     * @param p_nombre Nombre del alumno.
     * @param p_apellido Apellido del alumno.
     */
    public Alumno(int p_LU, String p_nombre, String p_apellido) {
        this.setLU(p_LU);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    // SETTERS (MUTADORES)

    private void setLU(int p_LU) {
        this.LU = p_LU;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Establece la nota del primer examen.
     * 
     * @param p_nota1 Nota obtenida en la primera evaluación.
     */
    public void setNota1(double p_nota1) {
        this.nota1 = p_nota1;
    }

    /**
     * Establece la nota del segundo examen.
     * 
     * @param p_nota2 Nota obtenida en la segunda evaluación.
     */
    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    // GETTERS (OBSERVADORES)

    /**
     * Obtiene el número de Libreta Universitaria.
     * 
     * @return Número de LU.
     */
    public int getLU() {
        return this.LU;
    }

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el apellido del alumno.
     * 
     * @return Apellido del alumno.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Obtiene la primera nota del alumno.
     * 
     * @return Primera nota.
     */
    public double getNota1() {
        return this.nota1;
    }

    /**
     * Obtiene la segunda nota del alumno.
     * 
     * @return Segunda nota.
     */
    public double getNota2() {
        return this.nota2;
    }

    // MÉTODOS DE CÁLCULO Y COMPORTAMIENTO

    /**
     * Calcula el promedio de las dos notas del alumno.
     * 
     * @return El valor del promedio como double.
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2.0;
    }

    /**
     * Determina si el alumno aprueba la materia.
     * Requiere un promedio mayor o igual a 7.0 y notas individuales de al menos 6.0.
     * 
     * @return true si cumple los criterios de aprobación, false en caso contrario.
     */
    private boolean aprueba() {
        return (this.promedio() >= 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0);
    }

    /**
     * Genera la cadena de texto con la condición final del alumno.
     * 
     * @return "APROBADO" o "DESAPROBADO" según corresponda.
     */
    private String leyendaAprueba() {
        if (this.aprueba()) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }

    /**
     * Retorna el nombre y el apellido del alumno concatenados.
     * 
     * @return Cadena con el formato "Nombre Apellido".
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Retorna el apellido y el nombre del alumno concatenados.
     * 
     * @return Cadena con el formato "Apellido Nombre".
     */
    public String apeYNomb() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Imprime en pantalla la información completa del alumno, sus notas, promedio y estado.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("LU: " + this.getLU() + "  Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}