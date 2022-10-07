package EjerciciosPracticos;

import java.util.Scanner;

public class Max_comun_divisor {
	//Ejercicio 32
	
	public static int MCD(int x,int y) {
		if( x % y == 0) {
			return y;
		}else {
			return MCD(y , x % y);
		}
	}
	
	public static void main(String[] args) {
	
		Scanner l =  new Scanner(System.in); 
		
		int x,y;
	
		System.out.println("Ingrese el primero numero :");
	
		x=l.nextInt();
	
	
		System.out.println("Ingrese el segundo numero :");

		y=l.nextInt();
	
	
		System.out.println("El maximo comun divisior es : " +  MCD(x,y));
		
  
  
		

	}
	
}

