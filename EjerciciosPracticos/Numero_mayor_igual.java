package EjerciciosPracticos;

import java.util.*;

public class Numero_mayor_igual {
	
	public static void main(String[] args) {
		//Ejercicio 2
		
		try (Scanner lector = new Scanner(System.in)) {
			int n1=0,n2=0;
			System.out.println("Digite su primer valor :");
			n1=lector.nextInt();
			System.out.println("Digite su segundo valor :");
			n2=lector.nextInt();
			
			if(n1==n2) {
				System.out.println("El numero "+n1+" es igual a numero "+n2);
				
			}else if(n1>n2) {
				System.out.println("El numero "+n1+" es mayor a n2");
			}else {
				System.out.println("El numero "+n2+" es mayor a "+n1);
					
  }
		}
	}
}
