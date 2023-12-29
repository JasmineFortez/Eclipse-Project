package Lab;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	int numberOfPeople = 1230;
	String name = "";
	final double interestRate = 10.3;
	char firstLetter = ' ';
	//interestRate = 12.5;

	System.out.print("Enter your name: ");
	name = input.nextLine();
	System.out.println("Your name is: " + name);
	firstLetter = name.charAt(0);
	System.out.println("The first letter of your name is: " + firstLetter);
	
	System.out.println(Math.pow(5, 26));
	
	}

}
