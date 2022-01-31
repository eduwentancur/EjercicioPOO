

package _09_ejercicio;


public class Principal09 {

    
    public static void main(String[] args) {
        
        Matematica matematica = new Matematica();
        matematica.setNumero1(Math.random());
        matematica.setNumero2(Math.random());
        System.out.println(matematica.getNumero1());
        System.out.println(matematica.getNumero2());
        System.out.println("EL MAYOR ES: "+matematica.devolverMayor());
        matematica.calcularPotencia();
        System.out.println("");
        matematica.calcularRaiz();
        
        
        
        
    }

}
