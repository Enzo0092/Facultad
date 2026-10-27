import java.util.ArrayList;

/**
 * Clase ejecutable que crea los alojamientos de prueba, vincula sus servicios,
 * los registra en una gerencia regional y emite el informe consolidado.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class AdministracionGerencia {
    public static void main(String[] args) {
        // 1. Instanciamos la Gerencia
        Gerencia gerencia = new Gerencia("Los Arroyos");

        // 2. Creamos los servicios para la Cabaña
        Servicio alquilerAuto = new Servicio("alquiler auto", 100.0);
        Servicio lavanderiaCabana = new Servicio("lavanderia", 20.0);

        // 3. Creamos la Cabaña (5 días, $120 base diario, 3 habitaciones)
        Cabaña cabana = new Cabaña("Cabañas La Alondra", 120.0, 5, 3);
        cabana.agregarServicio(alquilerAuto);
        cabana.agregarServicio(lavanderiaCabana);

        // 4. Creamos los servicios para el Hotel
        Servicio internet = new Servicio("internet", 5.0);
        Servicio lavanderiaHotel = new Servicio("lavanderia", 30.0);

        // 5. Creamos el Hotel (7 días, $80 base diario, habitación Single)
        Hotel hotel = new Hotel("Hotel Guaraní", 80.0, 7, "Single");
        hotel.agregarServicio(internet);
        hotel.agregarServicio(lavanderiaHotel);

        // 6. Agregamos los alojamientos a la Gerencia
        gerencia.agregarAlojamiento(cabana);
        gerencia.agregarAlojamiento(hotel);

        // 7. Emitimos el reporte completo de liquidación
        gerencia.mostrarLiquidacion();
    }
}