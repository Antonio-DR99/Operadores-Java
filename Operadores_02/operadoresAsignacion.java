package ED_04.Operadores_02;
import java.util.Scanner;

/*
 * usa cada operador de asignacion para modificar el valor de x y muestra 
 * el resultado despues de cada operacion
 */
public class operadoresAsignacion {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 

        int n1; 
        int n2; 

        System.out.println("Introduce el primer numero: ");
        n1=Scanner.nextInt(); 
        System.out.println("Introduce el segundo numero: ");
        n2=Scanner.nextInt(); 

        //operador+=
        n1+=n2; 
        System.out.println("El resultado es: "+n1);

        //operador-=
        n1-=n2; 
        System.out.println("El resultado es: "+n1);

        //operador*=
        n1*=n2; 
        System.out.println("El resultado es: "+n1);

        //operador /=
        n1/=n2;
        System.out.println("El resultado es: "+n1);

        //operador %=
        n1%=n2;
        System.out.println("El resultado es: "+n1);

        Scanner.close();
    }

}
