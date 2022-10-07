package EjerciciosPracticos;

import java.util.Scanner;
public class Cuadrado_asterisco {
//Ejercicio 20
	public static int num;

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Ingrese el numero :");
		   num=s.nextInt();
		}
		
		
		
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		
		

	}

}
