
package dibujarcarasonriente;
//demuestra las figuras rellenas 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujarCaraSonriente extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //Dibujar la cara 
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);
        
        //Dibujar los ojos 
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //Dibujar la boca 
        g.fillOval(50, 110, 120, 60);
        
        //Convertir la boca en una Sonrisa
        g.setColor(Color.yellow);
        g.fillOval(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
        
    }//Fin de la metodo paintComponent
      
}//Fin de la clase CaraSonriente
