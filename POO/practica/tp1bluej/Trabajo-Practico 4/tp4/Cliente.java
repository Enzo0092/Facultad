
/**
 *desarrollo de la clase cliente del putno3 del tp2
 *abstraccion :
 *se modela la enttidad cliente del mundo real conservando 
 *unicamente los atributos esenciales  para este problema (dni, nombre apellido saldo)
 *
 * 
 * @author (Enzo romero ) 
 * @version (a version number or a date)
 */
public class Cliente{
// ENCAPSULAMIENTO Y OCULTAMIENTO DE INFORMACIÓN:
// Atributos privados ('private') para evitar que sean modificados o leídos 
// directamente desde clases externas sin pasar por los métodos de control.
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo ;
    
/** 
  *constructor (instanciacion ):
  *asigna el estado inicial al objeto en el momento de su creacion
  *con la instruccion new
  *  */
    public Cliente (int p_dni, String p_apellido, String p_nombre, double p_importe){
        
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
        
    }
    //setters o mutadores encapsulamiento 
    //metodos privaods para proteger la modificacion
    //de las variables de instancia
    private void setNroDNI(int p_dni){
        this.nroDNI=p_dni;
    }
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
        
    }
    private void setSaldo (double p_importe){
        this.saldo=p_importe;
    }
    // getteres u observadores 
    //metodos publicos que ofrecen la lectura seguda de los aributos 
    // desde afuera 
    public int getNroDNI(){
        return this.nroDNI;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSaldo(){
        return this.saldo ;
        
    }
    //envio de mensajes y vambio de estado 
    // logica de negocio quereutiliza los seters y geteresinternos 
    // en lugar de acceder directamente a la variable saldo .
    public double nuevoSaldo (double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    public double agregaSaldo(double p_importe){
        this.setSaldo((this.getSaldo()+ p_importe));
        return this.getSaldo();
    }
    public String nomYApe(){
        return  this.getNombre() +"  " + this.getApellido();
    }
    public String apeYNom(){
        return  this.getApellido() + "  " + this.getNombre(); 
    } /**
    *imprime por pantalla la informacion del cliente y su saldo 
    
    
    */
    public void mostrar (){
        System.out.println("-Cliente-");
        System.out.println("apellido y nombre : " + this.apeYNom());
        System.out.println("SALDO :" + this.getSaldo());
    }
}