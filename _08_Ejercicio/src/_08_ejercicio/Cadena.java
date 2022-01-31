/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package _08_ejercicio;


public class Cadena {
    
    private String unaFrase ;
    private int longitudFrase ; 

    public Cadena() {
    }

    public Cadena(String unaFrase, int longitudFrase) {
        this.unaFrase = unaFrase;
        this.longitudFrase = longitudFrase;
    }

    public String getUnaFrase() {
        return unaFrase;
    }

    public void setUnaFrase(String unaFrase) {
        this.unaFrase = unaFrase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
//    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada
    
    public void mostrarVocales(){
        int contadorDeVocales=0;
       
        
        for (int i = 0; i < this.longitudFrase; i++) {
            if (this.unaFrase.toLowerCase().charAt(i)== 'a' || this.unaFrase.toLowerCase().charAt(i)== 'e' || this.unaFrase.toLowerCase().charAt(i)== 'i' || this.unaFrase.toLowerCase().charAt(i)== 'o' || this.unaFrase.toLowerCase().charAt(i)== 'u' ){
                contadorDeVocales++;
            
            }
 
        }
        
        System.out.printf("La cantidad de vocales de la frase son %d ",contadorDeVocales);
        System.out.println();
    
    }
    
//    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(){
        String cadenaInvertida="" ; 
        
        for (int i= this.getLongitudFrase()-1 ; i >= 0; i--) {
            
            cadenaInvertida += this.unaFrase.charAt(i);

            
        }
        
        System.out.printf("La cadena invertida de la frase %s es : %s ",this.unaFrase,cadenaInvertida);
        System.out.println();
    
    
    }
    
//    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    
    public void vecesRepetido(String letra){
        int contadorLetra=0 ; 
        
        for (int i = 0; i < this.getLongitudFrase(); i++) {
            
            if (this.getUnaFrase().substring(i,i+1).equals(letra)){
                contadorLetra++;
                
                
            
            
            }
            
            
            
        }
        
        System.out.printf("En la frase %s el caracter %s se repite %d ",this.getUnaFrase(),letra,contadorLetra);
        System.out.println();
    }
    
//    Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(String frase){
        
        if (this.getLongitudFrase()==frase.length()) {
            System.out.printf("La longitud de las frase %s y la de frase %s son iguales",this.getUnaFrase(),frase);
            
            
        }else{
             if (this.getLongitudFrase()>frase.length()){
                 System.out.printf("La longitud de la frase %s es mayor que la de %s",this.unaFrase,frase);
            
            
            }else{
                 if (this.getLongitudFrase()<frase.length()) {
                     System.out.printf("La longitud de la frase ingresa es mayor que la frase %s ",this.unaFrase);
                 }
             
             }
                 
        
        }
    
        System.out.println();
    
    }
    
       //    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    
    public void unirFrases(String frase){
        
        System.out.println("EL RESULTADO DE LAS FRASES UNIDAS: "+this.getUnaFrase()+frase);
        
    
    
    }
    
    //    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y
    //mostrar la frase resultante.
    
    public void reemplazar(String letra){
        String fraseResultante=this.getUnaFrase().replace("a", letra);
        System.out.printf("LA FRASE REMPLAZADA ES : %S",fraseResultante);
        System.out.println("");
    }
    
    

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no
    
    
    public boolean contiene(String letra){
        
        return this.getUnaFrase().contains(letra);
        
        
        
        
    
    }
    
    
    
    
    
    
        
        
        
        
        
    }
    
    
    
    
        
        
        
    
    

    



