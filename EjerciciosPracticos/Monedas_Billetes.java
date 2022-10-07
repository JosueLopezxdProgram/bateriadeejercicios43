package EjerciciosPracticos;
import javax.swing.JOptionPane;

public class Monedas_Billetes {

    public static void main (String[] args) {
    	//Billetes
        int Diez=10, cien=100, veinte=20, Dociento=200, cinco=5,Quiniento=500, Mil=1000,cincuenta=50;
        //monedas
        int cantidad_de_cordobas ,moneda=5,uno=1, centavo=25,Centavo=50;
        cantidad_de_cordobas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una cantidad de córdobas"));
        uno=cantidad_de_cordobas;
        Quiniento=(uno-uno%500)/500;
        uno=uno%500;
        Dociento=(uno-uno%200)/200;
        uno=uno%200;
        cien=(uno-uno%100)/100;
        uno=uno%100;
        cincuenta=(uno-uno%50)/50;
        uno=uno%50;
        veinte=(uno-uno%20)/20;
        uno=uno%20;
        Diez=(uno-uno%10)/10;
        uno=uno%10;
        cinco=(uno-uno%5)/5;
        uno=uno%5;
        Mil=(uno-uno%5)/1000;
        uno=uno%1000;
        moneda=(uno-uno%5)/5;
        uno=uno%5;
        uno=(uno-uno%1)/1;
        uno=uno%1;
        centavo=(uno-uno%25)/25;
        uno=uno%25;
        Centavo=(uno-uno%50)/50;
        uno=uno%50;
        JOptionPane.showMessageDialog(null,
            "Devolucion con billetes de 10: " + Diez+ "\n" +
            "Devolucion de billetes de 100: " + cien+ "\n" +
            "Devolucion de billetes de 20: " + veinte + "\n" +
            "Devolucionde billetes de 200: " + Dociento + "\n" +
            "Devolucionde billetes de 5: " + cinco + "\n" +
            "Devolucion de billetes de 50: " + cincuenta+ "\n" +
            "Devolucion de billetes de 500: " + Quiniento + "\n" +
            "Devolucion de monedas de 1: " + Mil + "\n" +
            "Devolucion de monedas de cinco: " + moneda + "\n" +
            "Devolucion de monedas de uno : " + uno + "\n" +
            "Devolucion de monedas de 25 centavos: " + centavo +"\n" +
            "Devolucion de monedas de 50 centavos: " + Centavo + "\n" );
    }

}