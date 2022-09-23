
package com.mycompany.ecuacioncuadratica;
//resolucion de una ecuacion cuadratica por la formula 
// aX^2+bX+c=0

import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String args[]){
        double a,b,c;//Coeficiente de la ecuacion cuadrada
        double X1=0,X2=0, d=0;//respuests y descriminante 
        
        //Entrada de datos 
        //Ingrasar los coeficiente a,b,c de la euacion cuadratica  
        System.out.println("Ingresa el coeficiente a de la ecuacion cuadratica");
        Scanner entradaA = new Scanner(System.in);
        a = entradaA.nextDouble();
        System.out.println("Ingresa el coeficiente b de la ecuacion cuadratica");
        Scanner entradaB = new Scanner(System.in);
        b = entradaB.nextDouble();
        System.out.println("Ingresa el coeficiente c de la ecuacion cuadratica");
        Scanner entradaC = new Scanner(System.in );
        c = entradaA.nextDouble();
        if(a == 0.0){
            System.out.println("La ecuacion no es cuadratica");
        }else
        {
            //calculamos el discriminante 
        d = (Math.pow(b, 2.0)-4*a*c);
        
        if(d < 0){
            System.out.println("No tiene soluciones reales ");
        }else
            { //Calculamos las rices reales 
            X1 = (-b + Math.sqrt(d))/(2*a);
            X2 = (-b - Math.sqrt(d))/(2*a);
            System.out.printf("Primera solucion:%.2f%n",X1);
            System.out.printf("Segunda solucion:%.2f%n",X2);
            }
        
        }
      
    }//Fin de la clase main
}// fin de la clase EcuacionCuadratica 
