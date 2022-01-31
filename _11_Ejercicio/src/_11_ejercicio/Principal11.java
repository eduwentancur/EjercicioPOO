/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */

package _11_ejercicio;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Principal11 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int dia , mes , anio , diferencia;
        System.out.println("INGRES AÑO");
        anio=teclado.nextInt();
        System.out.println("INGRES Mes");
        mes=teclado.nextInt();
        System.out.println("INGRES DIA");
        dia=teclado.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        diferencia = fechaActual.getYear()+1900-fecha.getYear();
        System.out.printf("Pasaron %d años hasta el año actual ",diferencia);
        
        
        if (fechaActual.getMonth()+1<=fecha.getMonth()) {
            if (fechaActual.getMonth()+1==fecha.getMonth()) {
                if (fecha.getDate()>fechaActual.getDate()) {
                    diferencia--;
                }
            }else{
                diferencia--;
            }
        }
        System.out.printf("La cantidad de años que hay entre las dos fechas es %d \n",diferencia);
       
            
        
        
        
        
        
        
    }
    
}
