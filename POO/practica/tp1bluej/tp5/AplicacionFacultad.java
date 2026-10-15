import java.util.Calendar;

public class AplicacionFacultad {
    public static void main(String[] args) {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        // --- Cargos de Juan Perez ---
        Cargo cargo1Juan = new Cargo("JTP-Programación OO", 800.00, anioActual , 10);
        SemiExclusivo cargo2Juan = new SemiExclusivo("Titular-TFA", 1400.00, anioActual - 12, 20, 0);
        Cargo cargo3Juan = new Cargo("JTP-Analisis de Sistemas", 800.00, anioActual - 20, 10);

        // --- Cargos de Mirta Lopez ---
        Cargo cargo1Mirta = new Cargo("JTP-TP-II", 1200.00, anioActual, 10);
        Exclusivo cargo2Mirta = new Exclusivo("JTP-Ing.Soft", 1800.00, anioActual - 10, 10, 20, 10);

        // --- Profesores ---
        Profesor profeJuan = new Profesor(28596132, "Juan", "Perez", 1983, "Lic. en Sistemas de Información", cargo1Juan);
        profeJuan.agregarCargo(cargo2Juan);
        profeJuan.agregarCargo(cargo3Juan);

        Profesor profeMirta = new Profesor(34519921, "Mirta", "Lopez", 1990, "Lic. en Sistemas de Información", cargo1Mirta);
        profeMirta.agregarCargo(cargo2Mirta);

        // --- Facultad ---
        Facultad facena = new Facultad("FaCENA", profeJuan);
        facena.agregarProfesor(profeMirta);

        // --- Emisión de salidas ---
        facena.listarProfesorCargos();
        System.out.println("\n");
        facena.nominaProfesores();
    }
}