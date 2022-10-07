package EjerciciosPracticos;
import java.util.*;
public class VoletoDeAvion {
	public static void main(String[] args) {
		//Ejercicio 27
		Scanner entrada = new Scanner(System.in);
		int distancia,estancia;
		double precio,descuento,pago,pago_final;
		
		System.out.println("Ingrese la distancia a recorrer :");
		distancia=entrada.nextInt();
        System.out.println("Ingrese los dias de estancia :");
        estancia=entrada.nextInt();
        
        pago= distancia *8.50;
        descuento= (pago*0.30) /100;
       
        
		if(distancia>1000 & estancia>7) {
			pago_final=pago - descuento;
		
				System.out.println("La aerolinea le otorga un descuento de el 30% :" + pago_final);
				
			}else {
				
				System.out.println("El pago es " + pago);
			}
		System.out.println("Gracias por usar el servicio de aerolinea");
		 
			
		}
	}


