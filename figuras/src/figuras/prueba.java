
package figuras;
//PruebaFiguras 
//Obtener la entrada del usuario y crear un JFrane para mostrar Figuras
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class prueba {
    public static void main(String [] args){
        //Obtiene  la opcion de usuario
        
        String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar Rectangulo \n" + 
                                                     "Escriba 2 para dibujar Ovalo");
        
        int option = Integer.parseInt(entrada); // convierte entrada en int
        
        //Crear panel con la entrada de usuario
        
        Figuras panel = new Figuras(option);
        
        JFrame aplicacion = new JFrame(); //Crea un nuevo JFrame
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel);
        
        aplicacion.setSize(300, 300);
        
        aplicacion.setVisible(true);
        
             
        
    }
}
