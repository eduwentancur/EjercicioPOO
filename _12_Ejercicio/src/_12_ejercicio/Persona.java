
package _12_ejercicio;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Persona {
    
    private String nombre;
    private Date fechaNacimiento = new Date() ;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    
    public void crearPersona(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("NOMBRE?");
        this.nombre=teclado.next();
        System.out.println("INGRESE SU FECHA DE NACIMIENTO");
        System.out.println("AÑO");
        fechaNacimiento.setYear(teclado.nextInt());
        System.out.println("MES");
        fechaNacimiento.setMonth(teclado.nextInt());
        System.out.println("dia");
        fechaNacimiento.setDate(teclado.nextInt());
        
        
        
        
    }
    
    
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
    
    public void calcularEdad(){
        
        Date fechaActual = new Date();
        int diferencia;
        diferencia = fechaActual.getYear()-fechaNacimiento.getYear()+1900;
        if (fechaActual.getDay()<fechaNacimiento.getDay()){
            diferencia--;
            
        }else{
            if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
                diferencia--;
            }
        
        }
        
        
        System.out.printf("La edad que tiene usted es de %d",diferencia);
        System.out.println("");
        
        
    
    
    }
    
  
    
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
    
    public boolean menorQue(int edad){
        Date fechaActual = new Date();
        int diferencia;
        diferencia = fechaActual.getYear()-fechaNacimiento.getYear()+1900;
        if (fechaActual.getDay()<fechaNacimiento.getDay()){
            diferencia--;
            
        }else{
            if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
                diferencia--;
                
            }
        
        }
        
        return edad<diferencia;
            
    
    }
    
    
    
    
    
    
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
    
    public void mostrarPersona(){
        System.out.printf("La persona llamada %s nacio el %d %d %d",this.nombre,this.fechaNacimiento.getDate(),fechaNacimiento.getMonth(),fechaNacimiento.getYear() );
        
    
    
    }
    
    
    
        
    
}
