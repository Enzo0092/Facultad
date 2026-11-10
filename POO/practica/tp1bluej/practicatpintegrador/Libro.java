import java.util.ArrayList;

public class Libro{
    private String titulo;
    private int edicion;
    private String editorial;
    private int anio;
    private ArrayList<Prestamo> prestamos;
    
    
    
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(new ArrayList<Prestamo>());
        
        
    }
    public Libro(String p_titulo, int p_edicion, String p_editorial, int p_anio,ArrayList<Prestamo> p_prestamo){
        this.setTitulo(p_titulo);
        this.setEdicion(p_edicion);
        this.setEditorial(p_editorial);
        this.setAnio(p_anio);
        this.setPrestamos(p_prestamo);
        
    }    
    
    private void setPrestamos(ArrayList<Prestamo> p_prestamo){
        this.prestamos=p_prestamo;
    }
    
    //accesorrs
    private void setTitulo(String p_titulo){
        this.titulo=p_titulo;
    }
    
    private void setEdicion(int p_edicion){
        this.edicion= p_edicion;
    }
    private void setEditorial(String p_editorial ){
        this.editorial= p_editorial;
    }
    private void setAnio(int p_anio){
        this.anio=p_anio;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public int getEdicion(){
        return this.edicion;
        
    }
    public String getEditorial(){
        return this.editorial;
    }
    public int getAnio(){
        return this.anio;
    }
    
    
    
    //metodos de la clase
    public Prestamo ultimoPrestamo(){
        if(prestamos.isEmpty()){
            return null;
        }
        else{
            return prestamos.get(prestamos.size()-1);
        }
    }
    
    public boolean prestado(){
        if ( ultimoPrestamo()!=null && ultimoPrestamo().getFechaDevolucion() ==null){
            return true;
            
        }else{
            return false;
        }
    }
    public String toString(){
        return  "TITULO :" +  this.getTitulo() ;
        
        
    }
    
}
