package cekt;
import java.util.Scanner;

public class daysInMonth {

    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int monat = 0;
        int jahr = 0;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Monat ein [1-12]: ");
        try{monat= scan.nextInt();}catch (Exception e){}
        System.out.println("Bitte geben Sie das Jahr ein: ");
        try{jahr= scan.nextInt();}catch (Exception e){}
       
        //Berechnung des Schaltjahrs
        int schaltjahr;
        schaltjahr = 0;
        
        if ((((jahr % 4) == 0 && (jahr % 100) != 0)) || ((jahr % 400 == 0))) {
        	schaltjahr = 1;
        }
       
        if ((monat == 4) || (monat == 6) || (monat == 9) || (monat == 11)) {
        	System.out.println("Der Monat hat 30 Tage.");
        }
        else if ((monat == 1) || (monat == 3) || (monat == 5) || (monat == 7) || 
                 (monat == 8) || (monat == 10) || (monat == 12)) {
        	System.out.println("Der Monat hat 31 Tage.");
        } 
        else if (monat == 2) {
        	System.out.println("Der Monat hat " + (28 + schaltjahr) + " Tage.");
        }
	}
}
