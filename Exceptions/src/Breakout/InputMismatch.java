package Breakout;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean ifInteger = false;
		int int1 = 0;
		int int2 = 0;
		int sum = 0;
		System.out.print("Input two integers: ");
		while (!ifInteger) {
			try {
				int1 = input.nextInt();
				int2 = input.nextInt();
				ifInteger = true;
				sum = int1 + int2;
				System.out.print("sum: " + sum);
			}	
			
			catch (InputMismatchException e) {
				System.out.print("Try again, input only integer please: ");
				input.nextLine();
				
			}
			
		}

		
	}

}
