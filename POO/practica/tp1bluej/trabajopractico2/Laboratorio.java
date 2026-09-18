
/**
 * .
 * 
 * @author (Enzo Romero) 
 * @version 1.0
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**constructor uno 
       *constructores sobre cargados
       *@param p_nombre nombre
       *@param p_domicilio
       *@param p_ telefono telefono
       *@param p_ compra minima
       *@param p_diaEntrega
        */
       public Laboratorio (String p_nombre, String p_domicilio,String p_telefono, int p_compraMinima, int p_diaEntrega){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
        /**
           *constuctor 2 con menos parametros inicializa en 0 a compra minima
           *y dia de entrega
            
            */
       }
       public Laboratorio (String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
       }
       // seters mutadores privados 
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
        
    }
    private void setDomicilio (String p_domicilio){
        this.domicilio=p_domicilio;
    }
    private void setTelefono (String p_telefono){
        this.telefono=p_telefono;
    }
    private void setCompraMinima(int p_compraMinima){
        this.compraMinima =p_compraMinima;
        
    }
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega=p_diaEntrega;
    }
    // geters obervadores publicos
     
    
    /**
       *get nombre devuelve el nombre 
       */
    public String  getNombre(){
        return this.nombre;
    }
    /**
       *getdomicilio devuelve el atributo domicilio
       *
        */
    public String getDomicilio(){
        return this.domicilio;
    }
    /**
     * get telefono devuelve el atributo telefono
       */
    public String getTelefono(){
        return this.telefono;
        
    }
    /**
     * get compraminima() devuelve el atributo compra minima
       
       */
    public int getCompraMinima(){
        return this.compraMinima;
        /**
         * getdiaentrega() devuelve el atributo diaEntrega
           
           */
    }
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * asigna mediante el set el parametro p_compraMinima al atributo compraMinima
       */
    public void nuevaCompraMinima (int p_compraMinima){
        this.setCompraMinima(p_compraMinima);
    } 
    /**
     * asigna mediante el set el parametro p_diaEntrega al atributo diaEntrega
       */
    public void nuevoDiaEntrega(int p_diaEntrega){
        this.setDiaEntrega(p_diaEntrega);
    }
    /**
     * devuelve un String mostrando el nombre y domiciolio mas el telefono del laboratorio
       */
    public String mostrar (){
        return "Laboratorio : " + this.getNombre() + "\n" + "Domicilio:" + this.getDomicilio() +"-" + "Telefono :" + this.getTelefono();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}