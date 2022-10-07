package EjerciciosPracticos;

import java.util.Scanner;
public class Arreglo {

	public static void main(String[] args) {
		//Ejercicio 30
		
		try (Scanner s = new Scanner(System.in)) {
			int  []arreglo;
			int numero;

			boolean creciente = true;
			
			arreglo = new int[10];
			
			do {
				System.out.println("Relle el arreglo");
				for (int i = 0; i < 10; i++) {
					System.out.println(1+".Digite un numero :" );
					arreglo[i]=s.nextInt();
					
				}
				for(int i =0;i<10;i++) {
					if(arreglo[i] < arreglo[i+1]) {
					 creciente = true;
						break;
						
					}
					if(arreglo[i] > arreglo[i+1]) {
						 creciente = false;
						break;
						
					}
					
				}
				if(creciente == false) {
					System.out.println("\n El arreglo esta desordenado,digite nuevaamente : \n" );
					
				}
			}while(creciente == false);
			System.out.print("\nDigite el numero a buscar en el arreglo :\n");
			numero=s.nextInt();
			
			int i=0;
			while(i<10 && arreglo[i]<numero) {
				i++;
				
			}
			if (i==10) {
				System.out.println("\nNumero no encontrado");
				
			}
			else if (arreglo[i] ==numero){
				System.out.println("El numero a sido encontrado en la posicion " + i);
			
				
			}
			else {
				System.out.println("\n Num no encontrado");
			}
		}
		
	}
	

}
