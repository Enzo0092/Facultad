/**
 * Representa una figura geométrica Círculo definida por su centro (Punto) y su radio.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Circulo {

    private double radio;
    private Punto centro;

    /**
     * Constructor explícito que asigna un radio y un objeto Punto como centro.
     * 
     * @param p_radio Radio del círculo.
     * @param p_centro Objeto Punto que representa el centro del círculo.
     */
    public Circulo(double p_radio, Punto p_centro) {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    } 

    /**
     * Constructor por defecto. Crea un círculo de radio 0 centrado en el origen (0,0).
     */
    public Circulo() {
        this.setRadio(0.0);
        this.setCentro(new Punto(0.0, 0.0));
    }

    // Setters (Mutadores privados)

    private void setRadio(double p_radio) {
        this.radio = p_radio;
    }

    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }

    // Getters (Observadores públicos)

    /**
     * Obtiene el radio del círculo.
     * 
     * @return El radio actual.
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * Obtiene el objeto Punto que actúa como centro del círculo.
     * 
     * @return El punto centro.
     */
    public Punto getCentro() {
        return this.centro;
    }

    // Comportamiento de la clase

    /**
     * Desplaza el círculo trasladando su punto centro.
     * 
     * @param p_dx Desplazamiento en el eje X.
     * @param p_dy Desplazamiento en el eje Y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getCentro().desplazar(p_dx, p_dy);
    }

    /**
     * Calcula el perímetro del círculo.
     * 
     * @return Perímetro calculado.
     */
    public double perimetro() {
        return 2 * Math.PI * this.getRadio();
    }

    /**
     * Calcula la superficie (área) del círculo.
     * 
     * @return Superficie calculada.
     */
    public double superficie() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    /**
     * Calcula la distancia entre el centro de este círculo y el de otro círculo.
     * 
     * @param p_otroCirculo Instancia del círculo a comparar.
     * @return Distancia entre los centros de ambos círculos.
     */
    public double distanciaA(Circulo p_otroCirculo) {
        return this.getCentro().distanciaA(p_otroCirculo.getCentro());
    }

    /**
     * Compara este círculo con otro en función de su superficie y devuelve el de mayor área.
     * 
     * @param p_otroCirculo Instancia del círculo a comparar.
     * @return El objeto Circulo con mayor superficie.
     */
    public Circulo elMayor(Circulo p_otroCirculo) {
        if (this.superficie() >= p_otroCirculo.superficie()) {
            return this;
        } else {
            return p_otroCirculo;
        }
    }

    /**
     * Imprime en pantalla las características del círculo, su superficie y perímetro.
     */
    public void caracteristicas() {
        System.out.println("****** Circulo ******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - Perímetro: " + this.perimetro());
    }
}