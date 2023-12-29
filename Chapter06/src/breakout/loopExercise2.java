package breakout;

import java.util.Scanner;

public class loopExercise2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int integer = 0;
		integer = input.nextInt();
		
		
		for (int counter = 1; integer >= counter; counter++) {
			for (int i = 1; counter > i; i++) {
				System.out.print(" ");
			}
			for (int i = (integer - counter) + integer; integer <= i; i--) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (int counter = 1; integer >= counter; counter++) {
			for (int i = integer; counter < i; i--) {
				System.out.print(" ");
			}
				for (int i = (integer + counter) ; integer < i;  i--) {
					System.out.print("*");
					
				}
				System.out.println();	
			}		
			
			
		
		
		
	}

}
