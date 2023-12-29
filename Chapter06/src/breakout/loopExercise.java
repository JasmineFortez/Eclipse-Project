package breakout;

import java.util.Scanner;

public class loopExercise {

	public static void main(String[] args) {
		
		int integer = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		integer = input.nextInt();
		
		for (int counter = 1; integer >= counter; ++counter) {
			
			for (int numOfInteger = 1; numOfInteger <= counter; ++numOfInteger) {
				System.out.print(numOfInteger);
	
			}
			for (int star = (integer - counter) + integer; star > integer; star--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		input.close();
		
			}
	
	

}
