import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase Empleado representa a un trabajador de una empresa u organización.
 * Permite gestionar sus datos laborales, calcular la antigüedad, liquidar su
 * sueldo neto en función de adicionales por antigüedad y descuentos de ley,
 * y emitir reportes de su estado.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Empleado {

    // Atributos de instancia (privados)
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor de la clase Empleado.
     * Inicializa los datos del empleado utilizando sus métodos mutadores.
     * 
     * @param p_cuil Clave Única de Identificación Laboral (CUIL).
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_sueldoBasico Monto asignado como sueldo básico.
     * @param p_anioIngreso Año en que ingresó a trabajar en la empresa.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
    }

    // SETTERS (MUTADORES PRIVADOS)

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    // GETTERS (OBSERVADORES PÚBLICOS)

    /**
     * Obtiene el número de CUIL del empleado.
     * 
     * @return Número de CUIL como valor tipo long.
     */
    public long getCuil() {
        return this.cuil;
    }

    /**
     * Obtiene el apellido del empleado.
     * 
     * @return Apellido del empleado.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el sueldo básico del empleado.
     * 
     * @return Sueldo básico en pesos.
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    /**
     * Obtiene el año de ingreso del empleado a la organización.
     * 
     * @return Año de ingreso.
     */
    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    // MÉTODOS DE COMPORTAMIENTO Y CÁLCULO

    /**
     * Calcula los años de antigüedad del empleado en base al año actual del sistema.
     * 
     * @return Años de antigüedad en el trabajo.
     */
    public int antiguedad() {
        Calendar fechaActual = new GregorianCalendar();
        int anioActual = fechaActual.get(Calendar.YEAR);
        return anioActual - this.getAnioIngreso();
    }

    /**
     * Calcula los descuentos a aplicar sobre el sueldo.
     * Incluye un 2% por Obra Social más $1500 fijos de Seguro de Vida.
     * 
     * @return El importe total a descontar.
     */
    private double descuento() {
        return (this.getSueldoBasico() * 0.02) + 1500;
    }

    /**
     * Calcula el adicional correspondiente según la antigüedad del empleado:
     * - Menos de 2 años: 2% del básico.
     * - De 2 a 9 años: 4% del básico.
     * - 10 o más años: 6% del básico.
     * 
     * @return El importe adicional acumulado.
     */
    private double adicional() {
        int ant = this.antiguedad();
        if (ant < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (ant >= 2 && ant < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    /**
     * Liquida el sueldo neto final del empleado.
     * Sueldo Neto = Sueldo Básico + Adicionales - Descuentos.
     * 
     * @return El valor del sueldo neto en pesos.
     */
    public double sueldoNeto() {
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }

    /**
     * Retorna el nombre y apellido concatenados.
     * 
     * @return Cadena con el formato "Nombre Apellido".
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Retorna el apellido y nombre concatenados.
     * 
     * @return Cadena con el formato "Apellido Nombre".
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra detalladamente los datos principales del empleado, su antigüedad y su sueldo neto.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + "  Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    /**
     * Formatea los datos del empleado en una sola línea de texto estilo renglón de reporte.
     * 
     * @return Cadena con el formato "CUIL - Apellido Nombre --------------- $SueldoNeto".
     */
    public String mostrarLinea() {
        return this.getCuil() + " - " + this.apeYNom() + " --------------- $" + this.sueldoNeto();
    }
}