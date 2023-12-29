package LiveCoding05;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		
		char trafficLightColor = ' ';
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a character G(green) R(red) Y(yellow): ");
		trafficLightColor = input.next().charAt(0);
		
		switch (trafficLightColor) {
		case 'g':
		case 'G':
			System.out.println("Traffic has turned green.");
			break;
		case 'r':
		case 'R':
			System.out.println("Traffic has turned red.");
			break;
		case 'y':
		case 'Y':
			System.out.println("Traffic has turned yellow.");
			break;
		default : 
			System.out.println("Invalid input.");	
		
			
		}//end of switch
		input.close();
	} // end of main
} // end of class
