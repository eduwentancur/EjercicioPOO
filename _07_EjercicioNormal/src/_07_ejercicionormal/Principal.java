/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
 * en distintas variables, para después en el main, calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores.
 */
package _07_ejercicionormal;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        boolean mayorEdad;
        double imc, debajoSuPeso =0, pesoIdeal=0, sobrePeso=0,mayores = 0 , menores = 0;
       
        persona1.crearPersona();
        imc = persona1.calcularIMC();
        mayorEdad = persona1.esMayorDeEdad();
        if (imc == -1){
            System.out.println("USTED ESTA POR DEBAJO DE SU PESO IDEAL ");
            debajoSuPeso++;
            System.out.println(debajoSuPeso);
        }else {
            if (imc == 0){
                System.out.println("USTED TIENE EL PESO IDEAL");
                pesoIdeal++;
            }else{
                if (imc==1){
                System.out.println("USTED TIENE SOBRE PESO ");
                sobrePeso++;
                }
               
            
            }
        }
    
        if (mayorEdad){
            System.out.println("USTED ES MAYOR DE EDAD");
            mayores++;
        }else{
            System.out.println("USTED ES MENOR DE EDAD");
            menores++;
         }
            
      
        persona2.crearPersona();
        imc = persona2.calcularIMC();
        mayorEdad = persona2.esMayorDeEdad();
        if (imc == -1){
            System.out.println("USTED ESTA POR DEBAJO DE SU PESO IDEAL ");
            debajoSuPeso++;
        }else {
            if (imc == 0){
                System.out.println("USTED TIENE EL PESO IDEAL");
                pesoIdeal++;
            }else{
                if (imc==1){
                System.out.println("USTED TIENE SOBRE PESO ");
                sobrePeso++;
                }
               
            
            }
        }
        
        if (mayorEdad){
            System.out.println("USTED ES MAYOR DE EDAD");
            mayores++;
        }else{
            System.out.println("USTED ES MENOR DE EDAD");
            menores++;
        }
        
        
        persona3.crearPersona();
        imc=persona3.calcularIMC();
        mayorEdad=persona3.esMayorDeEdad();
        if (imc == -1){
            System.out.println("USTED ESTA POR DEBAJO DE SU PESO IDEAL ");
            debajoSuPeso++;
        }else {
            if (imc == 0){
                System.out.println("USTED TIENE EL PESO IDEAL");
                pesoIdeal++;
            }else{
                if (imc==1){
                System.out.println("USTED TIENE SOBRE PESO ");
                sobrePeso++;
                }
               
            
            }
        }
        
        if (mayorEdad){
            System.out.println("USTED ES MAYOR DE EDAD");
            mayores++;
        }else{
            System.out.println("USTED ES MENOR DE EDAD");
            menores++;
         }
        
        persona4.crearPersona();
        imc=persona4.calcularIMC();
        mayorEdad=persona4.esMayorDeEdad();
        if (imc == -1){
            System.out.println("USTED ESTA POR DEBAJO DE SU PESO IDEAL ");
            debajoSuPeso++;
        }else {
            if (imc == 0){
                System.out.println("USTED TIENE EL PESO IDEAL");
                pesoIdeal++;
            }else{
                if (imc==1){
                System.out.println("USTED TIENE SOBRE PESO ");
                sobrePeso++;
                }
               
            
            }
        }
        
        if (mayorEdad){
            System.out.println("USTED ES MAYOR DE EDAD");
            mayores++;
        }else{
            System.out.println("USTED ES MENOR DE EDAD");
            menores++;
        }
        
        
//        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
// * en distintas variables, para después en el main, calcular un porcentaje de esas 4
// * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
// * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
// * cuantos menores.

        debajoSuPeso = debajoSuPeso/4 *100;
        pesoIdeal = pesoIdeal/4 * 100;
        sobrePeso = sobrePeso/4 * 100;
        mayores = mayores/4 *100;
        menores = menores/4 *100;
        
        System.out.printf("EL PORCENTAJE DE LAS PESONAS QUE ESTAN DEBAJO DE SU PESO IDEAL: %.0f %%\n "+debajoSuPeso);
        System.out.printf("EL PORCENTAJE DE LAS PESONAS QUE ESTAN EN SU PESO IDEAL: %.0f %%\n"+pesoIdeal );
        System.out.printf("EL PORCENTAJE DE LAS PESONAS QUE ESTAN SOBREPESO: %.0f %%\n"+sobrePeso );
        System.out.printf("EL PORCENTAJE DE LAS PESONAS QUE SON MAYORES DE EDAD: %.0f %%\n"+mayores );
        System.out.printf("EL PORCENTAJE DE LAS PESONAS QUE SON MENORES DE EDAD: %.0f %%\n"+menores+"%");
        
        
    }   
    
    
    
    
    
    
    
    

}
