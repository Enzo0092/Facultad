/** 
  * Representa una cuenta bancaria. 
  * 
  * @author Francisco Morales 
  * @version 1.0 - 2026 
  */
public class CuentaBancaria
{
    //Atributos
    /** 
      * Atributos que representan el número de cuenta, el saldo y el titular de la cuenta. 
      */
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    //Constructores
    /** 
      * Construye una cuenta bancaria con el número de cuenta y titular indicados, 
      * estableciendo el saldo inicial en cero. 
      * 
      * @param p_nroCuenta número de la cuenta bancaria. 
      * @param p_titular persona titular de la cuenta. 
      */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /** 
       * Construye una cuenta bancaria con el número de cuenta, titular y saldo indicados. 
       * 
       * @param p_nroCuenta número de la cuenta bancaria. 
       * @param p_titular persona titular de la cuenta. 
       * @param p_saldo saldo inicial de la cuenta. 
       */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //Metodos
    /** 
      * Establece el número de cuenta. 
      * 
      * @param p_nroCuenta número de la cuenta bancaria. 
      */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
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
      * Establece el saldo de la cuenta. 
      * 
      * @param p_saldo saldo de la cuenta. 
      */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /** 
     * Obtiene el número de cuenta.
     * 
     * @return número de la cuenta bancaria.
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /** 
      * Obtiene el titular de la cuenta. 
      * 
      * @return persona titular de la cuenta.
      */
    public Persona getTitular(){
        return this.titular;
    }
    
    /** 
       * Obtiene el saldo actual de la cuenta. 
       * 
       * @return saldo actual de la cuenta. 
       */
    public double getSaldo(){
        return this.saldo;
    }
    
    /** 
       * Deposita un importe en la cuenta y devuelve el saldo resultante. 
       * 
       * @param p_importe importe que se deposita. 
       * @return saldo resultante después del depósito. 
       */
    public double depositar(double p_importe){
        this.saldo = this.saldo + p_importe;
        return this.saldo;
    }
    
    /** 
       * Extrae un importe de la cuenta y devuelve el saldo resultante. 
       * 
       * @param p_importe importe que se extrae. 
       * @return saldo resultante después de la extracción. 
       */
    public double extraer(double p_importe){
        this.saldo = this.saldo - p_importe;
        return this.saldo;
    }
    
    /** 
      * Muestra por pantalla los datos principales de la cuenta bancaria. 
      */
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " +  this.titular.nomYApe() + " (" + this.titular.edad() + " años)");
        System.out.println("Saldo: " + saldo);
    }
    
    /** 
       * Obtiene una representación textual de la cuenta bancaria. 
       * 
       * @return número de cuenta, titular y saldo separados por espacios. 
       */
    public String toString(){
        return this.getNroCuenta() + " " + this.getTitular() + " " + this.getSaldo();
    }
}