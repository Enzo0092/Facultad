/**
 * Representa una cuenta corriente bancaria.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class CuentaCorriente
{
    //Atributos
    /**
     * Datos que representan el número de cuenta, saldo, límite de descubierto y titular de la cuenta.
     */
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    //Constructores
    /**
     * Construye una cuenta de ahorro con el número de cuenta y titular indicados, 
     * estableciendo el saldo en cero y el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Construye una cuenta de ahorro con el número de cuenta, titular y saldo indicados, 
     * estableciendo el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500.0);
    }
    
    //Metodos
    /**
     * Establece el número de cuenta.
     *
     * @param p_nroCuenta número de la cuenta corriente.
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Establece el saldo de cuenta.
     *
     * @param p_saldo saldo de la cuenta.
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo; 
    }
    
    /**
     * Establece el límite de descubierto de la cuenta.
     *
     * @param p_limiteDescubierto límite de descubierto autorizado.
     */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /**
     * Establece el titular de la cuenta.
     *
     * @param p_titular persona titular de la cuenta.
     */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
     * Obtiene el numero de la cuenta.
     *
     * @return número de la cuenta corriente.
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
     * Obtiene el saldo de la cuenta.
     *
     * @return saldo de la cuenta.
     */
    public double getSaldo(){
        return this.saldo;
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
    public Persona getTitular(){
        return this.titular;
    }
    
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
     * Deposita un importe en la cuenta, sumándolo al saldo actual.
     *
     * @param p_importe importe que se desea depositar.
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Muestra por pantalla los datos principales de la cuenta corriente.
     */
    public void mostrar(){
        System.out.println("- Cuenta Corriente –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}