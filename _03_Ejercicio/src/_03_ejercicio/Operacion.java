/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
package _03_ejercicio;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {
    
    private double numero1;
    private double numero2;

    //b) Metodo constructor sin los atributos pasados por parámetro.

    public Operacion() {
    }
    
    
    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    //c) Métodos get y set.

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //d) Método para crearOperacion(): que le pide al usuario los dos números y los
    //guarda en los atributos del objeto.
    
    public void crearOperacion(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE 2 NUMEROS");
        this.numero1=teclado.nextInt();
        this.numero2 =teclado.nextInt();
        
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public double sumar(){
        double suma = this.numero1+this.numero2; 
        
        return suma ;
    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public double restar(){
        double resta = this.numero1-this.numero2; 
        
        return resta ;
    }
    
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    //si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
    //error. Si no, se hace la multiplicación y se devuelve el resultado al main
    
    public double multiplicar(){
        double multi;
        if (numero1==0 || numero2== 0){
            System.out.println("ERRORR SE MULTIPLICA POR 0");
            return 0;
        }
        
        
        multi = numero1*numero2;
        return multi;
        
    }
    
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
    //pasar una división por cero, el método devuelve 0 y se le informa al usuario el
    //error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
    //al main
    
    public double division(){
        double div;
        if (numero1==0 || numero2== 0){
            System.out.println("ERRORR SE DIVIDE POR 0");
            return 0;
        }
        
        div= numero1/numero2;
        return div;
        
    }
}
