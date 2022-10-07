package EjerciciosPracticos;
import java.util.*;
public class Ecuacion_de_segundo_grado {

	public static void main(String[] args) {
		double a,b,c;
		double raiz1,raiz2;
		//Ejercicio 24
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese el valor de a ");
			a=sc.nextDouble();
			System.out.println("Ingrese el valor de  b");
			b=sc.nextDouble();
			System.out.println("Ingrese el valor de c");
			c=sc.nextDouble();
		}
		if((4*a*c) > (b*b)) {
			System.out.println("Las raices son imaginarias");
			
		}else if(a>0 || a<0) {
			double temporal =(b*b)-4*a*c;
			raiz1=-b+ Math.pow(temporal, 0.5);
			raiz1=raiz1/(2*a);
			raiz2 =((-b)-(Math.pow(temporal,0.5)))/(2*a);
			System.out.println("La primera raiz es :" +raiz1);
			System.out.println("La segunda raiz es :" +raiz2);
			
		}
		

	}
	
}

