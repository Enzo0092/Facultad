/**
 * La clase Alumno representa a un estudiante universitario.
 * Permite gestionar sus datos personales, calificaciones, cálculo de promedio
 * y determinar su condición de aprobación.
 * hereda de la clase Persona(subclase) aplicando el principio de la subclsificacion
 * 
 * @author Enzo Romero
 * @version 1.0 (tp5 herencia )
 */
public class  Alumno extends Persona{

    // Atributos propios y exclusivos del alumno ( los personales los hereda de Persona)
    private int LU;
    private double nota1;
    private double nota2;

    /**
     * Constructor de la clase Alumno.
     * invoca al constructor de la super clase (persona ) mediante super 
     * para inicializar los atributos heresdados antes de guardar los propios
     * @param p_dni dni de la persona ( heredado)
     * @param p_nombre nombre de la persona (heredado)
     * @param p_apellido apellido de la persona ( heredado)
     * @p_anio año de nacimiento (hereedado)
     * @param p_LU Libreta Universitaria del alumno.

     */
    public Alumno(int p_dni, String p_nombre, String p_apellido , int p_anio,int p_LU) {
       //llama al constructor de Persona pasandole los datos personales
       super(p_dni ,p_nombre, p_apellido,p_anio);
        this.setLU(p_LU);

        this.setNota1(0.0);//inicializa notas en 0
        this.setNota2(0.0);
    }
    
    /**
     * constructor sobrecargado con notas inicialies
     */
    
     public Alumno(int p_dni, String p_nombre, String p_apellido , int p_anio,int p_LU,double p_nota1, double p_nota2) {
       //llama al constructor de Persona pasandole los datos personales
       super(p_dni ,p_nombre, p_apellido,p_anio);
        this.setLU(p_LU);

        this.setNota1(p_nota1);//inicializa notas en 0
        this.setNota2(p_nota2);
    }
    
//accessors propios 


    private void setLU(int p_LU) {
        this.LU = p_LU;
    }
    public int getLU(){
        return this.LU;
    }
    private void setNota1 (double p_nota1){
        this.nota1 = p_nota1;
    }
    public double getNota1(){
        return this.nota1;
    }
    private void setNota2(double p_nota2){
        this.nota2=p_nota2;
    }
    public double getNota2(){
        return this.nota2;
    }
    

    


    

    
    // MÉTODOS DE CÁLCULO Y COMPORTAMIENTO

    /**
     * Calcula el promedio de las dos notas del alumno.
     * 
     * @return El valor del promedio como double.
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2.0;
    }

    /**
     * Determina si el alumno aprueba la materia.
     * Requiere un promedio mayor o igual a 7.0 y notas individuales de al menos 6.0.
     * 
     * @return true si cumple los criterios de aprobación, false en caso contrario.
     */
    private boolean aprueba() {
        return (this.promedio() >= 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0);
    }

    /**
     * Genera la cadena de texto con la condición final del alumno.
     * 
     * @return "APROBADO" o "DESAPROBADO" según corresponda.
     */
    private String leyenda() {
        if (this.aprueba()) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }


    

    /**
     *redefine (override) el metodo mostrar () de la superclase Persona.
     *utilizar super.mostrar() para reutilizar la impresion de datos personaes
     *y lu ego agrega la informacion propia del estudiante.
     */
    public void mostrar() {
        //1. retutiliza el comportamiento de persona( improme nombre, apellido, dni)
        super.mostrar();
        System.out.println("LU: " + this.getLU() + "  Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyenda());
    }
}