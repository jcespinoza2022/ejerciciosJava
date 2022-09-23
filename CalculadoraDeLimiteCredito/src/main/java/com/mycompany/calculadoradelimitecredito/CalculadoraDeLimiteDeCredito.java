/*
 * Determinar si algunos de los clientes de una tienda 
 * se ha excedido del limite de credito de una cuenta 
 * 
 */
package com.mycompany.calculadoradelimitecredito;

import java.util.Scanner;


public class CalculadoraDeLimiteDeCredito {
    public static void main(String args[]){
        
        var numeroCuenta = 0 ;
        var saldoInicioMes = 0.0;
        var totalArticulos = 0.0;
        var totalCredito = 0.0;
        var limiteCredito =0.0;
        var saldo = 0.0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresar el numero de Cuenta");
        numeroCuenta = entrada.nextInt();
        System.out.println("Ingrese el saldo inicial del mes ");
        saldoInicioMes = entrada.nextDouble();
        System.out.println("Ingrese el Total de Articulos cargados por el cliente en el mes ");
        totalArticulos = entrada.nextDouble();
        System.out.println("Ingrese el total de Credito del mes ");
        totalCredito = entrada.nextDouble();
        System.out.println("Ingrese el Limite de credito en el mes ");
        limiteCredito = entrada.nextFloat();
        
        saldo = saldoInicioMes + totalArticulos - totalCredito;
        
        if(saldo > limiteCredito){
            System.out.println(" Se excedio limite de Credito");
        }
        
    }
}
