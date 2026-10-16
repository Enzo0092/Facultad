/**
 * Representa una cuenta corriente bancaria.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class CuentaCorriente extends CuentaBancaria
{
    //Atributos
    /**
     * Datos que representan el número de cuenta, saldo, límite de descubierto y titular de la cuenta.
     */
    
    private double limiteDescubierto;
   
    
    //Constructores
    /**
     * Construye una cuenta de ahorro con el número de cuenta y titular indicados, 
     * estableciendo el saldo en cero y el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta,Persona p_titular){
       super(p_nroCuenta,  p_titular);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Construye una cuenta corriente con el número de cuenta, titular y saldo indicados, 
     * estableciendo el límite de descubierto en 500.0.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.0);
    }
     
    
    
    //Metodos
   
   
    
    /**
     * Establece el límite de descubierto de la cuenta.
     *
     * @param p_limiteDescubierto límite de descubierto autorizado.
     */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
   
    
    
    
    /**
     * Obtiene el límite de descubierto autorizado.
     *
     * @return límite de descubierto autorizado.
     */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Obtiene el titular de la cuenta.
     *
     * @return titular de la cuenta.
     */
    
    
    /**
     * Comprueba si es posible extraer el importe indicado sin superar
     * el saldo más el límite de descubierto autorizado.
     *
     * @param p_importe importe que se desea extraer.
     * @return true si se puede realizar la extracción, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() + this.getLimiteDescubierto()){
            return true;
        }else{
            return false;
        }
    }
      
     
   
    
    /**
     * Realiza la extracción del importe indicado, disminuyendo el saldo de la cuenta.
     *
     * @param p_importe importe que se desea extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    /**
     * Coordina la operación de extracción, verificando previamente si el importe puede ser extraído.
     *
     * @param p_importe importe que se desea extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    
    
    
    
    /**
     * Muestra por pantalla los datos principales de la cuenta corriente.
     */
    public void mostrar(){
        System.out.println("- Cuenta Corriente –");
        super.mostrar();
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}