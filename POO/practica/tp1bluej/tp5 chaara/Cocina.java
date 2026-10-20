/**
 * Representa un artefacto de tipo cocina.
 * Modela sus características térmicas y estructurales, calculando sus cuotas de crédito.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Cocina extends ArtefactoHogar {
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Construye una cocina con los datos generales del artefacto y sus características específicas.
     * 
     * @param p_marca marca comercial de la cocina.
     * @param p_precio precio de lista de la cocina.
     * @param p_stock unidades disponibles en inventario.
     * @param p_hornallas cantidad de hornallas de la cocina.
     * @param p_calorias potencia calorífica total expresada en calorías.
     * @param p_dimensiones dimensiones físicas en formato ancho*alto*profundidad (ej. 80*60*60cm).
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    // Accesors
    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    public int getHornallas() {
        return this.hornallas;
    }

    public int getCalorias() {
        return this.calorias;
    }

    public String getDimensiones() {
        return this.dimensiones;
    }

    /**
     * Muestra la información detallada de la cocina, incluyendo datos comunes y específicos.
     */
    @Override
    public void imprimir() {
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
    }

    /**
     * Calcula la cuota final del crédito.
     * Al no poseer recargos ni bonificaciones particulares, equivale a la cuota base.
     * 
     * @param p_cuotas cantidad de cuotas a financiar.
     * @param p_interes tasa porcentual de interés aplicada.
     * @return valor monetario final de cada cuota.
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        return this.cuotaCredito(p_cuotas, p_interes);
    }
}