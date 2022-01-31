/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor
, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package _01_ejercicio;

import java.util.Locale;
import java.util.Scanner;


public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int NumeroDePaginas ;

    public Libro() {
    }
    
    
    public Libro(int ISBN, String titulo, String autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    public void cargarLibro(){
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("---------CARGAR LIBRO-----------");
        
        System.out.println("Ingrese ISBN ");
        this.ISBN = teclado.nextInt();
        
        System.out.println("Ingrese el Titulo del libro");
        this.titulo = teclado.next();
        
        System.out.println("Ingrese el Autor del libro");
        this.autor = teclado.next();
        
        System.out.println("Ingrese el numero de paginas");
        this.NumeroDePaginas = teclado.nextInt();
    
    
    
    }
    
    
    public void mostrarLibro(){
        System.out.println("----------EL LIBRO CARGADO ES ----------------");
        System.out.println("El ISBN ES: "+this.getISBN());
        System.out.println("EL TITULO DEL LIBRO ES: "+this.getTitulo());
        System.out.println("EL AUTOR DEL LIBRO ES: "+this.getAutor());
        System.out.println("EL NUMERO DE PAGINAS ES DE: "+this.getNumeroDePaginas());
    
    
    }
    
    
    
    
    
}
