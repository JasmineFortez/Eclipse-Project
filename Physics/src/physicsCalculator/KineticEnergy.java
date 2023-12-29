package physicsCalculator;

import java.util.Scanner;

public class KineticEnergy {

	public static void main(String[] args) {

		System.out.println("\tINTRODUCTION TO PHYSICS KINETIC ENERGY CALCULATOR\n");
		
		Scanner input = new Scanner (System.in);
		String kinetic;
		System.out.println("I. Kinetic energy equation");
		System.out.print("Enter what you want to calculate on (KE / mass / velocity): ");
		kinetic = input.next();
		double mass = 0;
		double velocity = 0;
		double KE = 0;
		System.out.println("Only input numbers without units");
		if(kinetic.compareTo("KE") == 0) {
			System.out.print("Enter mass in kilograms: ");
			mass = input.nextDouble();
			System.out.print("Enter velocity in meters: ");
			velocity = input.nextDouble();
			KE = 0.5 * mass * velocity * velocity;
			System.out.print("Your KE is: " + KE+ " J");
		}
		else if (kinetic.compareTo("mass") == 0) {
			System.out.print("Enter velocity in m/s: ");
			velocity = input.nextDouble();
			System.out.print("Enter Kinetic Energy in joules: ");
			KE= input.nextDouble();
			mass = 2 * KE / (velocity * velocity);
			System.out.print("Your mass is: " + mass + "kg");
		}
		else if (kinetic.compareTo("velocity") == 0) {
			System.out.print("Enter mass in kg: ");
			mass = input.nextDouble();
			System.out.print("Enter Kinetic Energy in joules: ");
			KE = input.nextDouble();
			velocity =  Math.sqrt(KE / (0.5 * mass));
			System.out.print("Your velocity is: " + velocity + " m/s");
		}
		
		
	}

}
