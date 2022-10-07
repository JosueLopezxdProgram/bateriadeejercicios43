package EjerciciosPracticos;
import java.util.*;
public class Notas {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Ejercicio 19
		
		String alumno;
	    double np,npro,nteorica,notaFinal;
	    
	    System.out.println("Escriba el nombre del alumno :");
	    alumno=s.nextLine();
      
      while(!alumno.equals("")) {
    	  System.out.println("Introduzca la nota practica :");
    	  np=s.nextDouble();
    	  System.out.println("Introduzca la nota de problemas :");
    	  npro=s.nextDouble();
    	  System.out.println("Introduzca la nota teorica :");
    	  nteorica=s.nextDouble();
    	  
    	  if((np<=10 &&np>=0 ) && (npro<=10 && npro>=0) && (nteorica<=10 && nteorica>=0)) {
    		  
    		  System.out.println("La nota practica es :" + np);
    		  System.out.println("La nota de problemas es :" + npro);
    		  System.out.println("La nota teorica es :" +  nteorica);
    		  np=np*0.1;
    		  npro=npro*0.5;
    		  nteorica=nteorica*0.4;
    		  notaFinal=np+npro+nteorica;
    		  System.out.println("La nota final es :" + notaFinal);

    	  }else {
    		  System.out.println("....Error has escrito una nota incorrecta....");
    		  System.out.println("Introduce el nombre otro alumno :");
    		  alumno=s.nextLine();
        	  
    		 
    	  }
    	 
    	  }
     
	  }
}
	 
	

	

