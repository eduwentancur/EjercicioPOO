/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
 * operaciones asociadas a dicha clase son:
 * • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
 * • Agregar los métodos getters y setters correspondientes
 * • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * •* Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual.
 * • *Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
 * se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 * pondrá el saldo actual en 0.
 * • *Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%.
 * • *Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * • *Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package _05_ejercicio;

import java.util.Locale;
import java.util.Scanner;

public class Principal05 {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opc;
        cuenta.crearCuenta();
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("1- INGRESAR SALDO");
            System.out.println("2- RETIRAR");
            System.out.println("3- EXTRACCION RAPIDA: solamente el 20% DE SU SALDO");
            System.out.println("4- CONSULTAR EL SALDO ACTUAL");
            System.out.println("5- CONSULTAR TODOS LOS DATOS DE LA CUENTA ");
            System.out.println("6- SALIR");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("INGRESE MONTO PARA INGRESAR A LA CUENTA");
                    cuenta.ingresar(teclado.nextDouble());
                    break;
                case 2:
                    System.out.println("INGRESE RETIRO DESEADO");
                    cuenta.retirar(teclado.nextDouble());
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 6:
                    System.out.println("CHAUUUUUUUUU!!");
                    break;
                default:
                    System.out.println("¡¡¡ERROR!!! NO INGRESO UN NUMERO CORRECTO");
                    break;

            }

        } while (opc != 6);

    }

}
