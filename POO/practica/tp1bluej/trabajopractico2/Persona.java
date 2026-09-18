import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
 /**  
  * clase que representa a una persona
  * permite gestionar sus datos personales y calcular su edad
  * @author Enzo Romero
  * @version 1.0
     
    
    */
     
    public class Persona{
       //atributos de instancia privados
       private int nroDni;
       private String nombre;
       private String apellido;
       private int anioNacimiento;
       /** constructor de la clase persona , es un metodo especial
          que se ejecuta cuando instancias un ojeto con la 
          palabra reservada new
          *@param p_dni numero de documento
          *@param p_nombre nombre de la persona
          *@param p_apellido apellido de la persona
          *@param p_anioNacimiento año de la nacimiento de la 
          persona
          */
       public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio){
           this.setDNI (p_dni);
           this.setNombre(p_nombre);
           this.setApellido(p_apellido);
           this.setAnioNacimiento(p_anio);
       }
       //seters o mutadores privados 
       private void setDNI(int p_dni){
           this.nroDni=p_dni;
       }
       private void setNombre( String p_nombre){
           this.nombre=p_nombre;
       }
       private void setApellido(String p_apellido){
           this.apellido=p_apellido;
       }
       private void setAnioNacimiento (int p_anio){
           this.anioNacimiento=p_anio;
       }
       
       //geters observadores publicos 
       
       /**
          *obtiene el dni
          *@return numero de dni.
          *
          *
          */
       public int getDNI(){
           return this.nroDni;
       }
        /**
          *obtiene el nombre
          *@return nombre.
          *
          *
          */
       public String getNombre(){
           return this.nombre;
       }
        /**
          *obtiene el apellido
          *@return apellido.
          *
          *
          */
       public String getApellido(){
           return this.apellido;
       }
        /**
          *obtiene el año de nacimiento
          *@return anioNacimiento.
          *
          *
          */
       public int getAnioNacimiento(){
           return this.anioNacimiento;
           
       }
       
       /**
     * Calcula la edad de la persona en base al año actual.
     * @return Edad en años cumplidos
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }
     /**
          *retrona el nombre dseguido del apellido concateados
          *@return cadena en el formato nombre y apellido.
          *
          *
          */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
        
    } /**
          *concatena el apellido y nombre
          *@return retorna el apellido y nombre
          *
          *
          */
    public String apeyNom(){
        return this.getApellido() + " " + this.getNombre();
    }
     /**
          *muestra por pantalla la informacion completa de la persona
          *nommbre dni edad y años
          *
          *
          *
          */
    public void mostrar(){
        System.out.println("Nombre y apellido " +this.nomYApe());
        System.out.println ("DNI" +this.getDNI() +"la edad es " + this.edad() + "años");
        
    }
    }
    