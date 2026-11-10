import java.util.Calendar;
public class Prestamo{
    private Calendar fechaRetiro;
    private Calendar fechaDevolucion;
    private Libro libro;
    private Socio socio;
    
    public Prestamo(Calendar p_fechaRetiro ,Calendar p_fechaDevolucion,Libro p_libro, Socio p_socio){
        this.setFechaRetiro(p_fechaRetiro);
        this.setFechaDevolucion(p_fechaDevolucion);
        this.setLibro(p_libro);
        this.setSocio(p_socio);
    }
    
    //setters y getters
    
    private void setFechaRetiro(Calendar p_fechaRetiro){
        this.fechaRetiro= p_fechaRetiro;
    }
    private void setFechaDevolucion(Calendar p_fechaDevolucion){
        this.fechaDevolucion=p_fechaDevolucion;
    }
    private void setLibro(Libro p_libro){
        this.libro=p_libro;
    }
    private void setSocio(Socio p_socio){
        this.socio=p_socio;
    }
    
    public Calendar getFechaRetiro(){
        return this.fechaRetiro;
    }
    public Calendar getFechaDevolucion(){
        return this.fechaDevolucion;
    }
    public Libro getLibro(){
        return this.libro;
    }
    public Socio getSocio(){
        return this.socio;
    }
    //metodos de la clase 
    public  void registrarFechaDevolucion(Calendar p_fecha){
        this.setFechaDevolucion(p_fecha);
    }
    
    public boolean vencido(Calendar p_fecha){
        Calendar fechaVencimiento=(Calendar) this.getFechaRetiro().clone();
        fechaVencimiento.add(Calendar.DAY_OF_MONTH, this.getSocio().getDiasPrestamo());
        
        return p_fecha.after(fechaVencimiento);
    }
    
    public String toString(){
        return "Retiro :" + this.getFechaRetiro() +"- Devolucion:" +this.getFechaDevolucion() ;
    }
}