
package com.mycompany.inicarreglo;

public class InicArreglo {
    public static void main(String[] args){
        // comprueba el número de argumentos de línea de comandos
        if(args.length != 3){
            System.out.println(
                    "Error: Vuelve a escribir el comando complejo, incluyendo.\n"+
                    "El tamano del arreglo, el valor inicial y el incremento.\n");
        }else
        {
            //  obtiene el tamaño del arreglo del primer argumento de línea de comandos
            int longitudArreglo = Integer.parseInt(args[0]);
           
          int[] arreglo = new int[longitudArreglo];
            //  obtiene el valor inicial y el incremento de los argumentos de línea de comandos
            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);
       
        // calcula el valor para cada elemento del arreglo
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = valorInicial + incremento*i;
            }
            System.out.printf("%s%8s%n", "Indice", "Valor");
            
            // muestra el índice y el valor del arreglo
                for (int i = 0; i < arreglo.length; i++) {
                System.out.printf("%5d%8d%n", i, arreglo[i]);
            }
        }
    }
    
}//fin de la clase InicArreglo
