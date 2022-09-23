
package pasoarreglo;
//Pasa un arreglo y elementos de un arreglo a un metodo
public class PasoArreglo {

   //main crea un arreglo y llama a modificarArreglo y a modificarElemento
    public static void main(String[] args) {
       int arreglo[] = {1, 2, 3, 4, 5, 6, 7};
       
       System.out.println(
       "Efecto de pasar una referencia a un arreglo completo:\n" + 
       "Los valores originales del arreglo");
       
       //Imprime los valores originales del arreglo
        for (int valor: arreglo) 
            System.out.printf("  %d", valor);
        
        modificarArreglo(arreglo);//Pasa la referencia al arreglo
        System.out.println("\n\nLos valores del arreglo modificado son:");
        
        //Imprime los valores modificados del arreglo
        for(int valor: arreglo)
            System.out.printf("   %d", valor);
        
        System.out.printf("\n\nEfecto de pasar un elemento del arreglo:\n"
                + "arreglo[3]antes de modificarElemento: %d\n",  arreglo[3]);
        
        modificarElemento(arreglo[3]);//modifica el elemento del arreglo[3]
        System.out.printf("\narreglo[3] despues de modificar el elemento:%d\n ",
                arreglo[3] );
            
    }//fin del main
    
    //multiplica por 2 el arreglo
    
    public static void modificarArreglo(int arreglo2[])
    {
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i]*= 2;
        }
    }//fin del metodo modificarArreglo
    
    //multiplica el argumento por 2
    
    public static void modificarElemento(int elemento){
        elemento *= 2;
        
        System.out.printf("Valor del elemento modificarElemento: %d", elemento);
    
    }//fin del metodo modificarElemento
}// fin de la clase pasoArreglo
