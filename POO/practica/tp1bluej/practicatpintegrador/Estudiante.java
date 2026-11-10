
public class Estudiante extends Socio{
    private String carrera;
    
    public Estudiante(int p_dniSocio, String p_nombre,  String p_carrera){
        super(p_dniSocio, p_nombre, 20);
        this.setCarrera(p_carrera);
        
    }
    // settersy getters
    
    private void setCarrera(String p_carrera){
        this.carrera=p_carrera;
    }
    public String getCarrera(){
        return this.carrera;
    }

    public boolean  puedePedir(){
        return (super.puedePedir() && this.cantLibrosPrestados() <4 );
    }
    public String soyDeLaClase(){
        return "Estudiante";
    }
}