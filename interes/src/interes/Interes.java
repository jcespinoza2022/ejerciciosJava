/*
 * Calculo de interes Compuesto 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interes;

public class Interes {

   //Calculo de interes compuesto 
    public static void main(String[] args) {
        
        double monto; //monto a depositar al final de cada año
        double montoInicial = 1000.0; //monto inicial antes de los intereses
        double tasa = 0.05; // tasa de interes
        
        //Muestra los encabezados 
        
        System.out.printf("%s%20s%n", "Anio","Monto en deposito");
        
        //Calcula el monto en deposito para cada uno de los diez años 
        
        for(int i=1;i<=10; ++i){
            
            //Calcula el monto del deposito para cada año especifico
            
            monto = montoInicial*Math.pow(1.0+ tasa, i);
            
            //Muestra el  año y el monto
            
            System.out.printf("%4d%,20.2f%n", i ,monto);
            
            
        }
        
    }
    
}//fin de la clase interes
