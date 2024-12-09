package ED_04.Operadores_02;
import java.util.Scanner;

public class operadoresRelacionales {
    /*
     Escribe un programa que campara dos numeros y determine si: 
     1 El primer nuemro es mayor que el segundo.
     2 El primer numero es menor que el segundo.
     3 Ambos numeros son iguales.
     */
    public static void main (String[] agrs){
        Scanner Scanner = new Scanner (System.in); 

        int n1;
        int n2; 

        System.out.println("Dime el primer numero: ");
        n1=Scanner.nextInt(); 
        System.out.println("Dime el segundo numero: ");
        n2=Scanner.nextInt(); 

        if (n1<n2) {
            System.out.println("El primer numero es menor que el segundo numero");
            
        }else if (n1>n2) {
            System.out.println("El primer numero es mayor que el segundo numero");
            
        }else{
            System.out.println("Los dos numeros son iguales");
        }

        Scanner.close();
    }
}
