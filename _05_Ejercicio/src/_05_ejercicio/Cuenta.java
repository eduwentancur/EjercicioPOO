/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package _05_ejercicio;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {

    private int numeroCuenta ;
    private long DNI;// miniscula
    private double saldoActual;
    
    //Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }
    
    //Agregar los métodos getters y setters correspondientes

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
   
     //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE NUMERO DE CUENTA");
        this.numeroCuenta=teclado.nextInt();
        System.out.println("INGRESE DNI");
        this.DNI=teclado.nextLong();
        System.out.println("INGRESE SALDO");
        this.saldoActual=teclado.nextDouble();
        
        
    
    }
    // Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    //ingresar y se la sumara a saldo actual.
    
    public void ingresar(double ingreso){
        this.saldoActual += ingreso;
    
    }
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    //se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    
    public void retirar(double retiro){
        if(retiro>this.saldoActual){
            System.out.println("usted no tiene fondo suficiente");
            System.out.println("SE RETIRO "+this.saldoActual);
             this.saldoActual=0 ;
        }else {
            this.saldoActual -= retiro ; 
            System.out.println("SE RETIRO: "+ retiro);
        }
        
        
   
    }
    
    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    //que el usuario no saque más del 20%.
    
    public void extraccionRapida(){
        double retiro ; 
        
        retiro = this.saldoActual * 0.20 ;
        this.saldoActual -= retiro;
        System.out.println("USTED RETIRO "+retiro);
        
    }
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    
    public void consultarSaldo(){
        System.out.println("SU SALDO ACTUAL ES: "+this.saldoActual);
        
    
    }
    
    // Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    public void consultarDatos(){
        System.out.println("TODOS LOS DATOS DE LA CUENTA SON: "+"NUMERO DE CUENTA: "+this.numeroCuenta+" DNI: "+this.DNI+" SALDO ACTUAL: "+this.saldoActual);
    
    
    }

    
    
}
