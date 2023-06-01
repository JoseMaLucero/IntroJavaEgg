
/* @author jmlucero */
public class ReemplazarCadena {
    public static void main(String[] args) {
        String frase = "La casa de Pablito tiene techo de chapa";
//        String[] reemplazo = {"@","#","$","%","-"};
//        String salida="";
//        int index;
//        for (String string : frase.split("")) {
//            index="aeiou".indexOf(string);
//            if(index>=0) {
//                salida+=reemplazo[index];
//                
//            } else {
//                salida+=string;
//            }
//            
//        }
//        System.out.println("SAlida" + salida);
        frase =    frase.replace('a', '@')     .replace('e', '#').replace('i', '&');
         System.out.println("Frase " + frase);
    }
    
    
    
    
}
