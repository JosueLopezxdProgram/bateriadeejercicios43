package EjerciciosPracticos;
import java.util.*;
public class SeaFitYa {
	//Ejercicio 43

	public static void main(String[] args) {
		double pesoIdeal;
		double Altura;
		int num;
		String name;
		Scanner s = new Scanner(System.in);
		
	
		System.out.println("BIENVENIDO A SeaFitYa S.A");
		System.out.println("Calculemos su peso ideal para ofrecerles un producto");
		System.out.println("Según su peso ideal le podemos ofrecer este excelente producto");
		 
		System.out.println("Ingrese el nombre de un cliente :");
	    
		name=s.nextLine();
		
        System.out.println("Digite el peso del cliente  : Kg");
        pesoIdeal=s.nextInt();	
        System.out.println("Digite la altura del cliente : cm" );
        Altura=s.nextDouble();
        
        System.out.println("Ingrese el num de un cliente :");
        num=s.nextInt();
  
	
      
      if(pesoIdeal==20) {
    	  System.out.println("La pesrsona es delgada");
    	 
      }
      if(pesoIdeal>20 & pesoIdeal<23) {
    	  System.out.println("La pesrsona es de peso normal");
    	 
         
      }
      if(pesoIdeal>=23 && pesoIdeal<=26) {
    	  System.out.println("La persona tiene sobrepeso");
    	 
    	
         
    	  
      }
      if(pesoIdeal>26) {
    	  System.out.println("La persona es obesa");
    	 
         
      }
      
      System.out.println("El nomnbre del cliente es " +  name);
      System.out.println("El numero del cliente es :" + num);
      pesoIdeal=(double) (pesoIdeal/Math.pow(Altura,2));
      System.out.println("Su peso ideal es : Kg " + String.format("%.2f", pesoIdeal));
	
          
      }
     
	}

