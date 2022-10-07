package EjerciciosPracticos;

import java.util.Scanner;

public class X_positivo_negativo {
	//Ejercicio 35
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int x;
		double p1, p2, p3, pf;
		System.out.println("Asigne un  valor a x :" );
		x=lec.nextInt();
		if(x>0) {
			p1=Math.pow((x-2), 2)/2;
			p2=Math.pow((x-4), 4)/4;
			p3=Math.pow((x-6), 6)/6;
			pf=p1+p2+p3;
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("F(X)=(x-2)^2/2+(x-4)^4/4+(x-6)^6/6="+String.format("%.2f",pf));
		}else {
			p1=Math.pow((x+2), 2)/2;
			p2=Math.pow((x+4), 4)/4;
			p3=Math.pow((x+6), 6)/6;
			pf=p1+p2+p3;
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("F(X)=(x-2)^2/2+(x-4)^4/4+(x-6)^6/6="+String.format("%.2f",pf));
		}
	}

	}


