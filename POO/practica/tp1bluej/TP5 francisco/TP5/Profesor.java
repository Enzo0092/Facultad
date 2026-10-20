import java.util.ArrayList;

/**
 * Representa a un profesor con su título y los cargos asignados.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Profesor extends Persona
{
    //Atributos
    /**
     * Título del profesor.
     */
    private String titulo;

    /**
     * Lista de cargos asignados al profesor.
     */
    private ArrayList<Cargo> cargos;

    //Constructor
    /**
     * Construye un profesor con sus datos personales, título y cargos.
     *
     * @param p_titulo título del profesor
     * @param p_cargos lista de cargos asignados
     * @param p_dni DNI del profesor
     * @param p_nombre nombre del profesor
     * @param p_apellido apellido del profesor
     * @param p_anio año de nacimiento del profesor
     */
    public Profesor(String p_titulo, ArrayList<Cargo> p_cargos, int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }

    //Metodos
    /**
     * Establece el título del profesor.
     *
     * @param p_titulo título del profesor
     */
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }

    /**
     * Establece la lista de cargos del profesor.
     *
     * @param p_cargos lista de cargos asignados
     */
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }

    /**
     * Obtiene el título del profesor.
     *
     * @return título del profesor
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Obtiene la lista de cargos del profesor.
     *
     * @return lista de cargos asignados
     */
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }

    /**
     * Muestra los datos personales, el título, los cargos y el sueldo total del profesor.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.getNombre() + " " + this.getApellido());
        System.out.println("DNI: " + this.getDNI() + " Edad: " + this.edad() + " años");
        System.out.println("Titulo: " + this.getTitulo());

        this.listarCargos();

        System.out.println("Sueldo Total: " + this.sueldoTotal());
    }

    /**
     * Muestra los cargos asignados al profesor.
     */
    public void listarCargos(){
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        for(Cargo cargo : this.getCargos()){
            cargo.mostrarCargo();
        }
    }

    /**
     * Calcula el sueldo total del profesor sumando los sueldos de sus cargos.
     *
     * @return sueldo total del profesor
     */
    public double sueldoTotal(){
        double total = 0;

        for(Cargo cargo : this.getCargos()){
            total = total + cargo.sueldoDelCargo();
        }

        return total;
    }

    /**
     * Devuelve una línea con el DNI, el nombre y el sueldo total del profesor.
     *
     * @return texto con los datos resumidos del profesor
     */
    public String mostrarLinea(){
        return "DNI: " + this.getDNI() + " - Nombre: " + this.getNombre() + " - Sueldo Total: " + this.sueldoTotal();
    }
}
