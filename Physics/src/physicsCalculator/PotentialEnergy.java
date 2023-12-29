package physicsCalculator;

import java.util.Scanner;

public class PotentialEnergy {

	public static void main(String[] args) {
		
		System.out.println("\tINTRODUCTION TO PHYSICS POTENTIAL ENERGY CALCULATOR\n");
		
		Scanner input = new Scanner (System.in);
		String potential;
		System.out.println("I. Potential energy equation");
		System.out.print("Enter what you want to calculate on (PE / mass / height): ");
		potential = input.next();
		double mass = 0;
		double height = 0;
		double PE = 0;
		System.out.println("Only input numbers without units");
		if(potential.compareTo("PE") == 0) {
			System.out.print("Enter mass in kilograms: ");
			mass = input.nextDouble();
			System.out.print("Enter height in meters: ");
			height = input.nextDouble();
			PE = 9.8 * mass * height;
			System.out.print("Your PE is: " + PE + " J");
		}
		else if (potential.compareTo("mass") == 0) {
			System.out.print("Enter height in meters: ");
			height = input.nextDouble();
			System.out.print("Enter Potential Energy in joules: ");
			PE = input.nextDouble();
			mass = PE / (9.8 * height);
			System.out.print("Your mass is: " + mass + "kg");
		}
		else if (potential.compareTo("height") == 0) {
			System.out.print("Enter mass in kg: ");
			mass = input.nextDouble();
			System.out.print("Enter Potential Energy: ");
			PE = input.nextDouble();
			height = PE / (9.8 * mass);
			System.out.print("Your height is: " + height + " m");
		}
		
		
	}

}
