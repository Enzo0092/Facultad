/**
 * Representa un alumno y sus datos academicos.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class Alumno extends Persona
{
    //Atributos
    /**
     * Numero de LU del alumno.
     */
    private int lu;
    /**
     * Primera nota del alumno.
     */
    private double nota1;
    /**
     * Segunda nota del alumno.
     */
    private double nota2;
    
    //Constructor
    /**
     * Construye un alumno y sus datos mencionados.
     * 
     * @param p_lu LU del alumno.
     * @param p_dni DNI del alumno.
     * @param p_nombre nombre del alumno.
     * @param p_apellido apellido del alumno.
     * @param p_anio año de nacimiento del alumno.
     */
    public Alumno(int p_lu, int p_dni, String p_nombre, String p_apellido, int p_anio){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.nota1 = 0;
        this.nota2 = 0;
    }

    //Metodos
    /**
     * Establece la LU del alumno.
     *
     * @param p_lu LU del alumno.
     */
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    /**
     * Establece la primera nota del alumno.
     *
     * @param p_nota Primera nota del alumno.
     */
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }
    
    /**
     * Establece la segunda nota del alumno.
     *
     * @param p_nota Segunda nota del alumno.
     */
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    /**
     * Obtiene el numero de LU del alumno.
     *
     * @return numero de LU del alumno.
     */
    private int getLu(){
        return this.lu;
    }
  
    /**
     * Obtiene la primera nota del alumno.
     *
     * @return Primera nota del alumno.
     */
    public double getNota1(){
        return this.nota1;
    }
    
    /**
     * Obtiene la segunda nota del alumno.
     *
     * @return segunda nota del alumno.
     */
    public double getNota2(){
        return this.nota2;
    }
    
    /**
     * Verifica si el alumno aprobó o no en base a sus dos calificaciones.
     *
     * @return true si el alumno aprobó o false si no aprobó.
     */
    private boolean aprueba(){
        if(this.promedio() > 7.0 && this.nota1 >= 6.0 && this.nota2 >= 6.0){
           return true;   
        }else{
            return false;
         }
    }
    
    /**
     * Retorna un mensaje sobre el estado del alumno.
     *
     * @return "APROBADO" si el alumno aprobó o "DESAPROBADO" si el alumno no aprobó.
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
       }
    }
    
    /**
     * Calcula el promedio del alumno.
     *
     * @return promedio del alumno.
     */
    public double promedio(){
        double promedio = (this.nota1 + this.nota2) / 2;
        return promedio;
    }
   
    /**
     * Muestra los datos del alumno.
     */
    public void mostrar(){ 
        System.out.println("Nombre y Apellido: " + this.getNombre() + " " + this.getApellido());
        System.out.println("DNI: " + this.getDNI() + " Edad: " + this.edad() + " años");
        System.out.println("LU: " + this.getLu() + " Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}