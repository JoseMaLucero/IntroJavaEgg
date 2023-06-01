
package com.jml.introjavaegg;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio4 {
    public static void main(String[] args) {
      
        System.out.println("Introduzca su temeperatura corporal");
        Scanner leer = new Scanner(System.in);
        int temp = leer.nextInt();
        System.out.println("Su temeperatura en FArenheit es: "+ (32+(9.0*temp)/5.0));
        
    }
}


/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/