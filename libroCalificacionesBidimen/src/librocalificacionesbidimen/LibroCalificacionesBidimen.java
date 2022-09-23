
package librocalificacionesbidimen;
// Clase LibroCalificaciones que utiliza un arreglo bidimensional para almacenar calificaciones.

public class LibroCalificacionesBidimen {
private String nombreDelCurso; 
private int [][] calificaciones;//arreglo bidimencional de las calificaciones de los estudiantes  
    //Constructor con dos argumentos inicializa el nombre del curso y las calificaciones
public LibroCalificacionesBidimen(String nombreDelCurso, int[][]calificaciones){
    
    this.nombreDelCurso = nombreDelCurso;
    this.calificaciones = calificaciones;
}
//metodo para establecer el nombre 
    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

//metodo para retornar el nombre 
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    //Realizar operaciones sobre las calificaciones 
    public void procesarCalificaciones(){
        //imprimimos el arreglo de las calificaciones 
        imprimirCalificaciones();
        
        // llama a los métodos obtenerMinima y obtenerMaxima
        System.out.printf("%n%s %d%n%s %d%n%n",
                "La calificacion mas baja en el Libro de Calificaciones es:", 
                obtenerMinima(),
                "La calificacion mas alta en el libro calificaciones es:",
                obtenerMaxima());
        //Imprime grafico de distribuciones de todas las calificaciones para todas las pruebas 
        imprimirGrafiBarras();
        
    }//fin del metodo procesarCalificaciones 
    
    //buscar la calificacion mas baja 
    public int obtenerMinima(){
        //Asume que el primer elemento arreglo calificaciones es el mas bajo
        int califBaja = calificaciones [0][0];
        //itera a travez de la fila del arreglo de calificaciones 
        
        for (int [] califEstudiante : calificaciones) {
            //itera a travez de las columnas del arreglo de calificaciones 
            for (int calificacion : califEstudiante) {
            // si la calificación es menor que califBaja, la asigna a califBaja
              if(calificacion < califBaja)
                  califBaja = calificacion;
                
            }
        }
        return califBaja;
    }
    //buscar la calificacion mas alta 
    public int obtenerMaxima(){
        //Asume que el primer elemento arreglo calificaciones es el mas alto
        int califAlta = calificaciones[0][0];
        // itera a través de las filas del arreglo calificaciones
        for(int []califEstudiante : calificaciones){
            // itera a través de las columnas del arreglo calificaciones
            for(int calificacion : califEstudiante){
                if(calificacion > califAlta)
                    califAlta = calificacion;
            }
        }
        return califAlta;
    }
    // determina la calificación promedio para un conjunto específico de calificaciones
    public double obtenerPromedio(int [] conjuntoDeCalif){
        int total = 0;
        // suma las calificaciones para un estudiante
        for(int calificacion : conjuntoDeCalif)
            total += calificacion;
        // devuelve el promedio de calificaciones
        
        return (double) total/conjuntoDeCalif.length;
        
    }
    // imprime gráfico de barras que muestra la distribución de calificaciones en general
    public void imprimirGrafiBarras(){
        System.out.println("Distribucion de calificaciones en general:");
        // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
              int[]frecuencia = new int[11];
        // para cada calificación en LibroCalificaciones, incrementa la frecuencia apropiada
              for(int[] califEstudiantes : calificaciones ){
                  for(int calificacion : califEstudiantes)
                      ++frecuencia[calificacion/10];
              }
         // para cada frecuencia de calificaciones, imprime una barra en el gráfico
         for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiquetas de las barras (“00-09: ”, ..., “90-99: ”, “100: ”)
            if(cuenta == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", cuenta*10, cuenta*10+9);
            }
             // imprime barra de asteriscos
             for (int estrella = 0; estrella < frecuencia[cuenta]; estrella++) {
                 System.out.print("*");
                
             }
             System.out.println();
        }
   
    }
     // imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones(){
             System.out.println("Las calificaciones son:");
             System.out.print("             ");// alinea encabezados de columnas
       // crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("     Prueba %d ", prueba + 1);
        }
            System.out.println("     Promedio");// encabezado de columna de promedio de estudiantes
            
// crea filas/columnas de texto que representan el arreglo calificaciones
            for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
                System.out.printf("Estudiante %2d", estudiante + 1);
            
                for (int prueba : calificaciones[estudiante]) 
                    System.out.printf(" %12d", prueba);
                
                // llama al método obtenerPromedio para calcular la calificación promedio del estudiante;
                // pasa fila de calificaciones como argumento para obtenerPromedio
                double promedio = obtenerPromedio(calificaciones[estudiante]);
                System.out.printf("     %9.2f%n", promedio);
                }
           
    }
}

