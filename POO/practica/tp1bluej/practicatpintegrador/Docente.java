public class Docente extends Socio{
    private String area;
    
    
    public Docente(int p_dniSocio, String p_nombre,  String p_area){
        super(p_dniSocio, p_nombre, 30);
        this.setArea(p_area);
    }
    //seters y getters
    private void setArea(String p_area){
        this.area=p_area;
    }
    public String getArea(){
        return this.area;
    }
    
    public boolean puedePedir(){
        return super.puedePedir();
    }
    public boolean esResponsable(){
        return puedePedir();
    }
    public String soyDeLaClase(){
        return "Docente";
    }
    
    public void CambiarDiasDePrestamo(int p_masDias){
        this.setDiasPrestamo(p_masDias);
    }
}