/**
 * super clase cuenta bancaria creada para refactorizar el punnto 6
 * @author Enzo Romero
 * @author Morales Francisco
 * @version 1.0
 */
public class CuentaBancaria{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    /**constructor que recibeun saldo inicial
     * @param nro cuenta
     * @param titular
     * @param saldo
     * 
     * 
     */
    
    public CuentaBancaria(int p_nroCuenta,  Persona p_titular,double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }
    /**
     * constructor que inicializa el saldo en 0
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
    this.setNroCuenta(p_nroCuenta);
    this.setTitular(p_titular);
    this.setSaldo(0.0);
}
    //accesors
     private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    protected  void setSaldo(double p_saldo){
        this.saldo = p_saldo; 
    }
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
    public Persona getTitular(){
        return this.titular;
    }
    //metodos de la clase
    /**
     * Deposita un importe en la cuenta, sumándolo al saldo actual.
     *
     * @param p_importe importe que se desea depositar.
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra por pantalla los datos principales de la cuenta corriente.
     */
    public void mostrar(){
        
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }
  
}