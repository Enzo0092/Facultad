/**
 * clase profesor que hereda atributos como sub clase de persona
 * 
 */
import java.util.ArrayList;
public class Profesor extends Persona{
    
    private String titulo;
    private ArrayList<Cargo> cargos; // declaramos la lista
     // al momento de ser creado el porofesor ya cuenta con todos sus cargos declarados
     public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio,String p_titulo, ArrayList<Cargo> p_cargos){
         super(p_dni,p_nombre,p_apellido,p_anio);
         this.setTitulo(p_titulo);
         this.setCargos(p_cargos);
     }
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio,String p_titulo, Cargo p_cargo){
         super(p_dni,p_nombre,p_apellido,p_anio);
         this.setTitulo(p_titulo);
         this.setCargos(new ArrayList<Cargo>()); //creamos una lista vacia
         this.agregarCargo(p_cargo); //Agregamos el cargo inicial
        }
       private void setTitulo(String p_titulo){
           this.titulo=p_titulo;
       }
       private void setCargos(ArrayList<Cargo> p_cargos){
           this.cargos=p_cargos;
       }
       public String getTitulo(){
           return this.titulo;
       }
       public ArrayList<Cargo> getCargos(){
           return this.cargos;
       }
       //metodo agregar cargo con un limite de 3
       public boolean agregarCargo(Cargo p_cargo){
           if(this.getCargos().size() < 3){
               return this.getCargos().add(p_cargo);
           }
           return false;
           
       }
       public boolean quitarCargo(Cargo p_cargo){
           if(this.getCargos().size() >1){
               return this.getCargos().remove(p_cargo);
           }
           return false;// nos e puede quitar por que dejaria a un profesor sin cargo
       }
     public double sueldoTotal(){
         double total =0.0;
         for ( Cargo unCargo : this.getCargos()){
             total= total + unCargo.sueldoDelCargo();
         }
         return total;
     }
     public void listarCargos(){
         for( Cargo unCargo :this.getCargos()){
             unCargo.mostrarCargo();// gracias al polimorfismo, cada uno se muestra segun lo que es
         }
     }
     public String mostrarLinea(){
      return "DNI :" + this.getDNI() + "- Nombre :" + this.nomYApe() + "- sueldo total:" + this.sueldoTotal();   
     } 
     
     @Override 
     
     public void mostrar(){
         super.mostrar();
         System.out.println("titulo : " + this.getTitulo());
         System.out.println(" *** cargos asignados *** ");
         System.out.println("------------------------------");
         this.listarCargos();
         System.out.println(" ** Sueldo total : " + this.sueldoTotal() + "**");
     }
}