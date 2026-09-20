import java.time.Year;
import java.util.Calendar;
/**
 * Representa un empleado.
 *
 * @author Romero Enzo
 * @version 1.0 - 2026
 */
public class Empleado
{
    //Atributos
    /**
     * Numero de cuil del empleado.
     */
    private long cuil;
    /**
     * Apellido del empleado.
     */
    private String apellido;
    /**
     * Nombre del empleado.
     */
    private String nombre; 
    /**
     * Sueldo Basico del empleado.
     */
    private double sueldoBasico;
    /**
     * Fecha de ingreso del empleado.
     */
    private Calendar fechaIngreso;
    
    //Constructor
    /**
     * Construye un empleado con los datos indicados.
     * 
     * @param p_cuil Numero de cuil del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_sueldoBasico Sueldo basico del empleado.
     * @param p_fechaIngreso Fecha de Ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fechaIngreso){
        this.setCuil(p_cuil); 
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fechaIngreso);
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
     * @param p_sueldoBasico Sueldo basico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
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
      * Establece la fecha de ingreso del empleado.
      *
      * @param p_fechaIngreso Fecha de ingreso del empleado.
      */
    private void setFechaIngreso(Calendar p_fechaIngreso){
         this.fechaIngreso = p_fechaIngreso;
    }
    
    /**
     * Obtiene el numero de cuil del empleado.
     *
     * @return numero de cuil del empleado.
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /**
     * Obtiene el apellido del empleado.
     *
     * @return Apellido del empleado.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene el nombre del empleado.
     *
     * @return Nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el sueldo basico del empleado.
     *
     * @return Sueldo Basico del empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * Obtiene el año de ingreso del empleado.
     *
     * @return Año de ingreso del empleado.
     */
    public int getAnioIngreso(){
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
     * Muestra los datos del empleado.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.getNombre() + " " + this.getApellido());
        System.out.println("CUIL: " + this.getCuil() + " " + "Antiguedad: " + " " + this.antiguedad() + " " + "Años de Servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    /**
     * Muestra datos basicos del empleado en forma textual.
     * 
     * @return Datos basicos del empleado.
     */
    public String mostrarLinea(){
        return this.getCuil() + " " + this.getApellido() + ", " + this.getNombre() + " ...............$" + this.sueldoNeto();
    }
    
    /**
     * Comprueba si el día actual coincide con el aniversario de ingreso del empleado.
     *
     * @return true si es el aniversario de ingreso, false en caso contrario.
     */
    public boolean esAniversario(){
        Calendar hoy = Calendar.getInstance();
        
        return hoy.get(Calendar.MONTH) == this.fechaIngreso.get(Calendar.MONTH)
            && hoy.get(Calendar.DAY_OF_MONTH) == this.fechaIngreso.get(Calendar.DAY_OF_MONTH);
    }
}