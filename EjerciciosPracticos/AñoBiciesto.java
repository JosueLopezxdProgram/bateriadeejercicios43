package EjerciciosPracticos;

import java.util.Scanner;

public class AñoBiciesto {
int año;
	
	Scanner s = new Scanner(System.in);
	
	  public void entradaño() {
		  //Ejercicio 22
		  System.out.println("Metodo para determinar si el año es biciesto o no");
		  System.out.println("Ingrese el año a evaluar :");
		  año=s.nextInt();
		  
		  
		if((año % 4==0) && (año % 100 !=0 || año % 400 ==0)) {
			  System.out.println("Es un año biciesto " + año);
		  }
		else {
			System.out.println("No es un año biciesto " + año);
		}
		  
	  } 
	  
      public static void main(String[] args) {
    	  AñoBiciesto fc = new AñoBiciesto();
    	  fc.entradaño();
    	  fc.proceso();
	
	
   }

	public void proceso() {
		
		
	}

	}
	
		
	

