package EjerciciosPracticos;

import java.util.Scanner;

public class Suma_NumerosPares {
	
	public static int SumarPares(int numero) {
		//Ejercicio 13
		if(numero==0) {
			return 0;
			
		}
		if(numero%2==0) {
			return numero+SumarPares(numero - 1);
		}else {
			return SumarPares(numero  - 1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero :");
		int numero=s.nextInt();
		System.out.println("La suma de los N primeros numeros pares es : " + SumarPares(numero));
		
	}
}