import java.time.Year;
import java.util.Calendar;
/**
 * Representa un empleado de la empresa y su relacion con un jefe.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class EmpleadoConJefe
{
    //Atributos
    /**
     * Datos basicos de la clase: cuil, apellido, nombre, sueldo basico, fecha de ingreso y jefe.
     */
    private long cuil;
    private String apellido;
    private String nombre; 
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    //Constructor
    /**
     * Construye un empleado con los datos indicados.
     * 
     * @param p_cuil Numero de cuil del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_importe Sueldo basico del empleado.
     * @param p_fechaIngreso Fecha de Ingreso del empleado.
     * @param p_jefe Jefe del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.fechaIngreso = p_fecha;
        this.setJefe(p_jefe);
    }
    
    /**
     * Construye un empleado con los datos indicados.
     * 
     * @param p_cuil Numero de cuil del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_importe Sueldo basico del empleado.
     * @param p_fecha Fecha de ingreso del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.fechaIngreso = p_fecha;;
    }
    
    /**
     * Construye un empleado con los datos indicados.
     * 
     * @param p_cuil Numero de cuil del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_importe Sueldo basico del empleado.
     * @param p_anio Año de ingreso del empleado.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre,double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    //Metodos
    /**
     * Establece el numero de cuil del empleado.
     *
     * @param p_cuil Numero de cuil del empleado.
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    /**
     * Establece el apellido del empleado.
     *
     * @param p_apellido Apellido del empleado.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Establece el nombre del empleado.
     *
     * @param p_nombre Nombre del empleado.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el sueldo basico del empleado.
     *
     * @param p_importe Sueldo basico del empleado.
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    /**
     * Establece el año de ingreso del empleado.
     *
     * @param p_anioIngreso Año de ingreso del empleado.
     */
    private void setAnioIngreso(int p_anioIngreso){
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, p_anioIngreso);
        this.fechaIngreso = fecha;
    }
    
    /**
      * Establece el jefe del empleado.
      *
      * @param p_jefe Jefe del empleado.
      */
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    
    /**
     * Obtiene el numero de cuil del empleado.
     *
     * @return numero de cuil del empleado.
     */
    private long getCuil(){
        return this.cuil;
    }
    
    /**
     * Obtiene el apellido del empleado.
     *
     * @return Apellido del empleado.
     */
    private String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene el nombre del empleado.
     *
     * @return Nombre del empleado.
     */
    private String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el sueldo basico del empleado.
     *
     * @return Sueldo Basico del empleado.
     */
    private double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * Obtiene el jefe del empleado.
     *
     * @return jefe del empleado.
     */
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    /**
     * Obtiene el año de ingreso del empleado.
     *
     * @return Año de ingreso del empleado.
     */
    private int getAnioIngreso(){
       return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    /**
     * Retorna la antiguedad empleado.
     *
     * @return Antiguedad del empleado.
     */
    public int antiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnioIngreso();
    }
    
    /**
     * Calcula el descuento del empleado.
     *
     * @return Descuento del empleado.
     */
    private double descuento(){
        double obraSocial = this.sueldoBasico * 0.02;
        double seguroDeVida = 1500.0;
        return obraSocial + seguroDeVida;
    }
    
    /**
     * Calcula el adicional del empleado en base a la antiguedad.
     *
     * @return Adicional del empleado.
     */
    private double adicional(){
        int sueldoAnt = this.antiguedad();
        double porcentaje;
        
        if(sueldoAnt < 2){
            porcentaje = 0.02;
        }else if(sueldoAnt >= 2 && sueldoAnt < 10){
            porcentaje = 0.04;
        }else{ 
            porcentaje = 0.06;
        }
        
        return this.sueldoBasico * porcentaje;
    }
    
    /**
     * Calcula el sueldo neto del empleado en base a la suma del sueldo básico más el adicional, menos el descuento.
     *
     * @return Sueldo neto del empleado.
     */
    public double sueldoNeto(){
        return this.sueldoBasico + this.adicional() - this.descuento();                                                                                                                                                                                                                                                                                                                                                                                                                 
    }
    
    /**
     * Obtiene el nombre y apellido del empleado en formato textual.
     *
     * @return nombre y apellido del empleado.
     */
    public String nomYape(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Obtiene el apellido y nombre del empleado en formato textual.
     *
     * @return apellido y nombre del empleado.
     */
    public String apeYnom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra en pantalla los datos del empleado y el nombre de su jefe.
     */
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: " + this.getNombre() + " " + this.getApellido());
        System.out.println("CUIL: " + this.getCuil() + " " + "Antiguedad: " + " " + this.antiguedad() + " " + "Años de Servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
        
        if(this.getJefe() != null){
            System.out.println("Responde a: " + this.getJefe().apeYnom());
        }else{
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }
    
    /**
     * Muestra datos basicos del empleado en forma textual.
     * 
     * @return Datos basicos del empleado.
     */
    public String mostrarLinea(){
        return this.getCuil() + " " + this.getApellido() + ", " + this.getNombre() + " ...............$" + this.sueldoNeto();
    }
}