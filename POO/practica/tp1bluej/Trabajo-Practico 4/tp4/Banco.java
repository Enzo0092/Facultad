import java.util.ArrayList;
import java.util.HashSet;

/**
 * Clase Banco actualizada con gestión de Empleados, Cuentas Bancarias y Titulares (HashSet).
 * 
 * @author Enzo Romero
 * @version 2.0 - 2026
 */
public class Banco {

    // Atributos
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList empleados;
    private ArrayList cuentasBancarias;

    // --- CONSTRUCTORES ---

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList());
        this.setCuentasBancarias(new ArrayList());
        this.agregarEmpleado(p_empleado);
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList());
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }

    // --- SETTERS Y GETTERS ---

    private void setNombre(String p_nombre) { this.nombre = p_nombre; }
    private void setNroSucursal(int p_nroSucursal) { this.nroSucursal = p_nroSucursal; }
    private void setLocalidad(Localidad p_localidad) { this.localidad = p_localidad; }
    private void setEmpleados(ArrayList p_empleados) { this.empleados = p_empleados; }
    private void setCuentasBancarias(ArrayList p_cuentas) { this.cuentasBancarias = p_cuentas; }

    public String getNombre() { return this.nombre; }
    public int getNroSucursal() { return this.nroSucursal; }
    public Localidad getLocalidad() { return this.localidad; }
    public ArrayList getEmpleados() { return this.empleados; }
    public ArrayList getCuentasBancarias() { return this.cuentasBancarias; }

    // --- GESTIÓN DE EMPLEADOS ---

    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        if (this.getEmpleados().size() > 1) { // Mantiene regla de al menos 1 empleado
            return this.getEmpleados().remove(p_empleado);
        }
        return false;
    }

    public double sueldosAPagar() {
        double total = 0.0;
        for (Object obj : this.getEmpleados()) {
            Empleado e = (Empleado) obj;
            total += e.sueldoNeto();
        }
        return total;
    }

    public void listarSueldos() {
        for (Object obj : this.getEmpleados()) {
            Empleado e = (Empleado) obj;
            System.out.println(e.getCuil() + "  " + e.apeYnom() + " ---------------------------------------$" + e.sueldoNeto());
        }
        System.out.println("\nTotal a Pagar--------------------------------------------------------$" + this.sueldosAPagar());
    }

    // --- GESTIÓN DE CUENTAS BANCARIAS ---

    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().add(p_cuenta);
    }

    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().remove(p_cuenta);
    }

    /**
     * Cuenta cuántas cuentas tienen saldo mayor a 0.
     */
    private int cuentasSaldoActivo() {
        int activas = 0;
        for (Object obj : this.getCuentasBancarias()) {
            CuentaBancaria cb = (CuentaBancaria) obj;
            if (cb.getSaldo() > 0) {
                activas++;
            }
        }
        return activas;
    }

    /**
     * Muestra por pantalla las cuentas cuyo saldo es 0.
     */
    public void listarCuentasConSaldoCero() {
        for (Object obj : this.getCuentasBancarias()) {
            CuentaBancaria cb = (CuentaBancaria) obj;
            if (cb.getSaldo() == 0) {
                System.out.println(cb.getNroCuenta() + "               " + cb.getTitular().apeYNom());
            }
        }
    }

    /**
     * Devuelve un HashSet con todos los titulares únicos de las cuentas bancarias.
     */
    public HashSet<Persona> listaDeTitulares() {
        HashSet<Persona> titulares = new HashSet<Persona>();
        for (Object obj : this.getCuentasBancarias()) {
            CuentaBancaria cb = (CuentaBancaria) obj;
            titulares.add(cb.getTitular()); // HashSet descarta automáticamente los duplicados
        }
        return titulares;
    }

    // --- SALIDAS Y REPORTES ---

    public void mostrar() {
        System.out.println("Banco: " + this.getNombre() + " - Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "     Provincia: " + this.getLocalidad().getProvincia());
        System.out.println();
        this.listarSueldos();
    }

    /**
     * Imprime el reporte formateado exigido en el enunciado del Ejercicio 4.
     */
    public void mostrarResumen() {
        int totalCuentas = this.getCuentasBancarias().size();
        int activas = this.cuentasSaldoActivo();
        int saldoCero = totalCuentas - activas;

        System.out.println("Banco: " + this.getNombre() + " - Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "   Provincia: " + this.getLocalidad().getProvincia());
        System.out.println("******************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("******************************************************************");
        System.out.println("Número total de Cuentas Bancarias: " + totalCuentas);
        System.out.println("Cuentas Activas: " + activas);
        System.out.println("Cuentas Saldo Cero: " + saldoCero);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cuentas sin saldo:");
        System.out.println("--- Cuenta ---------------- Apellido y Nombre ----------------");
        
        this.listarCuentasConSaldoCero();

        System.out.println("------------------------------------------------------------------");
        System.out.print("Listado de Clientes: ");
        
        // Recorremos el HashSet para imprimir los nombres de los titulares únicos
        int i = 0;
        int tamano = this.listaDeTitulares().size();
        for (Persona p : this.listaDeTitulares()) {
            System.out.print(p.apeYNom());
            if (i < tamano - 1) {
                System.out.print("; ");
            }
            i++;
        }
        System.out.println("\n------------------------------------------------------------------");
    }
}