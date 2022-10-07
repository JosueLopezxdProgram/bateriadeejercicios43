package EjerciciosPracticos;
import java.util.*;
public class Fechas {
	
	public static String fecha;

	public static void main(String[] args) {
		//Ejercicio 18
		
		try (Scanner entrada = new Scanner(System.in)) {
			int dia,mes,año;
			System.out.println("Introduzca el primer numero :");
			dia=entrada.nextInt();
			
			System.out.println("Introduzca el segundo numero :");
			mes=entrada.nextInt();
			
			System.out.println("Introduzca el tercer numero :");
			año=entrada.nextInt();
			
			if((dia>=1) && (dia<=30)) {
				if((mes>=1) && (mes<=12)){
					if(año>0) {
						System.out.println("Fecha correcta");
						System.out.println("1 de febrero de 2021");
						
							
					} 
					
					else{
						System.out.println("Error fecha incorrecta,dia incorrecto");
							
						}
						
						
					}
					
				else {
					System.out.println("Error fecha incorrecta,mes incorrecto");
					
				}

				}
			else {
				System.out.println("Error fecha incorrecta,año incorrecto");
			}
		}
 	
		}
					
	
	}
			
			
			

	

		
	
	




