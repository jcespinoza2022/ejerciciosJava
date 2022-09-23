
package com.mycompany.areadelcirculo;

// Dado el radio de unn circulo calcular el area 

import java.util.Scanner;

public class NewClass {
    public static void main(String agrs[]){
        var radio = 0.0;
        var Area = 0.0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar el radio de la circulo");
        
        radio = entrada.nextDouble();
        
        Area = Math.PI*Math.pow(radio, 2.0);
        
        System.out.printf("El area del circulo cuyo radio es :%.2f%n  area = %.2f%n",radio,Area);
    }
}
