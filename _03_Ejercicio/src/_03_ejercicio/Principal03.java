

package _03_ejercicio;


public class Principal03 {

    
    public static void main(String[] args) {
        Operacion operaciones = new Operacion();
        operaciones.crearOperacion();
                
        System.out.println("suma "+operaciones.sumar());
        System.out.println("Resta "+operaciones.restar());
        System.out.println("Multi "+operaciones.multiplicar());
        System.out.println("Div "+operaciones.division());
        
    }

}
