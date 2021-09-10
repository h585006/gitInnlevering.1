package no.hvl.DAT100;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	
	static int fakultet (int n) {
		
		int svar = 1;
		
		for (int i = n; i >= 1; i --) {
			svar = svar * n; 
			n--;}
		
		return svar;
	}
		
		public static void main(String[] args) {
			
			int n = Integer.parseInt(showInputDialog("N:"));
			
			while (n < 0) {
				n = Integer.parseInt(showInputDialog("Error N må være storre enn 0. N:"));}
			
			System.out.println(fakultet(n));
		}
	} 