

/**
 * clase que representa a toda figura geometrica
 * @author Enzo Romero
 * @version 1.0
 */
public abstract class FiguraGeometrica{
    private Punto origen;
    /**
     * constructor de la figura geometrica con su punto de origen
     * @param p_origen punto de origen de la figura.
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    //accesor 
    private void setOrigen(Punto p_origen){
        this.origen= p_origen;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    //metodos abstractos que cada figura concreta debe implementar obligatoriamente
    public abstract String nombreFigura();
    public abstract double superficie();
    
    /**
     * muestra el nombre de la figura y su superficie calculada plimorfiamente.
     */
    public void mostrarSuperficie(){
        System.out.println("*****" +this.nombreFigura() + "****");
        System.out.println("superficie :" + this.superficie());
    }
}