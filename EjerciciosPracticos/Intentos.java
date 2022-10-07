package EjerciciosPracticos;
import java.util.*;
public class Intentos {

	public static void main(String[] args) {
			//Ejercicio 15
		try (Scanner s = new Scanner(System.in)) {
			int intento ,clave = 161004,veces=0;
			
			
			
   do {
			System.out.println("Ingresa la clave");
			intento=s.nextInt();
			if( intento == clave) {
				System.out.println("Contrasena Correcta");
				System.out.println("Bienvendio usuario ");
				System.out.println("Fin del programa");
				veces=3;
				
			}else {
				System.out.println("Contraseña Incorrecta");
				
				veces = veces+1;
				if(veces ==3) {System.out.println("Lo sentimos ha sido bloquedo del sistema");
				
				}
			}
			
    }while(veces < 3);
		}
			
			
		}
	}


