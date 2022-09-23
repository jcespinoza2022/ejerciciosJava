//Tirar un dado de seis lados 6,000,000 veces.

import java.security.SecureRandom;
public class TirarDado {

    
    public static void main(String[] args) {
        
       //El objeto de numerosAleatorios  producira numeros aleatorios seguros
        SecureRandom numeroAleatorio = new SecureRandom();
        
        int Frecuencia1 = 0; //cuantas veces se tiro elnumero 1
        int Frecuencia2 = 0; //cuantas veces se tiro elnumero 2
        int Frecuencia3 = 0; //cuantas veces se tiro elnumero 3
        int Frecuencia4 = 0; //cuantas veces se tiro elnumero 4
        int Frecuencia5 = 0; //cuantas veces se tiro elnumero 5
        int Frecuencia6 = 0; //cuantas veces se tiro elnumero 6
        
        //Sintetizar los resultados de tirar 6000000 veces el dado
        
        for(int tiro = 1; tiro <= 6000000; tiro++){
            
            int cara = 1+ numeroAleatorio.nextInt(6);//generamos los numeros 1 al 6
            
            //Usa el valor de 1 a 6 para determinar que frecuencia incrementar
            
            switch (cara){
                case (1):
                    ++Frecuencia1;//incrementa la frecuencia de salida del 1
                    break;
                case (2):
                    ++Frecuencia2;//incrementa la frecuencia de salida del 2
                    break;
                case (3):
                    ++Frecuencia3;//incrementa la frecuencia de salida del 3
                    break;
                case (4):
                    ++Frecuencia4;//incrementa la frecuencia de salida del 4
                    break;
                case (5):
                    ++Frecuencia5;//incrementa la frecuencia de salida del 5
                    break;
                case (6):
                    ++Frecuencia6;//incrementa la frecuencia de salida del 6
                    break;
                                               
            }//fin del switch
                      
        }//fin del for
        System.out.println("Cara\tFrecuencia");//encabezado de salida 
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",Frecuencia1,
        Frecuencia2, Frecuencia3,Frecuencia4,Frecuencia5,Frecuencia6);
    }
    
}
