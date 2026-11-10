import java.util.ArrayList;
import java.util.Calendar;

public abstract class Socio{
    private int dniSocio;
    private String nombre;
    private int diasPrestamo;
    private ArrayList<Prestamo> prestamos;
    
    
    public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(new ArrayList<Prestamo>());// creo la lista vacia
    }
     public Socio(int p_dniSocio, String p_nombre, int p_diasPrestamo, ArrayList<Prestamo> p_prestamos){
        this.setDniSocio(p_dniSocio);
        this.setNombre(p_nombre);
        this.setDiasPrestamo(p_diasPrestamo);
        this.setPrestamos(p_prestamos);
    }
    
    
    private void setPrestamos(ArrayList<Prestamo> p_prestamos){
        this.prestamos= p_prestamos;
    }
    //accessors
    private void setDniSocio(int p_dniSocio){
        this.dniSocio= p_dniSocio;
    }
    private void  setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    protected void setDiasPrestamo(int p_diasPrestamo){
        this.diasPrestamo=p_diasPrestamo;
    }
    
    
    public int getDniSocio(){
        return this.dniSocio;
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDiasPrestamo(){
        return this.diasPrestamo;
    }
    public boolean agregarPrestamo(Prestamo p_prestamo){
        return this.prestamos.add(p_prestamo);
    }
    public boolean quitarPrestamo(Prestamo p_prestamo){
        return this.prestamos.remove(p_prestamo);
    }
    
    public int cantLibrosPrestados(){
        return this.prestamos.size();
    }
    
    public String toString(){
        return "D.N.I:" +this.getDniSocio() +"||"+ this.getNombre() + "("+ soyDeLaClase()+ ")" + "|| Libros Prestados" + cantLibrosPrestados();
        
    }
    public boolean puedePedir(){
        for (Prestamo unprestamo: this.prestamos){
           if( unprestamo.vencido(Calendar.getInstance())){
               return false;
               }
            
           }
           return true;
        }
        
        public abstract  String soyDeLaClase(); 
    }
    
