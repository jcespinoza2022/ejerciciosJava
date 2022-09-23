
package librocalificacionesbidimen;
//PruebaLibroCalificaciones crea un objeto LibroCalificaciones, usando un
//arreglo bidimensional
//de calificaciones, y después invoca al método procesarCalificaciones para
//analizarlas
public class pruebaLibroCalificacionesBidimen {
    public static void main(String args[]){
        //arreglo bidimencional de las calificaciones de los estudiantes
        
        int[][] arregloCalif ={{89, 87, 98},
                               {77, 99,100},
                               {100, 91,92},
                               { 99, 93,97},
                               {78, 80, 88},
                               {91,97, 100},
                               {79, 80,100},
                               {88, 78, 99},
                               {78, 69, 98},
                               {89,100, 80}};
        
     LibroCalificacionesBidimen miLibroDeCalificaciones = new LibroCalificacionesBidimen(
             "CS101 Introduccion de Java", arregloCalif);
     System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n",miLibroDeCalificaciones.getNombreDelCurso());
     miLibroDeCalificaciones.procesarCalificaciones();
    }
}
