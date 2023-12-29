package physicsCalculator;

import java.util.Scanner;

public class Momentum {

	public static void main(String[] args) {
		System.out.println("\tINTRODUCTION TO PHYSICS MOMENTUM CALCULATOR\n");
		
		Scanner input = new Scanner (System.in);
		String momentum;
		System.out.println("I. Momentum equation");
		System.out.print("Enter what you want to calculate on (momentum / mass / velocity): ");
		momentum = input.next();
		double mass = 0;
		double velocity = 0;
		double p = 0;
		System.out.println("Only input numbers without units");
		if(momentum.compareTo("momentum") == 0) {
			System.out.print("Enter mass in kilograms: ");
			mass = input.nextDouble();
			System.out.print("Enter velocity in m/s: ");
			velocity = input.nextDouble();
			p =  mass * velocity;
			System.out.print("Your momentum is: " + p + " (kgm)/s");
		}
		else if (momentum.compareTo("mass") == 0) {
			System.out.print("Enter velocity in m/s: ");
			velocity = input.nextDouble();
			System.out.print("Enter momentum in (kgm/s): ");
			p = input.nextDouble();
			mass =  p / velocity;
			System.out.print("Your mass is: " + mass + "kg");
		}
		else if (momentum.compareTo("velocity") == 0) {
			System.out.print("Enter mass in kg: ");
			mass = input.nextDouble();
			System.out.print("Enter momentum in (kgm/s): ");
			p = input.nextDouble();
			velocity = p / mass;
			System.out.print("Your velocity is: " + velocity + " m/s");
		}
		
		
		
	}

}
