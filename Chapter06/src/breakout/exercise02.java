package breakout;

import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int guess = 0;
		
		System.out.print("I am filipping a coin, enter 1 (head) 0 (tail): ");
		guess = input.nextInt();
		
		int flip = (int) (Math.random() * 2);
		
		if (guess > 1) {
			System.out.println("You must enter a number between 1 or 0");

		}
		else {
			if (flip == 1) {
				System.out.println("The computer generated head!");
			}
			else  {
				System.out.println("The computer generated tails!");
			}
			if (guess == flip) {
				System.out.println("You guessed right!");
			}
			else {
				System.out.println("You guessed wrong!");
			}
		}
				
	
	
		
		
	}

}
