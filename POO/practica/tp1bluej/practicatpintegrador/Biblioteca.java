import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;

public class Biblioteca{
    private String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Libro> libros;
    
    
    public Biblioteca(String p_nombre){
        this.setNombre(p_nombre);
        this.setSocios(new ArrayList<Socio>());
        this.setLibros(new ArrayList<Libro>());
    }
    
    public Biblioteca(String p_nombre , ArrayList<Socio> p_socios, ArrayList<Libro> p_libros){
        this.setNombre(p_nombre);
        this.setSocios(p_socios);
        this.setLibros(p_libros);
        
    }
    //setters y getters
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    private void setSocios(ArrayList<Socio> p_socios){
        this.socios=p_socios;
    }
    private void setLibros(ArrayList<Libro> p_libros){
        this.libros=p_libros;
    }
    // Getters públicos
    public String getNombre() {
        return this.nombre;
    }
    
    
    
    
    
    //metodos mpara manipular collecciones
    
    public boolean agregarSocio(Socio p_socio){
        return this.socios.add(p_socio);
    }
    public boolean quitarSocio(Socio p_socio){
        return this.socios.remove(p_socio);
    }
    public boolean agregarLibro(Libro p_libro){
        return this.libros.add(p_libro);
    }
    public boolean quitarLibro(Libro p_libro){
        return this.libros.remove(p_libro);
    }
    
    public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio){
        Libro nuevoLibro= new Libro(p_titulo, p_edicion,p_editorial, p_anio);
        this.agregarLibro(nuevoLibro);
    }
    public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre,String p_carrera){
        Estudiante nuevoEstudiante = new Estudiante(p_dniSocio,p_nombre,p_carrera);
        this.agregarSocio(nuevoEstudiante);
        
    }
    public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
        Docente nuevoDocente= new Docente ( p_dniSocio, p_nombre, p_area);
        this.agregarSocio(nuevoDocente);
        
    }
    
    
    public boolean prestarLibro(Calendar p_fechaRetiro, Socio p_socio, Libro p_libro){
        
        if(p_socio.puedePedir() && !p_libro.prestado()){
        Calendar fechaDevolucion =(Calendar)p_fechaRetiro.clone();
        fechaDevolucion.add(Calendar.DAY_OF_MONTH,p_socio.getDiasPrestamo());
        
        Prestamo nuevoPrestamo =  new Prestamo(p_fechaRetiro,fechaDevolucion,p_libro,p_socio);
        return p_socio.agregarPrestamo(nuevoPrestamo);
    }else{
        return false ;// si  el libro no se puede pedir o esta prestado 
    }
        
    }
    
    public void devolverLibro( Libro p_libro){
        Prestamo unPrestamo =p_libro.ultimoPrestamo();
        //2 si existe un prestamo activo para ese libro 
        if(unPrestamo!=null){
            //3 obtenemos el socio que hizo eese prestamo 
            Socio unSocio= unPrestamo.getSocio();
            
            //4 le quitamos el prestamo de su ista al socio
            unSocio.quitarPrestamo(unPrestamo);
        }
    }
    
}
    
    
