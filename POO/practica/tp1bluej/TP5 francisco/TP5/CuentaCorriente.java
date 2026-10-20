/**
 * Representa una cuenta corriente.
 * 
 * @author
 * @version
 */
public class CuentaCorriente extends Cuenta
{
    // Atributos
    /**
     * Límite de descubierto autorizado para la cuenta.
     */
    private double limiteDescubierto;
    
    // Constructores
    /**
     * Construye una cuenta corriente con el número de cuenta y titular indicados,
     * estableciendo el saldo en cero y el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500.0);
    }
    
    /**
     * Construye una cuenta corriente con el número de cuenta, titular y saldo indicados,
     * estableciendo el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta corriente.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.0);
    }
    
    // Métodos
    /**
     * Establece el límite de descubierto de la cuenta.
     * 
     * @param p_limiteDescubierto límite de descubierto autorizado.
     */
    private void setLimiteDescubierto(double p_limiteDescubierto)
    {
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /**
     * Obtiene el límite de descubierto autorizado.
     * 
     * @return límite de descubierto autorizado.
     */
    public double getLimiteDescubierto()
    {
        return this.limiteDescubierto;
    }
    
    /**
     * Comprueba si es posible extraer el importe indicado sin superar
     * el límite de descubierto autorizado.
     * 
     * @param p_importe importe que se desea extraer.
     * @return true si se puede realizar la extracción, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe)
    {
        if(p_importe <= this.getSaldo() + this.getLimiteDescubierto()){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Indica el motivo por el cual no se puede realizar una extracción.
     * 
     * @param p_importe importe que se desea extraer.
     * @return mensaje indicando por qué no puede realizarse la extracción.
     */
    public String xQNoPuedeExtraer(double p_importe)
    {
        return "El importe de extraccion sobrepasa el límite de descubierto!";
    }
    
    /**
     * Realiza una extracción si el importe puede ser extraído.
     * 
     * @param p_importe importe que se desea extraer.
     * @return true si la extracción se realiza, false en caso contrario.
     */
    public boolean extraer(double p_importe)
    {
        if(this.puedeExtraer(p_importe)){
            this.setSaldo(this.getSaldo() - p_importe);
            return true;
        }else{
            System.out.println(this.xQNoPuedeExtraer(p_importe));
            return false;
        }
    }
    
    /**
     * Muestra por pantalla los datos principales de la cuenta corriente.
     */
    public void mostrar()
    {
        System.out.println("- Cuenta Corriente –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}