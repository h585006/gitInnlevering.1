package no.hvl.DAT100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		
		int poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
		int elevnr = 1;
		String karakter;
		
		for (int i = 1; i <= 9; i ++) {
		
		if ((poengsum < 0) || (poengsum > 100)) {
		
			poengsum = Integer.parseInt(showInputDialog("Poengsummen kan ikke være mindre enn null eller mer enn 100. Poengsum:"));
			i = elevnr;
			
		} if ((poengsum > 0) && (poengsum <=39)) {
			karakter = ("F");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
		
		} if ((poengsum > 39) && (poengsum <=49)) {
			karakter = ("E");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
		
		}if ((poengsum > 49) && (poengsum <=59)) {
			karakter = ("D");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
			
		}if ((poengsum > 59) && (poengsum <=79)) {
			karakter = ("C");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
			
		}if ((poengsum > 79) && (poengsum <=89)) {
			karakter = ("B");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
			
		}if ((poengsum > 89) && (poengsum <= 100)){
			karakter = ("A");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			poengsum = Integer.parseInt(showInputDialog("Poengsum:"));
			elevnr ++;
		}
		}
		if ((poengsum < 0) || (poengsum > 100)) {
			
			poengsum = Integer.parseInt(showInputDialog("Poengsummen kan ikke være mindre enn null eller mer enn 100. Poengsum:"));
			
			
		} if ((poengsum > 0) && (poengsum <=39)) {
			karakter = ("F");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
		
			
		
		} if ((poengsum > 39) && (poengsum <=49)) {
			karakter = ("E");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			
		
		
		}if ((poengsum > 49) && (poengsum <=59)) {
			karakter = ("D");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
		
			
			
		}if ((poengsum > 59) && (poengsum <=79)) {
			karakter = ("C");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			
			
			
		}if ((poengsum > 79) && (poengsum <=89)) {
			karakter = ("B");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			
			
			
		}if ((poengsum > 89) && (poengsum <= 100)){
			karakter = ("A");
			String ut = ("Elev nummer: "  + elevnr + " fikk karakteren " + karakter);
			showMessageDialog(null,ut);
			
			
	}
	}
}