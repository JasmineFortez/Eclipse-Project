package Homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double feet = 0.0;
		double meters = 0.0;
		
		System.out.print("Enter value for feet: ");
		
		feet = input.nextDouble();
		meters = feet * 0.305;
		
		System.out.print(feet + " feet is " + meters + " meters ");	
		
		input.close();
	}

}
