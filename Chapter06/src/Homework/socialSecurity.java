package Homework;

import java.util.Scanner;

public class socialSecurity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String ssNumber = " ";
		
		System.out.print("Enter a SSN: ");
		ssNumber = input.nextLine();
		
		if ( 	ssNumber.length () == 11  &&
				Character.isDigit(ssNumber.charAt(0)) 
				&& Character.isDigit(ssNumber.charAt(1))
				&& Character.isDigit(ssNumber.charAt(2))
				&& ssNumber.charAt(3) == '-'
				&& Character.isDigit(ssNumber.charAt(4))
				&& Character.isDigit(ssNumber.charAt(5))
				&& ssNumber.charAt(6) == '-'	
				&& Character.isDigit(ssNumber.charAt(7))
				&& Character.isDigit(ssNumber.charAt(8))
				&& Character.isDigit(ssNumber.charAt(9))
				&& Character.isDigit(ssNumber.charAt(10))) {
			System.out.println(ssNumber + " is a valid social security number");
		}
		else {
			System.out.println(ssNumber + " is an invalid social security number");
		}
		input.close();
		
	}

}
