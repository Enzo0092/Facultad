/**
 * Clase ejecutable para simular consultas de clientes en el comercio de electrodomésticos.
 * 
 * @author Enzo Romero
 * @version 1.0
 */
public class Comercio {
    public static void main(String[] args) {
        // 1. Instanciamos los artefactos que ofrece el comercio
        Cocina unaCocina = new Cocina("Volcan", 600.0f, 15, 4, 2000, "80*60*60cm");
        Heladera unaHeladera = new Heladera("Gafa", 1200.0f, 8, 11, 2, true);
        Lavarropas unLavarropas = new Lavarropas("Drean", 800.0f, 5, 12, 6.5f, false);

        // Parámetros de consulta
        int cuotas = 6;
        float interes = 2.53f;

        // 2. Consulta por la Cocina
        unaCocina.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + Math.round(unaCocina.cuotaCredito(cuotas, interes) * 100.0f) / 100.0f);
        System.out.println("Valor Cuota Con Adicionales: " + Math.round(unaCocina.creditoConAdicional(cuotas, interes) * 100.0f) / 100.0f);
        System.out.println(); // Salto de línea

        // 3. Consulta por la Heladera (con compresor -> suma $50 por cuota)
        unaHeladera.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + Math.round(unaHeladera.cuotaCredito(cuotas, interes) * 100.0f) / 100.0f);
        System.out.println("Valor Cuota Con Adicionales: " + Math.round(unaHeladera.creditoConAdicional(cuotas, interes) * 100.0f) / 100.0f);
        System.out.println();

        // 4. Consulta por el Lavarropas (no automático -> 2% descuento por cuota)
        unLavarropas.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + Math.round(unLavarropas.cuotaCredito(cuotas, interes) * 100.0f) / 100.0f);
        System.out.println("Valor Cuota Con Adicionales: " + Math.round(unLavarropas.creditoConAdicional(cuotas, interes) * 100.0f) / 100.0f);
    }
}