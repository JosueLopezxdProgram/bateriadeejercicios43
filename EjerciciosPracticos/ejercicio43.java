package EjerciciosPracticos;


import java.util.*;

public class ejercicio43 {
	public static void main(String[] args) {

		ArrayList delList=new ArrayList();
		
		Scanner lec=new Scanner(System.in);
		int  PesoIdeal,a;
		String nombre;
		double altura;
	    int telefono;
		char respuesta;
		char s= 's' ;
		System.out.println("Bienvenidos a SeaFitYa S.A.");
		a=0;
		do {
			a=a+1;
			System.out.println("Cual es su nombre?");
			nombre=lec.nextLine();
			System.out.println("Porfavor, ingrese su numero telefonico");
			telefono=lec.nextInt();
			System.out.println("Cual es su altura?");
			altura=lec.nextDouble();
			System.out.println("Cual es su peso?");
			PesoIdeal=(int) lec.nextDouble();

			if(PesoIdeal==20) {
				delList.add(
				" "+"Nombre de cliente n1"+a+":"+nombre+" - "
				+"Numero de telefono:"+telefono+" - "
				+"Altura:"+altura+" - "
				+"Peso:"+PesoIdeal+" ");

				System.out.println("La persona es delgada");
			}if(PesoIdeal>20 || PesoIdeal<23) {
				delList.add(
						" "+"Nombre de cliente n1"+a+":"+nombre+" - "
						+"Numero de telefono:"+telefono+" - "
						+"Altura:"+altura+" - "
						+"Peso:"+PesoIdeal+" ");
				
				System.out.println("La persona es de peso normal");
			}if(PesoIdeal>=23 || PesoIdeal<=26) {
				System.out.println("La person tiene sobrepeso ");
				delList.add(
						" "+"Nombre de cliente n1"+a+":"+nombre+" - "
						+"Numero de telefono:"+telefono+" - "
						+"Altura:"+altura+" - "
						+"Peso:"+PesoIdeal+" ");
				
			}if(PesoIdeal>26) {
				System.out.println("La persona es obesa");
				delList.add(
						" "+"Nombre de cliente n1"+a+":"+nombre+" - "
						+"Numero de telefono:"+telefono+" - "
						+"Altura:"+altura+" - "
						+"Peso:"+PesoIdeal+" ");
				
			}

			
			
			System.out.println("Agregara otro cliente?");
			respuesta=lec.next().charAt(0);
		}while(respuesta == s);
		System.out.print(delList);

		PesoIdeal=(int) (PesoIdeal/Math.pow(altura,2));
	      System.out.println("Su peso ideal es : Kg " + String.format("%.2f", PesoIdeal));
		
	    
	}

}
