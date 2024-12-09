package ED_04.Operadores_02;
import java.util.Scanner;
public class operadores {
    public static void main(String[] agrs) {
        Scanner Scanner = new Scanner (System.in); 

        //operadores aritmeticos
        int n1; 
        int n2; 
        int suma; 
        int resta;
        int multi;
        int division;
        int modulo;

        System.out.println("Ingresa el primer numero: ");
        n1= Scanner.nextInt(); 
        System.out.println("Ingresa el segundo numero: ");
        n2=Scanner.nextInt(); 

        suma= (n1+n2); //suma
        resta=(n1-n2); //resta
        multi=(n1*n2);//multiplicacion
        division=(n1/n2);//division
        modulo=(n1%n2); //residuo


        System.out.println("La suma de " +n1+ "+" +n2+ "= "+suma);
        System.out.println("La resta de " +n1+ "-" +n2+ "= "+resta);
        System.out.println("La multiplicacion de " +n1+ "*" +n2+ "= "+multi);
        System.out.println("La division de " +n1+ "/" +n2+ "= "+division);
        System.out.println("El residuro de "+n1+ "%" +n2+ "= "+modulo);
        
        Scanner.close();
    }
}
