
package carta;
//Aplicacion para barajar y repartir carta 
public class PruebaPaqueteDeCartas {
    //Ejecuta la aplicacion
    
    public static void  main(String args[]){
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();//coloca las cartas en orden aleatorios
        
        //imprime las 52 cartas en el orden que en el que se reparten 
        
        for (int i = 0; i < 13; i++) {
            //reaprete e imprime 4 cartas 
            
            System.out.printf("%-20s%-20s%-20s%-20s\n",miPaqueteDeCartas.repartirCarta(),
                    miPaqueteDeCartas.repartirCarta(),miPaqueteDeCartas.repartirCarta(),
                    miPaqueteDeCartas.repartirCarta());
        }//Fin del for
    }//Fin de la clase main
    
}//fin de la clase PruebaPaqueteDeCartas
