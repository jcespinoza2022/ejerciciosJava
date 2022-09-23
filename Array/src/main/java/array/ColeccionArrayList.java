
package array;

//Demostración de la colección de genéricos ArrayList.

import java.util.ArrayList;

public class ColeccionArrayList {
    public static void main(String args[]){
        //  crea  un nuevo objeto ArrayList de objetos String con una capacidad inicial de 10
        
        ArrayList<String> elementos = new ArrayList<>();
        
        elementos.add("rojo");// adjunta un elemento a la lista
        elementos.add(0, "Amarillo");// inserta “amarillo” en el índice 0
        
        // Encabezado
        System.out.print("Mostrar contenido de lista con ciclo controlado por contador:\n");
        //Muestra los colores en la lista
        
        for (int i = 0; i < elementos.size(); i++) {
            System.out.printf(" %s ",elementos.get(i));
        }
        // muestra los colores usando for en el método mostrar
        mostrar(elementos,"\nMostrar contenido de lista con instruccion for mejorada:");
        elementos.add("Verde");// agrega “verde” al final de la lista
        elementos.add("Amarillo");// agrega “amarillo” al final de la lista
        mostrar(elementos,"Lista con dos nuevos elementos:");
        elementos.remove("Amarillo");//Elimina el primer "amarillo"
        mostrar(elementos,"Eliminar primera instancia de amarillo:");
        elementos.remove(1);//elimina elemento en subíndice 1
        mostrar(elementos,"Eliminar segundo elemento de la lista (verde):");
        
        // verifica si hay un valor en la lista
        System.out.printf("\"rojo\" %sesta en la lista%n",
                            elementos.contains("rojo") ? "": "no");
        // muestra el número de elementos en la lista
        System.out.printf("Tamanio: %s%n", elementos.size());
        
    }// fin del main
    // muestra los elementos de ArrayList en la consola
    public static void mostrar(ArrayList<String>elementos, String encabezado){
        System.out.print(encabezado);//mostrar encabezado
        // muestra cada elemento en elementos
        for(String elemento : elementos){
            System.out.printf(" %s", elemento);
        }
        System.out.println();
    }//Fin del metodo modostrar
}//fin de la clase ColleccionArrayList
