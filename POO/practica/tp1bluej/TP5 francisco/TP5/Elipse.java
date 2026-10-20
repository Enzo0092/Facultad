/**
 * Representa una elipse definida por sus semiejes y su centro.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Elipse
{
    //Atributos
    /** Longitud del semieje mayor. */
    private double sEjeMayor;
    /** Longitud del semieje menor. */
    private double sEjeMenor;
    /** Punto que representa el centro de la elipse. */
    private Punto centro;

    //Constructor
    /**
     * Construye una elipse con los semiejes y el centro indicados.
     *
     * @param p_sEjeMayor longitud del semieje mayor
     * @param p_sEjeMenor longitud del semieje menor
     * @param p_centro punto que representa el centro
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
    }

    //Metodos:
    /**
     * Establece la longitud del semieje mayor.
     *
     * @param p_sEjeMayor longitud del semieje mayor
     */
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }

    /**
     * Establece la longitud del semieje menor.
     *
     * @param p_sEjeMenor longitud del semieje menor
     */
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }

    /**
     * Establece el centro de la elipse.
     *
     * @param p_centro punto que representa el centro
     */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }

    /**
     * Devuelve la longitud del semieje mayor.
     *
     * @return longitud del semieje mayor
     */
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }

    /**
     * Devuelve la longitud del semieje menor.
     *
     * @return longitud del semieje menor
     */
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }

    /**
     * Devuelve el centro de la elipse.
     *
     * @return punto que representa el centro
     */
    public Punto getCentro(){
        return this.centro;
    }

    /**
     * Devuelve el nombre de la figura.
     *
     * @return nombre de la figura
     */
    public String nombreFigura(){
        return "****** Elipse ******";
    }

    /** 
     * Calcula la superficie de la elipse.
     * 
     * @return superficie de la elipse
     */
    public double superficie(){
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }

    /** 
     * Desplaza el centro de la elipse según las distancias indicadas.
     * 
     * @param p_dx desplazamiento sobre el eje X
     * @param p_dy desplazamiento sobre el eje Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }

    /**
     * Calcula la distancia entre los centros de dos elipses.
     *
     * @param otraElipse elipse con la que se calcula la distancia
     * @return distancia entre los centros
     */
    public double distanciaA(Elipse otraElipse){
        return this.getCentro().distanciaA(otraElipse.getCentro());
    }

    /** 
     * Determina cuál de las dos elipses posee mayor superficie.
     * 
     * @param otraElipse elipse que se compara con esta
     * @return elipse que posee mayor superficie
     */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie() > otraElipse.superficie()){
            return this;
        }else{
            return otraElipse;
        }
    }

    /**
     * Muestra las características de la elipse.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro() + " - Semieje Mayor: " + this.getSEjeMayor() +  " - Semieje Menor: " + getSEjeMenor());
        System.out.println("Superficie: " + this.superficie()); 
    }
}