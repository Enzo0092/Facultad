/**
 * Representa un artefacto de tipo lavarropas.
 * Permite gestionar programas de lavado, capacidad de carga y si aplica
 * bonificación en las cuotas por no ser automático.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Lavarropas extends ArtefactoHogar {
    private int programas;
    private float kilos;
    private boolean automatico;

    /**
     * Construye un lavarropas con los atributos comunes y específicos.
     * 
     * @param p_marca marca del producto.
     * @param p_precio precio original de lista.
     * @param p_stock unidades en inventario.
     * @param p_programas cantidad de ciclos de lavado disponibles.
     * @param p_kilos capacidad de carga máxima en kilogramos.
     * @param p_automatico true si es automático, false si es semiautomático o manual.
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    // Accesors
    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    public int getProgramas() {
        return this.programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    public boolean getAutomatico() {
        return this.automatico;
    }

    /**
     * Imprime los datos del lavarropas combinando datos generales y específicos.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.println("Es automatico: " + (this.getAutomatico() ? "Si" : "No"));
    }

    /**
     * Calcula la cuota final aplicando un descuento del 2% si el lavarropas no es automático.
     * 
     * @param p_cuotas número de cuotas pactadas.
     * @param p_interes porcentaje de interés.
     * @return cuota final con el descuento aplicado si corresponde.
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float cuotaBase = this.cuotaCredito(p_cuotas, p_interes);
        if (!this.getAutomatico()) {
            return cuotaBase * 0.98f;
        } else {
            return cuotaBase;
        }
    }
}