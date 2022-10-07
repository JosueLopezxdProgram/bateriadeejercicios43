package EjerciciosPracticos;
import java.util.*;

public class Numero_Mayor {
	
	public static void main (String args[]){
	
		//Ejercicio 3
		Scanner s = new Scanner(System.in);
	
	   int num1,num2,num3; 
	
	   System.out.println("Introduzca el primer numero:");
	   num1=s.nextInt();
	   
	   System.out.println("Introduzca el segundo numero:");
	   num2=s.nextInt();
	   
	   System.out.println("Introduzca el tercer numero:");
	   num3=s.nextInt();

	   if(num1>num2) {
			System.out.println("El numero "+num1+" es mayor a numero "+num2);
			
		}else if(num2>num1) {
			System.out.println("El numero "+num2+" es mayor a "+ num1);
		   }else {
				System.out.println("El numero "+num3+" es mayor a "+num2);
					
		   }
	}
}
