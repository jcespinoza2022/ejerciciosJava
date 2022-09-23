// Inicializacion de los elementos de un arreglo
package arreglosinicializacion;


public class ArreglosInicializacion {

    
    public static void main(String[] args) {
        
       int [] arreglo = {30, 40, 32, 43, 25, 13, 19, 89, 21, 10};
       
       System.out.printf("%s%8s%n", "Indice", "Valor"); //Encabezado de columnas 
       
       for(int i = 0; i< arreglo.length; i++){
           
           System.out.printf("%5d%8d%n", i, arreglo[i]);
       }
       
    }
    
}// Fin del Arreglo
