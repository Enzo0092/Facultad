/**
 * Representa una caja de ahorro bancaria.
 *
 * @author Francisco Morales
 * @version 1.0 - 2026
 */
public class CajaDeAhorro
{
    //Atributos
    /**
     *  Datos que representan el número de cuenta, saldo, cantidad de extracciones posibles y titular de la cuenta.
     */
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
  
    //Constructores
    /**
     * Construye una caja de ahorro con el número de cuenta y titular indicados, estableciendo el saldo en cero 
     * y 10 extracciones posibles.
     * 
     * @param p_nroCuenta número de la cuenta de ahorro.
     * @param p_titular persona titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
    }
    
    /**
     * Construye una cuenta corriente con el número de cuenta, titular y saldo indicados, 
     * estableciendo el límite de descubierto en 500.
     * 
     * @param p_nroCuenta número de la cuenta de ahorro.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    //Metodos
    /**
     * Establece el número de cuenta.
     *
     * @param p_nroCuenta número de la cuenta de ahorro.
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
     * Establece las extracciones posibles.
     *
     * @param p_extraccionesPosibles extracciones posibles.
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
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
     * @return número de la cuenta de ahorro.
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
     * Obtiene las extracciones posibles.
     *
     * @return extracciones posibles.
     */
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
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
     * Comprueba si se puede extraer el importe indicado, verificando que no supere
     * el saldo disponible y que aún queden extracciones posibles.
     * 
     * @param p_importe importe que se desea extraer.
     * @return true si se puede realizar la extracción, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe){
        if(p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Realiza la extracción del importe indicado y descuenta una extracción posible.
     *
     * @param p_importe importe que se desea extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Coordina la operación de extracción, verificando previamente si el importe puede ser extraído.
     *
     * @param p_importe importe que se desea extraer.
     */
    public void extraer(double p_importe){
         if(this.puedeExtraer(p_importe)){
             this.extraccion(p_importe);
        }else if(this.getExtraccionesPosibles() == 0){
             System.out.println("No tiene habilitadas mas extracciones!");
        }else if(p_importe > this.getSaldo()){
             System.out.println("No puede extraer mas que el saldo!");
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
     * Muestra por pantalla los datos principales de la cuenta de ahorro.
     */
    public void mostrar(){
        System.out.println("- Caja de Ahorro –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}