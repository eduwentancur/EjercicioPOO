
package _09_ejercicio;


public class Matematica {
    private double numero1;
    private double numero2 ; 

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

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
    
    
    
    public double devolverMayor(){
        
        if (this.numero1>this.numero2) {
            return this.numero1;
        }
        return this.numero2;
        
    }
//    Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(){
        double numeroRedondeado=0;
        if (this.numero1>this.numero2) {
            numeroRedondeado = Math.round(this.numero1);
            System.out.printf("La potencia de %.0f es : %.0f \n",numeroRedondeado,Math.pow(numeroRedondeado, numeroRedondeado));
            
        }else{
            numeroRedondeado = Math.round(this.numero2);
            System.out.printf("La potencia de %.0f es: %.0f",numeroRedondeado,Math.pow(numeroRedondeado,numeroRedondeado));
            
        }
    }
//     Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    public void calcularRaiz(){
        double valorAbsoluto=0;
        if (this.numero1<this.numero2) {
            valorAbsoluto = Math.abs(this.numero1);
            System.out.println("el valor absoluto es: "+valorAbsoluto);
            System.out.printf("La raiz cuadrada del numero %f es : %f",this.numero1,Math.sqrt(valorAbsoluto));
        }else{
            valorAbsoluto = Math.abs(this.numero2);
            System.out.printf("La raiz cuadrada de %f es : %f",this.numero2,Math.sqrt(valorAbsoluto));
        }
        
    
    }
    
    
}
