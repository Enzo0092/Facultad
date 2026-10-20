import java.util.Calendar;

/**
 * Representa un cargo con su sueldo básico, año de ingreso y horas de docencia.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Cargo
{
    //Atributos
    /**
     * Nombre del cargo.
     */
    private String nombreCargo;

    /**
     * Sueldo básico del cargo.
     */
    private double sueldoBasico;

    /**
     * Año de ingreso al cargo.
     */
    private int anioIngreso;

    /**
     * Cantidad de horas de docencia.
     */
    private int horasDeDocencia;

    //Constructor
    /**
     * Construye un cargo con sus datos correspondientes.
     *
     * @param p_nombreCargo nombre del cargo
     * @param p_sueldoBasico sueldo básico del cargo
     * @param p_anioIngreso año de ingreso
     * @param p_horasDeDocencia cantidad de horas de docencia
     */
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        this.setNombreCargo(p_nombreCargo); 
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
    }

    //Metodos
    /**
     * Establece el nombre del cargo.
     *
     * @param p_nombreCargo nombre del cargo
     */
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }

    /**
     * Establece el sueldo básico del cargo.
     *
     * @param p_sueldoBasico sueldo básico
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * Establece el año de ingreso al cargo.
     *
     * @param p_anioIngreso año de ingreso
     */
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }

    /**
     * Establece la cantidad de horas de docencia.
     *
     * @param p_horasDeDocencia cantidad de horas de docencia
     */
    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia = p_horasDeDocencia;
    }

    /**
     * Obtiene el nombre del cargo.
     *
     * @return nombre del cargo
     */
    public String getNombreCargo(){
        return this.nombreCargo;
    }

    /**
     * Obtiene el sueldo básico del cargo.
     *
     * @return sueldo básico
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    /**
     * Obtiene el año de ingreso al cargo.
     *
     * @return año de ingreso
     */
    public int getAnioIngreso(){
        return this.anioIngreso;
    }

    /**
     * Obtiene la cantidad de horas de docencia.
     *
     * @return cantidad de horas de docencia
     */
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }

    /**
     * Calcula los años de antigüedad en el cargo.
     *
     * @return años de antigüedad
     */
    public int antiguedad(){
        Calendar hoy = Calendar.getInstance();
        return hoy.get(Calendar.YEAR) - this.getAnioIngreso();
    }

    /**
     * Calcula el adicional correspondiente a la antigüedad.
     *
     * @return importe adicional por antigüedad
     */
    private double adicionalXAntiguedad(){
        return this.getSueldoBasico() * this.antiguedad() * 0.01;
    }

    /**
     * Calcula el sueldo total correspondiente al cargo.
     *
     * @return sueldo básico más el adicional por antigüedad
     */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }

    /**
     * Muestra los datos y el sueldo del cargo.
     */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() + " - Sueldo Cargo: " 
        + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad() + " - Horas docencia: " + this.getHorasDeDocencia());
    }
}


