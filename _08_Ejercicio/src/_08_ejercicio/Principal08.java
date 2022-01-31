

package _08_ejercicio;

import java.util.Locale;
import java.util.Scanner;


public class Principal08 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
        
        System.out.println("INGRESE UNA FRASE");
        cadena.setUnaFrase(teclado.next());
        cadena.setLongitudFrase(cadena.getUnaFrase().length());
        
        cadena.mostrarVocales();
       
        cadena.invertirFrase();
        
        System.out.println("INGRESE UN CARACTER");
        cadena.vecesRepetido(teclado.next());
        System.out.println("INGRESE UNA FRASE PARA COMPARAR LA LONGITUD");
        cadena.compararLongitud(teclado.next());
        System.out.println("INGRESE FRASE PARA UNIR");
        cadena.unirFrases(teclado.next());
        System.out.println("INGRESE UNA LETRA ");
        cadena.reemplazar(teclado.next());
        System.out.println("");
        System.out.println("INGRESE UNA LETRA PARA COMPROBAR SI EXISTE EN LA FRASE");
        System.out.println(cadena.contiene(teclado.next()));
        
        
        
    }
    
    
    
    
    
    
}
