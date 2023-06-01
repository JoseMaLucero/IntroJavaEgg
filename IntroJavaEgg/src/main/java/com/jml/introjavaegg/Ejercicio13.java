
import java.util.Scanner;


/* @author jmlucero */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca dimension del cuadrado de asteriscos");
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            if(i==0||i==lado-1) {
           System.out.print( GenerarLinea("*",lado));
            } else {
               System.out.print( "*"+GenerarLinea(" ",lado-2)+"*");  
            }
            System.out.println("");
            
        }
    }
    
    
    public static String GenerarLinea(String letra, int veces) {
        String salida="";
        for (int i = 0; i < veces; i++) {
            salida+=letra;
        }
        
        return salida;
    }
}


/*13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *

46

* *
* * * *

*/