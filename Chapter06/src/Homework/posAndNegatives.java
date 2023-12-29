package Homework;

import java.util.Scanner;

public class posAndNegatives {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int userNumber = 0;
		int counter = 0;
		int positives = 0;
		int negatives = 0;
		int totalNums = 0;
		double average = 0.0;
		System.out.print("Enter an integer, the output ends at 0: ");
		userNumber = input.nextInt();
		
		if (userNumber == 0) {
			System.out.print("No numbers were entered except 0");
		}
		else {
			while (userNumber != 0) {
				if (userNumber > 0) {
					positives++;
				}
				else if (userNumber < 0) {
					negatives ++; 
				}
				totalNums = userNumber + totalNums;
				userNumber = input.nextInt();
				counter ++;		
			
		}	
		
			//average = (double) totalNums / counter;
			System.out.println("The number of positives are " + positives);
			System.out.println("The number of negatives are " + negatives);
			System.out.println("The total is " + totalNums);
			System.out.println("The average is " + (double) totalNums / counter);
		}
		
		
		input.close();

	}

}
