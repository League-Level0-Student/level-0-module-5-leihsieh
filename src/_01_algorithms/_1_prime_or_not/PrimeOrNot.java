package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Enter a number:");
		int numAsInt = Integer.parseInt(number);
		
		int num = 2;
		for(int i = 0; i<numAsInt - 1; i++) {
			if (numAsInt % num == 0) {
				JOptionPane.showMessageDialog(null, numAsInt + " is not a prime number.");
				num++;
			}
			else {
				JOptionPane.showMessageDialog(null, numAsInt + " is a prime number.");
			}
			break;
		}
	}
}
