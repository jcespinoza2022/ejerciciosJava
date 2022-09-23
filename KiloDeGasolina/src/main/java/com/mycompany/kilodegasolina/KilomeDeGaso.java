/*
 * Recive como entrada los kilometros conducidod y los litros 
 * usados (ambos como enteros) por cada viaje 
 * el programa debe calcular y mostrar los kilometros por 
 * litros obtenidos en cada viaje y debe imprimir el total
 * de kilometros por litros de todos los viajes. Todos los 
 * calculos de los promedios deben producir resultados en 
 * numeros de puntos flotantes 
 */
package com.mycompany.kilodegasolina;

import java.util.Scanner;


public class KilomeDeGaso {
    public static void main(String args[]){
        var Kilometros = 0;
        var litros = 0;
        var sumaKilometros = 0;
        var sumaLitros = 0;
        var promedio = 0.0;
        var totalPromedio = 0.0;
        Scanner entrada = new Scanner(System.in);
        int cuenta = 0;
        
        int Viajes = 0;
        while(cuenta != -1 ){
            
            System.out.println("Ingrese los kilometros recoridos y los litros usados");
            
            Kilometros = entrada.nextInt();
            sumaKilometros += Kilometros;
            litros = entrada.nextInt();
            sumaLitros += litros;
            Viajes ++;
            promedio = (double)Kilometros/litros;
            System.out.println("El viaje:"+Viajes+" tiene "+Kilometros+" kilometros con "+litros+ "litros usados");
            System.out.printf("Los kilometros por litros: %.2f%n", promedio);
            System.out.println("digite 1 para seguir o -1 para salir  ");
            cuenta = entrada.nextInt();
        }
        totalPromedio = (double)sumaKilometros/sumaLitros;
        System.out.printf("el total de kilometros por litros es %.2f%n ", totalPromedio);
        
    }
}
