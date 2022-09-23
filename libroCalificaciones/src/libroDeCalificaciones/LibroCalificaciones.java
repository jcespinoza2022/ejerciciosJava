package libroDeCalificaciones;
//Libro de calificaciones que utiliza para almacenar las calificaciones de una prueba

public class LibroCalificaciones {

    private String nombreDelCurso; //nombre del curso que representa este LibroCalificaciones 
    private int calificaciones[];//arreglo de calificaciones de estudiantes

//El constructor de dos argumentos inicializa nombreDelCurso calificaciones 
    public LibroCalificaciones(String nombreDelCurso, int calificaciones[]) {

        this.nombreDelCurso = nombreDelCurso;//Inicializa el nombre del curso
        this.calificaciones = calificaciones;//almacena las calificaciones 
    }//Fin del constructor

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;//almacena el nombre del curso
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;//retorna el nombre del curso
    }
    //Metodo para establecer el nombre del Curso

    //Muestra el saludo de bienbenida al ususario del LibroCalificaciones 
    public void mostrarMensaje() {
        //obtener el nombre del curso
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n\n",
                getNombreDelCurso());
    }

    //Realizar varias operaciones sobre los datos 
    public void procesarCalificaciones() {
        //Imprimir el arreglo de calificaciones
        imprimirCalificaciones();

        //llama al metodo obtener obtenerPromedio para calcular la calificacion promedio
        System.out.printf("\nEl promedio dela clase es %.2f\n", obtenerPromedio());

        //llama al metodo obtenerMinimo y obtenerMaximo
        System.out.printf("La calificacion mas baja es %d\nLa califiaccion mas "
                + "alta es %d\n\n", obtenerMinimo(), obtenerMaximo());

        //Llama a imprimirGraficoBarras par imprimir el grafico de distribucion de calificaciones 
        imprimirGraficosBarras();
    }// Fin del metodo procesarCalificaciones 

    //buscar la calificacion mas baja 
    public int obtenerMinimo() {
        int califBaja = calificaciones[0]; //la calificacion[0]es la mas baja 
        //itera sobre calificaciones 

        for (int calificacion : calificaciones) {

            //si calificacion es menor que califBaja 
            if (calificacion < califBaja) {
                califBaja = calificacion;//nueva calificacion mas baja 
            }
        }//fin del for 
        return califBaja;//devuelve la calificacion mas baja
    }//fin del metodo minimo

    //buscar la calificacion mas alta 
    public int obtenerMaximo() {
        int califAlta = calificaciones[0];//la calificacion[0] es la mas alta 

        //itera atravez de calificaciones 
        for (int califica : calificaciones) {
            //si calificacion mayor que califAlta

            if (califica > califAlta) {
                califAlta = califica;//nueva calificacion mas alta 
            }
        }// fin de for
        return califAlta; //devuelve la calificacion mas alta 
    }//fin del metodo obtenerMaxima

    //Determinar la calificacion promedio de la prueba
    public double obtenerPromedio() {
        int total = 0;
        //Suma de calificaciones para un estudiantes estudiantes 
        for(int calificacion : calificaciones)
            total += calificacion;
        //devuelve el promedio de las calificaciones 
        return (double) total / calificaciones.length;
        
    }//Fin del metodo optenerPromedio
//Imprime garfico de baras que muestra la distribucion de las calificaciones 
    public void imprimirGraficosBarras(){
        System.out.println("Distrubucion de Calificaciones:");
        
        //Almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones 
        
        int frecuencia[] = new int[11];
        
        //para cada calificacion, incrementa frecuencia apropiada 
        for (int calificacion:calificaciones ) {
            ++frecuencia[calificacion/10];
        }
        //para cada frecuencia de calificacion, imprime una barra en el grafico
        
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiquetas de las barras ( "00-09: ", ..., "90-99: ", "100: " )
            if(cuenta == 10){
                System.out.printf( "%5d: ", 100 );
            }else{
                System.out.printf( "%02d-%02d: ",
                        cuenta*10,cuenta*10+9);
            }
            // imprime barra de asteriscos
            
            for(int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
                
                }//fin del for interno
                
                System.out.println();// inicia una nueva línea de salida
                
            
        }//fin del for externo
      }//fin del metodo imprimirGraficosBarras 
    // imprime el contenido del arreglo de calificaciones
    public void imprimirCalificaciones(){
        System.out.println( "Las calificaciones son:\n" );
        // imprime la calificación de cada estudiante
        for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ ){
            System.out.printf( "Estudiante %2d: %3d\n",
                    estudiante + 1, calificaciones[ estudiante ] );
        }
    }// fin del método imprimirCalificaciones
}// fin de la clase LibroCalificaciones
