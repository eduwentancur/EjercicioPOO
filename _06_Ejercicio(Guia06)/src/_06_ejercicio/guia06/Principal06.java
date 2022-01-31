/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */

package _06_ejercicio.guia06;

import java.util.Locale;
import java.util.Scanner;


public class Principal06 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera(100, 0);
        int opc ;
        cafetera.llenarCafetera();
        
        
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("1- SERVIR TAZA DE CAFE");
            System.out.println("2- VACIAR CAFETERA");
            System.out.println("3- AGREGAR CAFE");
            System.out.println("4- SALIR");
            
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("INGRESE EL TAMAÑO DE SU TAZA");
                    cafetera.servirTaza(teclado.nextInt());
                    break;
                case 2:
                    cafetera.vaciarCafetera();
                    break;
                case 3:
                    System.out.println("INGRESE LA CANTIDAD DE CAFE A LA CAFETERA");
                    cafetera.agegarCafe(teclado.nextInt());
                    break;
                case 4:
                    System.out.println("DISFRUTE SU CAFE");
                    break;
                
                default:
                    System.out.println("¡¡¡ERROR!!! NO INGRESO UN NUMERO CORRECTO");
                    break;

            }

        } while (opc != 4);
        
        
        
        
        
    }

}
