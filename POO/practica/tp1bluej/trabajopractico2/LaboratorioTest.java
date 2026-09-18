
 /**
          *clase ejecutable para la clase laboratorio
          *crea on objeto de tipo laboratorio llamado laboratorio1  y en el la instanciacion 
          *se le pasan los parametros de forma estatica
          *
          *
*/
public class LaboratorioTest{
    public static void main( String[]args){
        Laboratorio laboratorio1= new Laboratorio("Colgate S.A" ,"Junin 5204","54-11-4239-8447");
        System.out.println(laboratorio1.mostrar());
        // Le asignamos los valores usando los métodos requeridos
        laboratorio1.nuevaCompraMinima(100);
        laboratorio1.nuevoDiaEntrega(5);
        
        // Imprimimos la información
        System.out.println(laboratorio1.mostrar());
        
        // Verificamos que se hayan actualizado
        System.out.println("Compra mínima: " + laboratorio1.getCompraMinima());
        System.out.println("Día de entrega: " + laboratorio1.getDiaEntrega());
    }
    }
