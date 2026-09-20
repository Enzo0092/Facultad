/**
 * Representa una cuenta bancaria asociada a una persona (titular).
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class CuentaBancaria {

    // Atributos privados
    private int nroCuenta;
    private double saldo;
    private Persona titular; // Colaborador (Relación de Asociación 1 a 1)

    /**
     * Constructor explícito que exige un titular al momento de crearse.
     * 
     * @param p_nroCuenta Número identificador de la cuenta.
     * @param p_titular Objeto Persona que será el dueño de la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0); // Por defecto el saldo inicia en 0
    }

    /**
     * Constructor sobrecargado con saldo inicial.
     * 
     * @param p_nroCuenta Número identificador de la cuenta.
     * @param p_titular Objeto Persona que será el dueño de la cuenta.
     * @param p_saldo Monto inicial depositado.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    // SETTERS (MUTADORES PRIVADOS)
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    // GETTERS (OBSERVADORES PÚBLICOS)
    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    // MÉTODOS DE COMPORTAMIENTO

    /**
     * Incrementa el saldo actual de la cuenta.
     * 
     * @param p_importe Monto a depositar.
     */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Descuenta del saldo el importe indicado.
     * 
     * @param p_importe Monto a extraer.
     */
    public void extraer(double p_importe) {
        this.setSaldo(this.getSaldo() - p_importe);
    }

    /**
     * Muestra por consola la información de la cuenta y su titular.
     */
    public void mostrar() {
        System.out.println(this.getNroCuenta() + " - " + this.getTitular().apeYNom() + " - $" + this.getSaldo());
    }

    /**
     * Devuelve una cadena representativa con el número de cuenta y el nombre del titular.
     * 
     * @return Cadena formateada para los reportes.
     */
    public String toCadena() {
        return this.getNroCuenta() + " - " + this.getTitular().apeYNom();
    }
}