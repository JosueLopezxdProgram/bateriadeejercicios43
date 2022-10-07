package EjerciciosPracticos;
import java.util.*;
public class Gasolinera {
  //Ejercicio 41
	public static void main(String[] args) {

		Scanner l = new Scanner (System.in);
           int Menu;  
           
           double monto_a_pagar;
           int cantidad;
           
           
           
           double gasolinaRegular=32.85,GasolinaSuper=33.48,Diesel=28.45;//C$
           System.out.println("Bienvenido a la Gasolinera puma");
           System.out.println("¿  Que tipo de gasolina ingresara a su vehiculo ?");
           System.out.println("1.Gasolina Regular");
           System.out.println("2.Gasolina super");
           System.out.println("3.Diesel");
        
          
          Menu=l.nextInt();
         
          
           switch(Menu) {
           
           case 1:
        	   System.out.println("Ingrese la cantidad de combustible en litros :");
        	   cantidad = l.nextInt();
        	   monto_a_pagar=cantidad*gasolinaRegular;
        	   System.out.println("El monto a pagar es de C$:" +  monto_a_pagar );
        	   break;
        	   
           case 2:
        	   System.out.println("Ingrese la cantidad de combustible en litros :");
        	   cantidad=l.nextInt();
        	   monto_a_pagar=cantidad*GasolinaSuper;
        	   System.out.println("El monto a pagar es de C$:" + monto_a_pagar);
        	   break;
        	   
           case 3:
        	   System.out.println("Ingrese la cantidad de combustible en litros :");
        	    cantidad=l.nextInt();
        	   monto_a_pagar=cantidad*Diesel;
        	   System.out.println("El  monto a pagar es de  C$:" +  monto_a_pagar);
        	   break;
           }           
          }
	       
	     
	}
	


