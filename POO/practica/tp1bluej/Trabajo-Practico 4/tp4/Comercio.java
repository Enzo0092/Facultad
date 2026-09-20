import java.util.HashMap;

/**
 * Gestiona los empleados del comercio utilizando un HashMap (CUIL -> Empleado).
 * 
 * @author Enzo Romero
 * @version 1.0 - 2026
 */
public class Comercio {

    private String nombre;
    private HashMap empleados; // <Long (CUIL), Empleado>

    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap());
    }

    public Comercio(String p_nombre, HashMap p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    // Mutadores y Observadores
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setEmpleados(HashMap p_empleados) {
        this.empleados = p_empleados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public HashMap getEmpleados() {
        return this.empleados;
    }

    // MÉTODOS DE GESTIÓN (HASHMAP)

    /**
     * Da de alta un empleado registrándolo en el mapa con su CUIL como clave.
     * Nota: En el diagrama figura como "altaEmpleadoo".
     */
    public void altaEmpleadoo(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    /**
     * Da de baja a un empleado mediante su CUIL.
     * 
     * @param p_cuil Número de CUIL del empleado a eliminar.
     * @return El objeto Empleado removido o null si no existía.
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return (Empleado) this.getEmpleados().remove(p_cuil);
    }

    /**
     * Devuelve la cantidad de empleados contratados.
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    /**
     * Consulta si un empleado es parte de la empresa buscando por su CUIL.
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    /**
     * Busca y devuelve un empleado determinado según su CUIL.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return (Empleado) this.getEmpleados().get(p_cuil);
    }

    /**
     * Visualiza por pantalla el sueldo neto del empleado cuyo CUIL coincide con el parámetro.
     */
    public void sueldoNeto(long p_cuil) {
        Empleado emp = this.buscarEmpleado(p_cuil);
        if (emp != null) {
            System.out.println("Sueldo Neto de " + emp.mostrarLinea() + ": $" + emp.sueldoNeto());
        } else {
            System.out.println("No se encontró ningún empleado registrado con el CUIL: " + p_cuil);
        }
    }

    /**
     * Emite la nómina de empleados con el formato requerido para la AFIP.
     */
   public void nomina() {
    System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
    for (Object obj : this.getEmpleados().values()) {
        Empleado emp = (Empleado) obj;
        System.out.println(emp.getCuil() + " " + emp.apeYnom() + "----------- $" + emp.sueldoNeto());
    }
}
}