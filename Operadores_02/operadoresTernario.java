package ED_04.Operadores_02; 
import java.util.Scanner;
public class operadoresTernario {
    /*
     * Escribe un programa que use el operador terniario para determinar 
     * si un numero es par o impar
     */
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in); 

        int num; 

        System.out.println("Dime un numero y te dire si es par o impar: ");
        num= Scanner.nextInt(); 

        if (num%2==0) {
            System.out.println("El numero "+num+" es par");
            
        }else{
            System.out.println("El numero " +num+" es impar");
        }
        Scanner.close();
    }
}