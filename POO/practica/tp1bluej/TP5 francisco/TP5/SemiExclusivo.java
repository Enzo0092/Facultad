/**
 * Representa un cargo semi exclusivo con horas de investigación.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class SemiExclusivo extends Cargo
{
    //Atributos
    /**
     * Cantidad de horas de investigación.
     */
    private int horasDeInvestigacion;

    //Constructor
    /**
     * Construye un cargo semi exclusivo con sus datos correspondientes.
     *
     * @param p_horasDeInvestigacion cantidad de horas de investigación
     * @param p_nombreCargo nombre del cargo
     * @param p_sueldoBasico sueldo básico del cargo
     * @param p_anioIngreso año de ingreso
     * @param p_horasDeDocencia cantidad de horas de docencia
     */
    public SemiExclusivo(int p_horasDeInvestigacion, String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        super(p_nombreCargo, p_sueldoBasico, p_anioIngreso, p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
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
     * Obtiene la cantidad de horas de investigación.
     *
     * @return horas de investigación
     */
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }

    /**
     * Muestra los datos del cargo y sus horas de investigación.
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas de Investigacion: " + this.getHorasDeInvestigacion());
    }
}