
package com.jml.encuentro6;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio3 {
    public static void main(String[] args) {
            System.out.println("Ingrese su frase");
        Scanner  leer =  new Scanner(System.in);
        String frase = leer.nextLine();
        
        System.out.println("Su frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("Su frae en minusculas es: "+ frase.toLowerCase());
    }
}


/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
*/