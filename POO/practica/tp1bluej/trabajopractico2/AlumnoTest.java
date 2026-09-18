/**
 * Clase ejecutable para probar el funcionamiento de la clase Alumno.
 * Recibe los datos del estudiante por argumentos de la línea de comandos (args),
 * instancia el objeto y muestra sus resultados por pantalla.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class AlumnoTest {

    /**
     * Punto de entrada principal a la aplicación.
     * 
     * @param args Arreglo de cadenas con los parámetros de entrada requeridos:
     *             {LU, Nombre, Apellido, Nota1, Nota2}.
     */
    public static void main(String[] args) {
        if (args.length >= 5) {
            int LU = Integer.parseInt(args[0]);
            String nombre = args[1];
            String apellido = args[2];
            double nota1 = Double.parseDouble(args[3]);
            double nota2 = Double.parseDouble(args[4]);

            // Instanciamos el objeto con los datos recibidos
            Alumno unAlumno = new Alumno(LU, nombre, apellido);
            unAlumno.setNota1(nota1);
            unAlumno.setNota2(nota2);

            // Mostramos los datos formateados del alumno
            unAlumno.mostrar();

        } else {
            System.out.println("Error: Debe ingresar 5 argumentos en el siguiente orden:");
            System.out.println("{LU, Nombre, Apellido, Nota1, Nota2}");
            System.out.println("Ejemplo en BlueJ: {\"2020\", \"Juan\", \"Perez\", \"5.99\", \"10.0\"}");
        }
    }
}