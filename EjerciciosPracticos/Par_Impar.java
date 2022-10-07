package EjerciciosPracticos;
import java.util.Scanner;

public class Par_Impar {
	public static void main(String[] args) {
		//Ejercio 8 hay que modificarlo como pide el 9 vale x2
		Scanner  s = new Scanner(System.in);
		
		int num;
		
		
		
		System.out.println("Ingrese el numero a evaluar");
		num=s.nextInt();
		
		while(num<=0) {}
		
		if(num==0) {
			System.out.println("No es par ni impar");
              }
		
	     else if(num % 2 ==0) {
			System.out.println("Es un numero par" );
			
		}else {
			
			System.out.println("Es un numero impar" );
		 }
	
 		}
	}


