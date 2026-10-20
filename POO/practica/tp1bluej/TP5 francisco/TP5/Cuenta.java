/**
 * Representa una cuenta bancaria.
 *
 * @author
 * @version
 */
public class Cuenta
{
    // Atributos
    /**
     * Datos que representan el número de cuenta, saldo y titular de la cuenta.
     */
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    // Constructores
    /**
     * Construye una cuenta con el número de cuenta y titular indicados,
     * estableciendo el saldo en cero.
     *
     * @param p_nroCuenta número de la cuenta.
     * @param p_titular persona titular de la cuenta.
     */
    public Cuenta(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /**
     * Construye una cuenta con el número de cuenta, titular y saldo indicados.
     *
     * @param p_nroCuenta número de la cuenta.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public Cuenta(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    // Métodos
    /**
     * Establece el número de cuenta.
     *
     * @param p_nroCuenta número de la cuenta.
     */
    private void setNroCuenta(int p_nroCuenta)
    {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Establece el saldo de la cuenta.
     *
     * @param p_saldo saldo de la cuenta.
     */
    public void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }
    
    /**
     * Establece el titular de la cuenta.
     *
     * @param p_titular persona titular de la cuenta.
     */
    private void setTitular(Persona p_titular)
    {
        this.titular = p_titular;
    }
    
    /**
     * Obtiene el número de cuenta.
     *
     * @return número de la cuenta.
     */
    public int getNroCuenta()
    {
        return this.nroCuenta;
    }
    
    /**
     * Obtiene el saldo de la cuenta.
     *
     * @return saldo de la cuenta.
     */
    public double getSaldo()
    {
        return this.saldo;
    }
    
    /**
     * Obtiene el titular de la cuenta.
     *
     * @return titular de la cuenta.
     */
    public Persona getTitular()
    {
        return this.titular;
    }
    
    /**
     * Deposita un importe en la cuenta.
     *
     * @param p_importe importe que se desea depositar.
     * @return nuevo saldo de la cuenta.
     */
    public double depositar(double p_importe)
    {
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
}
