/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 * 
 */
package _02_ejercicio;

import java.util.Locale;
import java.util.Scanner;


public class Circunferencia {
    
    private double radio ;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void crearCircunferencia(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE RADIO");
        this.radio=teclado.nextDouble();
        
        
    }
    
    public void area(){
        double area =Math.PI * Math.pow(radio,2 );
        System.out.println("EL AREA ES: "+area);
        
    
    
    }
    
    public void perimetro(){
        double perimetro =  2 * 3.14 * radio;
        System.out.println("El perimetro es: "+perimetro);
    
    }
    
}
