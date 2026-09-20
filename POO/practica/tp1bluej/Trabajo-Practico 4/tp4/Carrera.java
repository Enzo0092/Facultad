/**
 * Clase ejecutable para probar la gestión de un Curso y sus Alumnos usando HashMap.
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Carrera {

    public static void main(String[] args) {
        // 5.1.1. Crear una instancia de Curso y varias de la clase Alumno
        Curso curso = new Curso("Programación Orientada a Objetos");

        Alumno a1 = new Alumno(32555, "Pedro", "Gomez");
        Alumno a2 = new Alumno(23564, "Maria", "Vasquez");
        Alumno a3 = new Alumno(30123, "Juan", "Perez");
        Alumno a4 = new Alumno(32655, "Marcela", "Martinez");

        // 5.1.2. Asignarles notas de parciales
        a1.setNota1(6.0); a1.setNota2(7.0);
        a2.setNota1(5.0); a2.setNota2(6.0);
        a3.setNota1(7.0); a3.setNota2(9.0);
        a4.setNota1(8.0); a4.setNota2(8.0);

        // 5.1.3. Inscribir los alumnos al curso
        curso.inscribirAlumno(a1);
        curso.inscribirAlumno(a2);
        curso.inscribirAlumno(a3);
        curso.inscribirAlumno(a4);

        // 5.1.4. Imprimir la cantidad y la lista de alumnos inscriptos
        System.out.println("****-- Cantidad de inscriptos: " + curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();

        // 5.1.5. Dar de baja un alumno (Pedro) y verificar que no esté
        System.out.println("\n****-- Se da de baja a Pedro porque abandona el curso --****");
        curso.quitarAlumno(32555);
        System.out.println("Está Pedro Gomez inscripto ?? --> " + curso.estaInscripto(32555));

        // 5.1.6. Imprimir nuevamente la lista de alumnos
        System.out.println("\n****-- Alumnos inscriptos actualmente: " + curso.cantidadDeAlumnos());
        curso.mostrarInscriptos();

        // 5.1.7. Buscar un alumno por su libreta (30123) y mostrarlo
        System.out.println("\n****-- Busca y muestra el alumno con numero de libreta 30123 --****");
        Alumno buscado = curso.buscarAlumno(30123);
        if (buscado != null) {
            buscado.mostrar();
        }

        // 5.1.8. Mostrar el promedio del alumno solicitado por libreta (23564)
        System.out.println("\n****-- Mostrar promedio del alumno 23564 --****");
        curso.imprimirPromedioDelAlumno(23564);
    }
}