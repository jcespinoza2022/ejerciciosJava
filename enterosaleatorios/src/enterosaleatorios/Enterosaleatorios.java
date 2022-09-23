/*
 * Tirar los dados seis lados 20 veces 
 */
package enterosaleatorios;

//Enteros aleatorios desplazados y escalados.
import java.security.SecureRandom;// el programa usa la clase de Segureramdom

public class Enterosaleatorios {

   
    public static void main(String[] args) {
        
        //El objeto numerosAleatorios producira numero aleatorios seguros 
        SecureRandom numerosAleatorios = new SecureRandom();
        
        //itera 20 veces
        for(int i=1;i<=20;i++){
            
            //eligira entero aleatorio del 1 al 6
            int cara = 1 + numerosAleatorios.nextInt(6);
            
            System.out.printf("%d  ", cara); //muestra el valor generado 
            
            //Si i es igual a 5 empieza otra linea 
            
            if (i%5 == 0)
            System.out.println();
        }
    }
    
}//fin de la clase EnterosAleatorios 
