/**
 * Representa a un alumno universitario con sus notas.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Alumno {

    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    public Alumno(int p_lu, String p_nombre, String p_apellido) {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    public Alumno(int p_lu, String p_nombre, String p_apellido, double p_nota1, double p_nota2) {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }

    // Mutadores y Observadores
    private void setLu(int p_lu) { this.lu = p_lu; }
    private void setNombre(String p_nombre) { this.nombre = p_nombre; }
    private void setApellido(String p_apellido) { this.apellido = p_apellido; }
    public void setNota1(double p_nota1) { this.nota1 = p_nota1; }
    public void setNota2(double p_nota2) { this.nota2 = p_nota2; }

    public int getLu() { return this.lu; }
    public String getNombre() { return this.nombre; }
    public String getApellido() { return this.apellido; }
    public double getNota1() { return this.nota1; }
    public double getNota2() { return this.nota2; }

    // Comportamientos
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2.0;
    }

    public boolean aprobo() {
        return this.promedio() >= 6.0;
    }

    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    public void mostrar() {
        System.out.println("Apellido y nombre: " + this.nomYApe());
        System.out.println("LU: " + this.getLu() + " Notas: " + this.getNota1() + ", " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " " + (this.aprobo() ? "Aprobado" : "Desaprobado"));
    }
}
