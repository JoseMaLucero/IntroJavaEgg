
package com.jml.introjavaegg;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      
        String frase;
        
        do {
              System.out.println("Introduzca una frase de no mas de  8 caracteres");
              frase = leer.nextLine();
              if(frase.length()>8){
                  System.out.println("INCORRECTO");
            }
            
            
            
        } while (frase.length()>8 );
        
//        while (frase.length()>8) {
//            System.out.println("INCORRECTO");
//            System.out.println("Introduzca una frase de no mas de  8 caracteres");
//            frase = leer.nextLine();
//        }
        System.out.println("CORRECTO");
         
        
    }
}


/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/