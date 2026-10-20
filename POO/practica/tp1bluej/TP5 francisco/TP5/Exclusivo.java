/**
 * Representa un cargo exclusivo con horas de investigación y extensión.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Exclusivo extends Cargo
{
    //Atributos
    /**
     * Cantidad de horas de investigación.
     */
    private int horasDeInvestigacion;

    /**
     * Cantidad de horas de extensión.
     */
    private int horasDeExtension;

    //Constructor
    /**
     * Construye un cargo exclusivo con sus horas y datos correspondientes.
     *
     * @param p_horasDeInvestigacion cantidad de horas de investigación
     * @param p_horasDeExtension cantidad de horas de extensión
     * @param p_nombreCargo nombre del cargo
     * @param p_sueldoBasico sueldo básico del cargo
     * @param p_anioIngreso año de ingreso
     * @param p_horasDeDocencia cantidad de horas de docencia
     */
    public Exclusivo(int p_horasDeInvestigacion, int p_horasDeExtension, String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeExtension(p_horasDeExtension);
    }

    //Metodos
    /**
     * Establece las horas de investigación.
     *
     * @param p_horasDeInvestigacion cantidad de horas de investigación
     */
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    /**
     * Establece las horas de extensión.
     *
     * @param p_horasDeExtension cantidad de horas de extensión
     */
    private void setHorasDeExtension(int p_horasDeExtension){
        this.horasDeExtension = p_horasDeExtension;
    }

    /**
     * Obtiene la cantidad de horas de investigación.
     *
     * @return horas de investigación
     */
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }

    /**
     * Obtiene la cantidad de horas de extensión.
     *
     * @return horas de extensión
     */
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }

    /**
     * Muestra los datos del cargo y sus horas de investigación y extensión.
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas de Investigacion: " + this.getHorasDeInvestigacion());
        System.out.println("Horas de Extension: " + this.getHorasDeExtension());
    }
}
