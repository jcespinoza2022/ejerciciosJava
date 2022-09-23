
package graficobarras;

public class GraficoBarras {

    //Programas para imprimir Grafico de barras
    public static void main(String[] args) {
       
        int[] arreglo = {0, 4, 5, 2, 1, 3, 6, 0, 7, 3};
        
        
        System.out.println("Distribucion de Frecuencias ");
        
        //Pra cada elemento del arreglo, imprime una barra del grafico
        
        for(int i = 0; i< arreglo.length; i++){
         
            //Imprime etiqueta de la barra (00 - 99, ... ,100)
            if (i== 100)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%02d-%02d", i*10, i*10+9);
            
            //Imprime la barra de asterisco
            for(int estrella =0; estrella < arreglo[i]; estrella++)
                System.out.printf("*");
                
                System.out.println();
            }
        }
    
}
