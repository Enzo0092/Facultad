/**
 * Representa una caja de ahorro.
 * 
 * @author
 * @version
 */
public class CajaDeAhorro extends Cuenta
{
    // Atributos
    /**
     * Cantidad de extracciones que todavía puede realizar el titular.
     */
    private int extraccionesPosibles;
    
    // Constructores
    /**
     * Construye una caja de ahorro con el número de cuenta y titular indicados,
     * estableciendo el saldo en cero y 10 extracciones posibles.
     * 
     * @param p_nroCuenta número de la cuenta.
     * @param p_titular persona titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    /**
     * Construye una caja de ahorro con el número de cuenta, titular y saldo indicados,
     * estableciendo 10 extracciones posibles.
     * 
     * @param p_nroCuenta número de la cuenta.
     * @param p_titular persona titular de la cuenta.
     * @param p_saldo saldo inicial de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    // Métodos
    /**
     * Establece la cantidad de extracciones posibles.
     * 
     * @param p_extracciones cantidad de extracciones posibles.
     */
    private void setExtraccionesPosibles(int p_extracciones)
    {
        this.extraccionesPosibles = p_extracciones;
    }
    
    /**
     * Obtiene la cantidad de extracciones posibles.
     * 
     * @return cantidad de extracciones posibles.
     */
    public int getExtraccionesPosibles()
    {
        return this.extraccionesPosibles;
    }
    
    /**
     * Comprueba si es posible extraer el importe indicado.
     * 
     * @param p_importe importe que se desea extraer.
     * @return true si se puede realizar la extracción, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe)
    {
        if(p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Realiza la extracción del importe indicado.
     * 
     * @param p_importe importe que se desea extraer.
     */
    private void extraccion(double p_importe)
    {
        this.setSaldo(p_importe);
    }
    
    /**
     * Indica el motivo por el cual no se puede realizar una extracción.
     * 
     * @param p_importe importe que se desea extraer.
     * @return mensaje indicando por qué no puede realizarse la extracción.
     */
    public String xQNoPuedeExtraer(double p_importe)
    {
        if(this.getExtraccionesPosibles() == 0){
            return "No tiene habilitadas mas extracciones!";
        }else if(p_importe > this.getSaldo()){
            return "No puede extraer mas que el saldo!";
        }else{
            return "";
        }
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
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return true;
        }else{
            System.out.println(this.xQNoPuedeExtraer(p_importe));
            return false;
        }
    }
    
    /**
     * Muestra por pantalla los datos principales de la caja de ahorro.
     */
    public void mostrar()
    {
        System.out.println("- Caja de Ahorro –");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}