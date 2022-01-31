
/**
 * . Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package _10_ejercicio;

import java.util.Arrays;


public class Principal10 {

    
    public static void main(String[] args) {
        
        double[] arrA = new double[50];
        double[] arrB = new double[20];
            
        for (int i = 0; i < arrA.length; i++) {
            arrA[i]=Math.random();
        
        }
        //IMPRIME LA CADENA ENTERA 
        System.out.println(Arrays.toString(arrA));
        //ordena la cadena
        Arrays.sort(arrA); 
        System.out.println(Arrays.toString(arrA));
        System.arraycopy(arrA,0,arrB,0,10); // copia los primeros 10 numeros del array A y coloca en el array B
        //rellenar los 10 ultimos con 0,5
        for (int i = 10; i < 20; i++) {
            arrB[i]=0.5;  
        }
        //Mostrar el array combinado
        System.out.println(Arrays.toString(arrB));
        
        
        
    }

}
