
package com.jml.introjavaegg;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca su frase: ");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
 
        
        
        if(frase.equals("eureka" )) {
            System.out.println("CORRECTO");
            System.out.println("LA frase coincide con eureka");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}


/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
*/