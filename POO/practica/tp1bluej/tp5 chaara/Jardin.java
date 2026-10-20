/**
 * representa un jardin configuras geometricas a puntar e nel puso 
 * @author enzo Romero
 * @version 1.0
 */
import java.util.ArrayList;

public class Jardin{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras; //la relacion es de 0 a muchos
    /**
     * constructor para jardin con lista vacia
     * @param p_nombre del jardin.
     */
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
        
    }
    /**
     * constructor para jardin con lista inicial de figuras
     * @param p_nombre del jardin
     * @param p_figuras lista de figuras geometricas
     */
    public Jardin(String p_nombre , ArrayList <FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    /**
     *  constructor que  nace con una figura geometrica
     */
    public Jardin(String p_nombre, FiguraGeometrica p_figura){
        this.setNombre(p_nombre);
        this.setFiguras( new ArrayList<FiguraGeometrica>());
        this.agregarFigura(p_figura);
    
    }

    //accesors
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras=p_figuras;
    }
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    // gestion de la colleccion
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    /**
     * calcula la suma total de metros cuadrados de todas las figuras del jardin
     * 
     * @return total de metros cuadrados a cubrir
     */
    public double cuantosMetros(){
        double totalMetros=0.0;
        for(FiguraGeometrica unaFigura : this.getFiguras()){
            totalMetros += unaFigura.superficie();
        }
        return totalMetros;
    }
    /**
     * calcula los litros de puntura necesarios sabiendo que 4 listros cubren 20 m2
     * 
     * @rerun listros totales requeridos
     */
    public double cuantosLitros(){
        return (this.cuantosMetros() *4.0) / 20.0;
    }
    
    /** 
     * calcula la cantidad entera de latas a comprar (cada lata cubre 20 m2).
     * redondea hacia arriva para  no quedarse sin pintura 
     * @return cantidad de latas a comprar.
     */
    public int cuantasLatas(){
        return (int) Math.ceil( this.cuantosMetros() /20.0);
    }
    
    /**
     * emite el listado de figuras con sus superficies, el total al cubrir y las latas a comprar
     * 
     */
    
    public void detalleFiguras(){
        System.out.println( "presupuesto : " + this.getNombre() );
        for (FiguraGeometrica unaFigura : this.getFiguras()){
            unaFigura.mostrarSuperficie();
        }
        System.out.println("------------------------------");
        System.out.println("total a cubrir :" + Math.round (this.cuantosMetros() *100.0) /100.0);
        System.out.println("comprar" + this.cuantasLatas() + "latas");
    }
    
}