package EjerciciosPracticos;
import java.util.*;
public class Cicloformativo {

	public static void main(String[] args) {
		//Ejercicio 10
	
   	try (Scanner entrada = new Scanner(System.in)) {
		int TituloBachiller_o_pruebaDeadmision;
		System.out.println("¿Tiene titulo de bachiller?");
		TituloBachiller_o_pruebaDeadmision=entrada.nextInt();
		
		  
		  if ( TituloBachiller_o_pruebaDeadmision>= 1) {
			  
			  System.out.println("Usted puede cursar un grado superior");
			  
		  }
		  
		  else if (TituloBachiller_o_pruebaDeadmision<1) {
			  
			  System.out.println("Puede optar a realizar una prueba de admision");
			  
		  }
	}
	  
	  
	
		

}
 
}
    	

	


