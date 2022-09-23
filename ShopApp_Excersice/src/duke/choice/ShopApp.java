/*
 * Ejerciccio de prueba del curso gratis de Oracle
 */
package duke.choice;

/**
 *
 * @author Jaime Espinoza
 */
public class ShopApp {

    public static void main(String[] args) {

        //final double impuesto = 0.2;

        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Cliente c1 = new Cliente();

        c1.setName("Pinky");
        
        c1.setTalla("S");

        System.out.println("El nombre del Client es " + c1.getName());

        Ropa item1 = new Ropa();

        Ropa item2 = new Ropa();

        Ropa[] items = {item1, item2, new Ropa(), new Ropa()};

        item1.setDescripcion = "Chaqueta Azul";

        item1.setPrecio = 20.9;

        item1.setTalla = "M";

        item2.setDescripcion = "Camiseta naranja";

        item2.setPrecio = 10.5;

        item2.setTalla = "S";

        items[2].setDescripcion = "Bufanda verde";

        items[2].setPrecio = 5.0;

        items[2].setTalla = "S";

        items[3].setDescripcion = "Camisera Azul";

        items[3].setPrecio = 10.5;

        items[3].setTalla = "S";

        //System.out.println("La ropa que compro: " + item1.descripcion + " Valor Bruto: " + item1.precio + " Talla: " + item1.talla);
        // System.out.println("La ropa que compro: " + item2.descripcion + " Valor Bruto: " + item2.precio + " Talla: " + item2.talla);
        //total = (item1.precio + item2.precio * 2) * (1 + impuesto);
        c1.setTalla("S");

        int medida = 3;

        switch (medida) {
            case 1,2,3:
                c1.setTalla("S");
                break;

            case 4,5,6:
                c1.setTalla("M");
                break;

            case 7,8,9:
                c1.setName("L");
                break;

            default:
                c1.setTalla("X"); 
        }

        for (Ropa item : items) {

            if (c1.getTalla().equals(item.getTalla())) {

                //total = total + item.getPrecio();

                System.out.println("La ropa que compro: " + item.getDescripcion() + " Valor Bruto: " + item.getPrecio() + " Talla: " + item.getTalla());
                
                if(total > 15){break;}
            }
            

        }
        System.out.println("Total : " + total);
    }

}
