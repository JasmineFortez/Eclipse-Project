package Homework;

import java.util.Scanner;

public class practice {


	public static void main(String[] args) {
		
	
		Scanner input = new Scanner (System.in);
		String password = " ";
		boolean passwordChecker = false;
		boolean passwordChecker2 = false;
		boolean passwordChecker3 = false;
		
		
	
		System.out.print("Enter a 8 character password: ");
		password = input.next();
		
		if (password.length() ==8) {
			for (int index = 0; index < 8; index++) {
				if (Character.isUpperCase(password.charAt(index))) {
					passwordChecker = true;
					
				}
				else if (Character.isDigit(password.charAt(index))) {
					passwordChecker2 = true;
					
				}
				else if (Character.isLetterOrDigit(password.charAt(index))) {
		
				}
				else {
					passwordChecker3 = true; 
				}
			}
			if (passwordChecker == true && passwordChecker2 == true && passwordChecker3 == true) {
				System.out.print("Valid Password");
			}
			else {
				System.out.print("Invalid Password");
			}
			
			}
		else {
			System.out.print("Invalid Length");
		}
	
		input.close();
}// public
} // first one
		