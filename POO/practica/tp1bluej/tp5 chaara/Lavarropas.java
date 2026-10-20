public class Lavarropas extends ArtefactoHogar{
    private int  programas;
    private float kilos;
    private boolean automatico;
    
    
    /**
     * constructor 
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock,int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca,p_precio,p_stock);
        this.setProgramas(p_programas );
        this.setKilos(p_kilos);
        
    }
}