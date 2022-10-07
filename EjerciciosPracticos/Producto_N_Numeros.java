package EjerciciosPracticos;
import java.util.Scanner;

public class Producto_N_Numeros {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		//Ejercicio 26
		
		int Producto=1,N;
		System.out.println("Ingrese N numeros :");
		N=e.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(i + "");
			Producto*=i;
			
		}
		System.out.println("\nProducto de " + N + " :" + Producto);
	
		
	}

}
