
package com.jml.encuentro6;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduzca su numero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num%2==0) {
            System.out.println("EL numero es par");
        } else {
            System.out.println("EL numero es impar");
        } 
    }
}



/*Crear un programa que dado un numero determine si es par o impar.

*/