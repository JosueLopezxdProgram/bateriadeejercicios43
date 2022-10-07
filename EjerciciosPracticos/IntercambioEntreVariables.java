package EjerciciosPracticos;
import java.util.*;
public class IntercambioEntreVariables {

	public static void main(String[] args) {
		//ejercicio 1
		
		Scanner entrada = new Scanner(System.in);
			int num1 , num2,aux;
			
			System.out.println("Introduce el primer numero :");
			num1=entrada.nextInt();
			
			System.out.println("Introduce el numero 2:");
			num2=entrada.nextInt();
			
			aux=num1;
			num1=num2;
			num2=aux;
			System.out.println("El valor de nuevo de la primera variable es : " + num1);
			
			System.out.println("El valor nuevo de la segunda variable es : " + num2);
			
		}
		
	   
	}


