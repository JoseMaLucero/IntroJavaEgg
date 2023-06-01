
package com.jml.introjavaegg;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio10 {
    public static void main(String[] args) {
       
//        Scanner leer = new Scanner(System.in);
//
//     
//        int lim=0;
//        int suma=0;
//        do{
//               System.out.println("Introduzca un limite");
//               lim = leer.nextInt();
//            
//        } while (lim<=0);
//        
//         // int entrada;
//            
//        while(true) {
//            System.out.println("Introduzca un numero");
//             suma += leer.nextInt();
//             if(suma>lim) break;
//          
//        }
       
        
        for (int i = 0; i < 10; i++) {
            if(i%2==0) continue;
            
            if(i==5) break;
            System.out.println("VAlor de i: " + i);
            
        }
        
        
    }
}


/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/