
package formejorado;
//Uso de la instruccion for mejorado para sumar el total de enteros en un arreglo
public class ForMejorado {

    public static void main(String[] args) {
        int arreglo[] = {87, 34, 25, 98, 41, 60, 71, 77, 100, 56};
        int total = 0;
                
          //Suma cada uno de los elementos al total
          
          for (int numero: arreglo) 
              total+=numero;
          
          System.out.printf( "Total de elementos del arreglo: %d\n", total );
    }//Fin del main
    
}//fin de la clase for mejorado
