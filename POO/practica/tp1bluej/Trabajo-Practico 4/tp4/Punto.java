/**
 * Clase Punto - Representa un punto en el plano cartesiano.
 * 
 * @author Enzo Romero
 */
public class Punto {
    private double x;
    private double y;

    // CONSTRUCTOR 1: Sin parámetros (sitúa el punto en el origen X=0, Y=0)
    public Punto() {
        this.setX(0.0);
        this.setY(0.0);
    }

    // CONSTRUCTOR 2: Explícito con parámetros
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }

    // SETTERS (MUTADORES)
    private void setX(double p_x) {
        this.x = p_x;
    }

    private void setY(double p_y) {
        this.y = p_y;
    }

    // GETTERS (OBSERVADORES)
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // MÉTODOS DE COMPORTAMIENTO
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    public double distanciaA(Punto p_ptoDistante) {
    double dx = this.getX() - p_ptoDistante.getX();
    double dy = this.getY() - p_ptoDistante.getY();
    return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public String coordenadas() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }

    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
}