
package com.mycompany.longituddelacircunferencia;

//Calcular la longitud de la Circunferencia

import java.util.Scanner;

public class longitudDeLaCircunferencia {
    public static void main(String args[]){
        var longitud = 0.0;
        var radio = 0.0;
        
        Scanner entrada = new Scanner(System.in);
        
        //Ingresar el radio
        System.out.println("Ingrese el radio de la circunferencia ");
        radio = entrada.nextDouble();
        
        //Calcular la longitud 
        
        longitud = 2*Math.PI*radio;
        
        System.out.printf("La longitud de la circunferencia de radio:%.2f%n  longitud = %.2f%n",radio,longitud);
    }
    
}
