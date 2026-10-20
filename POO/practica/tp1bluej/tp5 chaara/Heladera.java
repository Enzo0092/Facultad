/**
 * Representa un artefacto de tipo heladera.
 * Modela su capacidad, cantidad de puertas y si cuenta con compresor para calcular su cuota con seguro adicional.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Heladera extends ArtefactoHogar {
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Construye una heladera con los datos generales y sus características técnicas.
     * 
     * @param p_marca marca comercial de la heladera.
     * @param p_precio precio de venta del producto.
     * @param p_stock cantidad disponible en inventario.
     * @param p_pies capacidad volumétrica expresada en pies cúbicos.
     * @param p_puertas número de puertas de la heladera.
     * @param p_compresor indica si posee compresor (true) o no (false).
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor) {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    // Accesors
    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    public int getPies() {
        return this.pies;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public boolean getCompresor() {
        return this.compresor;
    }

    /**
     * Muestra las especificaciones de la heladera, incluyendo datos generales y particulares.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Compresor: " + (this.getCompresor() ? "Si" : "No"));
    }

    /**
     * Calcula el valor de la cuota sumando $50 de seguro si la heladera posee compresor.
     * 
     * @param p_cuotas cantidad de cuotas a financiar.
     * @param p_interes tasa porcentual de interés aplicada.
     * @return cuota final con el adicional por compresor si corresponde.
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        if (this.getCompresor()) {
            return this.cuotaCredito(p_cuotas, p_interes) + 50.0f;
        } else {
            return this.cuotaCredito(p_cuotas, p_interes);
        }
    }
}