
package carta;

//La Clase Carta representa la carta de juego
public class Carta {
    
    private final String cara; //cara de la carta ("As", "Dos", ...)
    private final String palo; //palo de la carta ("Corazones", "Diamantes", ...)
    
    //Constructor de los argumentos inicializa la cara y el palo de la carta
    
    public Carta(String caraCarta, String paloCarta)
    {
        this.cara=caraCarta;
        this.palo=paloCarta;
    }
    //devuelve representacion String de la carta
    
    public String toString()
    {
    return cara + " de " + palo;
    }
}// Fin de la clase carta
