package LiveCoding05;

import java.util.Scanner;

public class BooleanExercise {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double sales = 1000;
		
		System.out.print("Enter the sales amount: ");
		sales = input.nextDouble();
		
		if (sales >= 3000){
			System.out.println("You have sold enough to earn a bonus of $1200" );
			}
		else if (sales>= 2000 ) {
			System.out.println("You have sold enough to earn a bonus of $1000" );
		}
		else if (sales >= 1000) {
			System.out.println("You have sold enough to earn a bonus of $200" );	
		}
		else {
			System.out.println("Sorry, no bonus!");
		}
		input.close();
		} 
		
	}


