package EjerciciosPracticos;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		//Ejercio_23
		try (Scanner s = new Scanner(System.in)) {
			double Bocadillodejamon=1.5;
			 double Refresco=1.05 ;
			 double Cerveza=0.75;
			 

				System.out.println("Menu del restaurante");
				
				System.out.println("Ingrese la cantidad de Boacadillos de jamón :");
				Bocadillodejamon=s.nextDouble();
				System.out.println("Ingrese la catidad de Refrescos :");
				Refresco=s.nextDouble();
				System.out.println("Ingrese la cantidad de cerveza :");
				Cerveza=s.nextDouble();
			
			
			double TotalDeLacuenta = Bocadillodejamon*1.5 + Refresco * 1.05 + Cerveza * 0.75;
   
			System.out.println("El total de la cuenta es :" + TotalDeLacuenta);
		}
	}

}


