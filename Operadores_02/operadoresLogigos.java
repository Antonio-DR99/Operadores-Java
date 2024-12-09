package ED_04.Operadores_02;
import java.util.Scanner;
public class operadoresLogigos {
    /*
     * Crea un programa que evalue se una persona es elegible para votar. 
     * Para ser elegible, debe tener al menos 18 años y ser ciudadano.
     */
    public static void main (String[] agrs){
        Scanner Scanner = new Scanner (System.in); 

        int age; 

        boolean ciudadano= true; 

        System.out.println("Dime tu edad y te dire si puedes votar o no: ");
        age= Scanner.nextInt(); 

        if (age>18 && ciudadano) {
            System.out.println("Puedes Votar!");
            
        }else{
            System.out.println("No puedes VOTAR!");
        }

        Scanner.close();
    }
    
}
