package BreakoutSession;

import java.util.Scanner;

public class Water {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double current = 0.0;
		double previous = 0.0;
		double used = 0.0;
		double total = 0.0;
		
		System.out.print("Enter the current meter reading: ");
		current = input.nextDouble();
		System.out.print("Enter the previous meter reading: ");
		previous = input.nextDouble();	
		used =  current - previous;
		System.out.println("Gallons used: " + used);
		
		if ( used >= 1000) {
			total = 0.007 * used;
		}
		else {
			total = 16.67;
		}
		
		System.out.print("Total charge: "+ total);
		
		input.close();

	}

}
