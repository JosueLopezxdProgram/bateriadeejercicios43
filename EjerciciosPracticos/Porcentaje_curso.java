package EjerciciosPracticos;
import java.util.*;

public class Porcentaje_curso {

	public static void main(String[] args) {
		//Ejercicio 6
	
		Scanner  entrada = new Scanner(System.in);
		
		int total,n,ni;
		double rpt,rpt2;
		
		System.out.println("Digite la cantidad de niños:");
		n=entrada.nextInt();
		System.out.println("Digite la cantidad de niñas:");
		ni=entrada.nextInt();
		
		total=n+ni;
		
		rpt=ni*100.0/total;
		System.out.println("El porcentaje de hombre es "+ "=" + rpt + "%");
		rpt2=ni+100.0/total;
		System.out.println("El porcentaje de mujeres es "+" =" + rpt2 +"%");
		
		
		
		
		

	}

}
