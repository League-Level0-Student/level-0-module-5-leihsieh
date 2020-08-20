package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class DadsShittyPrimeOrNot {
	
	public static void main(String[] args) {
		
		boolean prime = true;
		
		String number = JOptionPane.showInputDialog("Enter a number:");
		int numAsInt = Integer.parseInt(number);
		
		int num = 2;
		for(int i = 0; i < numAsInt/2; i++)
        {
            if(numAsInt % num == 0)
            {
                prime = false;
                break;
            }
            
        }
		
		if(numAsInt == 2) {
			JOptionPane.showMessageDialog(null, numAsInt + " is a prime number.");
		}
		else if (numAsInt == 0 || numAsInt == 1) {
			JOptionPane.showMessageDialog(null, numAsInt + " is not a prime number.");
		}
		else if (prime == false) {
			JOptionPane.showMessageDialog(null, numAsInt + " is not a prime number.");
		}
		else {
			JOptionPane.showMessageDialog(null, numAsInt + " is a prime number.");
		}
			
	}
}