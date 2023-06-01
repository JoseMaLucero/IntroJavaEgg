
package com.jml.encuentro6;

import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzca su numero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("El doble de su numero es: "+(num*2));
        System.out.println("El triple de su numero es: "+(num*3));
        System.out.println("LA raiz cuadrada de su numero es: "+ Math.sqrt(num));
    }
}



/*5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/