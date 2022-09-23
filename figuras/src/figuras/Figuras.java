/*
 * Rectangulos o ovalos segun desida el ususriso
 */
package figuras;

/**
 * @Jaime Espinoza
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel {

    private int opcion;//Opcion de usuario acerca de cual figura que dibujar
    
//El constructor establece la opcion del usuario  
    
    public Figuras(int opcionUsuario){
        opcion = opcionUsuario;
    }
    // Dibuja una cascada de figuras empezando desde la esquina superior izquierda
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i = 0; i < 10; i++){
            switch(opcion){
                case 1: //Dibuja Rectangulos 
                    g.drawRect(10+i*10,10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: //Dibuja Ovalo
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                    
            }
        }
    }
    
    
}
