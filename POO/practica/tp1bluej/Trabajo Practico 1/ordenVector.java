import java.util.Scanner;
public class ordenVector{
    
    public static void main(String []args){
        Scanner teclado= new Scanner(System.in);
        double[] vector= new double[4];
        
        int j,i=0;
        

        // carga del vector
        for (i=0;i<4;i++){
            System.out.println("ingrese el valor");
            vector[i]= teclado.nextDouble();
        }
        double menor =vector[0];
        for (i=0;i<4;i++){
           if(vector[i]< menor){
               menor= vector[i];
           }
           }
           //. ALGORITMO DE ORDENAMIENTO POR BURBUJA:
        double aux; // Variable auxiliar para realizar el intercambio (swap)

        // Bucle externo: controla cuántas pasadas completas se hacen al vector
        for (i = 0; i < vector.length - 1; i++) {
            
            // Bucle interno: compara cada pareja de elementos contiguos (j y j+1)
            for (j = 0; j < vector.length - 1; j++) {
                
                // Si el elemento de la izquierda es MAYOR que el de la derecha...
                if (vector[j] > vector[j + 1]) {
                    // hacemos el intercambio mediante 'aux':
                    aux = vector[j];           //  Respaldamos el valor de la izquierda
                    vector[j] = vector[j + 1];  // Pasamos el de la derecha a la izquierda
                    vector[j + 1] = aux;       // Colocamos aux en la derecha
                }
            }
        }

        
        System.out.println("\nEl menor valor ingresado es: " + menor);

        System.out.println("Vector ordenado de menor a mayor:");
        for (i = 0; i < 4; i++) {
            
            System.out.print(vector[i] + "\t");
        }
 

        teclado.close();
    }
}
