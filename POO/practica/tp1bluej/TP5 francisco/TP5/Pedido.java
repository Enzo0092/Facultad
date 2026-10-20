import java.util.ArrayList;

/**
 * Representa un pedido compuesto por varios renglones.
 *
 * @author Francisco, Morales
 * @version 1.0 - 2026
 */
public class Pedido
{
    //Atributo
    /** Lista de renglones que componen el pedido. */
    private ArrayList<Renglon> renglones;

    //Constructor
    /**
     * Construye un pedido con la lista de renglones indicada.
     *
     * @param p_renglones lista de renglones del pedido
     */
    public Pedido(ArrayList<Renglon> p_renglones)
    {
        this.setRenglones(p_renglones);
    }

    //Metodos
    /**
     * Establece la lista de renglones del pedido.
     *
     * @param p_renglones lista de renglones del pedido
     */
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }

    /**
     * Devuelve la lista de renglones del pedido.
     *
     * @return lista de renglones
     */
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }

    /**
     * Muestra el pedido, la cantidad de renglones y sus elementos.
     */
    public void mostrar(){
        System.out.println("Pedido: ");
        System.out.println("Cantidad de items: " + renglones.size());
        for(Renglon renglones : this.renglones){
            renglones.mostrar();
        }
    }
}