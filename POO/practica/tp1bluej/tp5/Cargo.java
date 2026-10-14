/**
 * clase cargo 
 * @author Enzo Romero
 * @author Morales Francisco
 * @version 1.0
 */
import java.util.Calendar;

public class Cargo{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    /**
     * constructor de la clase cargo
     * @param nombre cargo 
     * @param sueldo basico
     * @param anioIngreso
     * @param horasDeDocencia
     * 
     */
    public Cargo (String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia ){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
        
    }
    
    //accesors
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo=p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso=p_anioIngreso;
    }
    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia=p_horasDeDocencia;
    }
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }
    
    //metodos de la clase
    /**
     * instancia una varbiale que obtiene la fehca de hoy para hacer una diferencia conel año de hoy
     * y el año deingreso
     */
    public int antiguedad(){
        Calendar FechaHoy= Calendar.getInstance();
        int anioHoy=FechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }
    private double adicionalXAntiguedad(){
        return (this.getSueldoBasico()/100) * this.antiguedad();
    }
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }
    
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + "-Sueldo Basico:" + this.getSueldoBasico()+ "- Sueldo Cargo: "+ this.sueldoDelCargo() +"-Antiguedad:"+ this.antiguedad() +"años");
        System.out.println("Horas Docencia :" +this.getHorasDeDocencia());
    }
    
    
    
    
}