/*
 * Este es un ejercicio del libro de Java 
 * Deteil & Deteil llamado CalificacionesLetras.java
 * Utiliza la clase switch para contar las calificaciones
 * De letra 
 */
package calificaciones;

/**
 *
 * @jaime Espinoza
 */
import java.util.Scanner;
public class LibroCalificaciones {
     
    public static void main (String arg[]){
        int total = 0; //Suma de calificaciones 
        int contadorCalificaciones = 0;//Numero de Calificaciones Introduccidas 
        int aCuenta = 0; // Cuenta de calificaciones A
        int bCuenta = 0; // Cuenta de calificaciones B
        int cCuenta = 0; // Cuenta de Calificaciones C
        int dCuenta = 0; // Cuenta de Calificaciones D
        int fCuenta = 0; // Cuenta de Calificaciones F
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n   %s%n"
                + "", 
                "Introduzca las calificaciones en el gango de 0 - 100",
                "Escriba el indicador fin del archivo para terminar la entrada:",
                "En Windows escriva <Ctrl> z y oprima intro");
        
        //Itera hasta que el usuario introduzca el indicador el fin del archivo
        
        while (entrada.hasNext()){
         
             int calificacion = entrada.nextInt(); // Lee la Califacion
             total += calificacion;
             ++contadorCalificaciones;
             
             //Incrementa el contador de la letra indicada 
             
             switch(calificacion/10){
                 case 9: //calificacion entre 90
                 case 10://calificacion  100
                     ++aCuenta;
                     break;
                 case 8: //calificacion entre 80
                     ++bCuenta;
                     break;
                 case 7: //calificacion entre 70
                     ++cCuenta;
                     break;
                 case 6: //calificacion entre 60
                     ++dCuenta;
                     break;
                     
                 default: //calificaciones menor de 60
                     ++fCuenta;
                     break;
           
             }//fin del swicth
                     
        }//fin del while 
        
       //Muestra reporte de calificaciones 
        
       System.out.printf("%nReporte de calificaciones:%n");
       
       //El usuario introduce al menos una calificacion...
       
       if(contadorCalificaciones!=0){
           //calculo del promedio de todas las  calificaciones ingresadas 
           
           double promedio = (double)total/ contadorCalificaciones;
           //Muestran resumen de resultados de pantalla 
           
           System.out.printf("El total de las %d calificaciones introducida es %d%n: ",contadorCalificaciones,total);
           
           System.out.printf("El promedio de la clase es %.2f%n", promedio);
           
           System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                             "El numero de estudiante que recibieron calificacion",
                             "A: ", aCuenta,  //muestra em numero de calificaciones A
                             "B: ", bCuenta,  //muestra em numero de calificaciones B
                             "C; ", cCuenta,  //muestra em numero de calificaciones C
                             "D; ", dCuenta,  //muestra em numero de calificaciones D
                             "F; ", fCuenta);//muestra em numero de calificaciones F
           
           
       }// Fin del if
       else{
           //No introdujeron calificaciones, por lo que se muestra el mensaje apropiado
           System.out.printf("No se introdujo calificaciones");
       }//fin del else
           
    }//fin del main
            
}//fin de la clase calificaciones 
