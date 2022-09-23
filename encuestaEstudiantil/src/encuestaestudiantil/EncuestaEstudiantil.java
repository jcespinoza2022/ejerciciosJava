
package encuestaestudiantil;

public class EncuestaEstudiantil {

   //Programa analisis de una encuesta 
    public static void main(String[] args) {
      //Arreglo de respuesta de estudiantes 
      
      int[] respuestas = {1, 2, 5, 4, 13, 5, 2, 1, 3, 1, 1, 4, 3, 3, 
                           2, 3, 3, 4, 4};
      
      int[] frecuencia = new int[6];// Arreglo de contadores de frecuencia
      
      //Para cada respuesta selecciona el elemento 
      
      //Elemento de frecuencia ingrementa 
      
      for(int i = 0; i<respuestas.length; i++)
      {
         try{
             ++frecuencia[respuestas[i]];
             
         }
             catch(ArrayIndexOutOfBoundsException e)
               
         {
                  System.out.println(e);
                  System.out.printf("     respuestas[%d]= %d%n%n", i, respuestas[i]);
                 
         }
                  
      }  
      System.out.printf("%s%11s%n", "Calificacion ", "Frecuencia");
      //Imprime el valor de cada elemento
      
      for(int i= 1; i < frecuencia.length; i++ )
          System.out.printf("%12d%12d%n", i, frecuencia[i]);
    }
    
}
