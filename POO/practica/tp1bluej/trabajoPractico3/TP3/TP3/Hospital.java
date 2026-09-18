/**
 * Representa un hospital y su director.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Hospital
{
    //Atributos
    /**
     * Datos que representan el nombre del hospital y su director.
     */
    private String nombreHospital;
    private String nombreDirector;
    
    //Constructor
    /**
     * Construye un hospital con el nombre y director indicados.
     *
     * @param p_nombreHospital nombre del hospital.
     * @param p_nombreDirector nombre del director del hospital.
     */
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    //Metodos
    /**
     * Establece el nombre del hospital.
     *
     * @param p_nombreHospital nombre del hospital.
     */
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    
    /**
     * Establece el nombre del director del hospital.
     *
     * @param p_nombreDirector nombre del director.
     */
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    
    /**
     * Obtiene el nombre del hospital.
     *
     * @return nombre del hospital.
     */
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    /**
     * Obtiene el nombre del director del hospital.
     *
     * @return nombre del director.
     */
    public String getNombreDirector(){
        return this.nombreDirector;    
    }
    
    /**
     * Muestra por pantalla los datos filiatorios del paciente.
     *
     * @param p_paciente paciente cuyos datos filiatorios se desean consultar.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + " Director: " + this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + " Historia Clínica: " + p_paciente.getHistoriaClinica() +
        " Domicilio: " + p_paciente.getDomicilio());
        System.out.println("Localidad: " + p_paciente.getLocalidadVive().getNombre() + " Provincia: " + p_paciente.getLocalidadVive().getProvincia());
    }
}