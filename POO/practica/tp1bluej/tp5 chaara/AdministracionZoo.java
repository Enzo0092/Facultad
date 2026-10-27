import java.util.Calendar;
import java.util.HashSet;

/**
 * Clase ejecutable para testear el sistema del Zoológico (Ejercicio 10).
 * Simula el ingreso de delegaciones e individuos, realiza los listados filtrados
 * por fecha y tipo, y calcula la recaudación total en un período.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class AdministracionZoo {
    public static void main(String[] args) {
        // 1. Instanciamos el Zoológico
        Zoologico zoo = new Zoologico("El Bagual");

        // Fechas de prueba (Año, Mes [0-11], Día)
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2026, Calendar.SEPTEMBER, 15);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2026, Calendar.SEPTEMBER, 23);

        Calendar fechaNac1 = Calendar.getInstance();
        fechaNac1.set(1970, Calendar.MARCH, 10);

        Calendar fechaNac2 = Calendar.getInstance();
        fechaNac2.set(1979, Calendar.JULY, 25);

        Calendar fechaNac3 = Calendar.getInstance();
        fechaNac3.set(2000, Calendar.JANUARY, 5);

        // 2. Instanciamos personas físicas
        Persona persona1 = new Persona(23568963, "Lusteau", "María", fechaNac1);
        Persona persona2 = new Persona(24875785, "Lopez", "Carlos", fechaNac2);
        Persona persona3 = new Persona(42111222, "Perez", "Juan", fechaNac3);

        // 3. Inciso a: Delegación PAMI el 15/09/2026 con 2 integrantes
        Delegacion delegacionPami = new Delegacion("PAMI", fecha1);
        Individuo integrante1 = new Individuo("María Lusteau", fecha1, persona1);
        Individuo integrante2 = new Individuo("Carlos Lopez", fecha1, persona2);

        delegacionPami.inscribirIndividuo(integrante1);
        delegacionPami.inscribirIndividuo(integrante2);
        // Prueba de no duplicidad
        delegacionPami.inscribirIndividuo(integrante1);

        // 4. Inciso b: Individuo el 23/09/2026
        Individuo individuoSolo = new Individuo("Juan Perez", fecha2, persona3);

        // 5. Registramos los visitantes en el zoológico
        zoo.nuevoVisitante(delegacionPami);
        zoo.nuevoVisitante(individuoSolo);

        // 6. Reportes
        System.out.println("=======================================================");
        System.out.println("LISTAR VISITANTES POR FECHA (15/09/2026)");
        System.out.println("=======================================================");
        zoo.listarVisitantePorFecha(fecha1);

        System.out.println("\n=======================================================");
        System.out.println("LISTAR DELEGACIONES POR FECHA (15/09/2026)");
        System.out.println("=======================================================");
        zoo.listarTipoVisitantePorFecha(fecha1, "Delegación");

        System.out.println("\n=======================================================");
        System.out.println("LISTAR INDIVIDUOS POR FECHA (23/09/2026)");
        System.out.println("=======================================================");
        zoo.listarTipoVisitantePorFecha(fecha2, "Individuo");

        // 7. Cálculo de recaudación
        Calendar fechaDesde = Calendar.getInstance();
        fechaDesde.set(2026, Calendar.SEPTEMBER, 1);

        Calendar fechaHasta = Calendar.getInstance();
        fechaHasta.set(2026, Calendar.SEPTEMBER, 30);

        double totalRecaudado = zoo.recaudacion(fechaDesde, fechaHasta);
        System.out.println("\nRecaudación del mes de Septiembre: $" + totalRecaudado);

        // 8. Conjunto de personas únicas que visitaron el zoológico
        System.out.println("\nPersonas totales que visitaron el Zoo (sin duplicados):");
        HashSet<Persona> personasVisitantes = zoo.listarPersonasQueVisitaronElZoo();
        for (Persona p : personasVisitantes) {
            System.out.println("- " + p.nomYApe() + " (DNI: " + p.getDNI() + ")");
        }
    }
}