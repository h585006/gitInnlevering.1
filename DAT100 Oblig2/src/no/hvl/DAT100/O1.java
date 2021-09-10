package no.hvl.DAT100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		
		int lonn = Integer.parseInt(showInputDialog("Lønn:")); 
		double sats = 0;
		
		if (lonn <= 164100) {
			sats = 0.00;}
		
		else if ((lonn <= 230950) && (lonn >= 164101)) {
			sats = 0.93;}
		
		else if ((lonn <= 580650) && (lonn >= 230951)) {
			sats = 2.41;}
		
		else if ((lonn <= 934050) && (lonn >= 580651)) {
			sats = 11.52;}
		
		else if (lonn >= 934051) {
			sats = 14.52;}
		
		double lonnE = (lonn-(lonn*sats/100));
		
		System.out.println("Trinnskatt = " + sats + "%");
		System.out.println("Lønn etter skatt = " + lonnE);
		
	}
}
