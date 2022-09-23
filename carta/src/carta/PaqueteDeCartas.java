
package carta;
import java.security.SecureRandom;

public class PaqueteDeCartas {
    private Carta[] paquete; //arreglo de objetos de carta
    private int cartaActual; //indice de la siguiente carta a repartir (0 a 51)
    private static final int NUMERO_DE_CARTAS = 52; //numero constante de Cartas
    //Generar los numeros aleatorios 
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    //El constructor llena el paquete de cartas 
    public PaqueteDeCartas()
    {
     String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
                        "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey" };
     String[] palo = { "Corazones", "Diamantes", "Treboles", "Espadas" };
     
     paquete = new Carta[NUMERO_DE_CARTAS];//Crea arreglo de objetos Carta
     cartaActual=0;//La primera carta repartida paquete[0]
     
     //Llena el paquete con el objeto carta
     
     for(int i = 0; i< paquete.length; i++)
         paquete[i] = new Carta(caras[i % 13],palo[i / 13]);
              
    }
    //Baraja el paquete de Cartas con algoritmo de una pasada
    
    public void barajar()
    {
        // la siguiente llamada al método repartirCarta debe empezar en paquete[0] otra vez
         cartaActual=0;
        //para cada Carta, selecciona otra Carta aleatoria (0 a 51) y las intercambia
        for(int j = 0; j< paquete.length; j++){
            // selecciona un número aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            // selecciona un número aleatorio entre 0 y 51
            Carta temp = paquete[j];
            paquete[j] = paquete[segunda];
            paquete[segunda] = temp;
        }
}
//reparte una carta 
    public Carta repartirCarta()
    {
        // determina si quedan Cartas por repartir
        if(cartaActual<paquete.length)
            return paquete[cartaActual++];// devuelve la Carta actual en el arreglo
        else
            return null; //devuelve null para indicar que se repartieron todas las  Cartas
    }
}//fin de la clase PaqueteDeCartas