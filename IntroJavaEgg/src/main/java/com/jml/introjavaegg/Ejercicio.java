
package com.jml.introjavaegg;
 
import java.util.Scanner;

/* @author jmlucero */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca una frase o palabra");
        String frase = leer.nextLine();

        if (frase.split("")[0].equalsIgnoreCase("A")) {
            System.out.println("Empieza con A");
        } else {
            System.out.println("No empieza con A");
        }

        String listaNombres = "CArlos, Pedro, Juan, Miguel";
        String[][] matrix = new String[2][2];
        matrix[0][0] = "Carlos";
        matrix[0][1] = "Miguel";
        matrix[1][0] = "Alejandra";
        matrix[1][1] = "NAtalia";
        for (String[] vectorDentroDeMatriz : matrix) {
             for (String string : vectorDentroDeMatriz) {
                 System.out.println("Nombre "+string);
            }
        }
    }
}


/*9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.

*/