
package libroDeCalificaciones;
// Crea objeto LibroCalificaciones, usando un arreglo de calificaciones.
public class PruebaLibroDeCalificaciones {
    
    public static void main(String args[]){
        // arreglo unidimensional de calificaciones de estudiantes
        int arregloCalif[]= {87, 98, 80, 71, 81, 70, 99, 97, 69, 85, 90};
        LibroCalificaciones miLibroDeCalificaciones = new LibroCalificaciones(
                "Introduccion la programacion Java", arregloCalif);
        miLibroDeCalificaciones.mostrarMensaje();
        miLibroDeCalificaciones.procesarCalificaciones();
    }
    
}
