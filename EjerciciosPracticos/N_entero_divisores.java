package EjerciciosPracticos;

import java.util.Scanner;

public class N_entero_divisores {
	//Ejercicio 31
  public static final int N = 0;

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);	
		
	do {
		
			System.out.println("\nIntroduzca un numero N :");
			int N=lector.nextInt();
		
		for (int i = 1; i <N; i++) {
				
		
		
		if(N%i==0) 
			System.out.print(i + " ");
			
		}
	    }while(N<1);
	}
	

}
