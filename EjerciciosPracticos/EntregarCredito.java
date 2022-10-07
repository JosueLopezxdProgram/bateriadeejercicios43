package EjerciciosPracticos;
import java.util.*;
public class EntregarCredito{
	
	public static void main(String[] args) {
		

		try (Scanner entrada = new Scanner(System.in)) {
			int sueldo;
			 
			 
			 double montoCredito=0,montoCredito2=500000,MontoCredito3=2000000;
			 System.out.println("....Entregar credito....");
			 
			
			 
			
				   System.out.println("Digite su sueldo :");
				 sueldo=entrada.nextInt();
						 
				
			 if(sueldo<200000 ) {
				 System.out.println("Monto de derecho a credito  es de C$ :" + montoCredito);
				 
				
				 
			 }
					
			 else if (sueldo>=200000 && sueldo<=500000){
				 System.out.println("Monto de derecho a credito es de C$ :" +  montoCredito2);
				
			 }
					 
			 else if(sueldo>=500000 && sueldo<=1000000) {
				 System.out.println("Monto de derecho a credito es de C$ : " + MontoCredito3);
				
				 
			 }
		}
	}
	}

	



	

