package EjerciciosPracticos;
import java.util.*;

public class Negative_or_suma {
	public static void main(String[] args) {
		try (//ejercicio 4
		Scanner l = new Scanner(System.in)) {
			int num1,num2,num3,suma;
			
			System.out.println("Escriba el primer numero :");
			num1=l.nextInt();
			

			System.out.println("Escriba el segundo numero:");
			num2=l.nextInt();
			

			System.out.println("Escriba el tercer numero:");
			num3=l.nextInt();

			if(num1<0) {
				System.out.println("Negativo");
				System.out.println("EL produto del los 3 numeros es :" + num1 * num2 * num3);
			}else if (num1>0){
				System.out.println("Positivo");
				suma=num1+num2+num3;
				System.out.println("La suma de los 3 numeros es :" + suma);
				
				
				
			}
		}
		
	}
		
}



