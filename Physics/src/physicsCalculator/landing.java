package physicsCalculator;

import java.util.Scanner;

public class landing {

	public static void main(String[] args) {
		
		System.out.println("Predicting where you would land (x) if you were to jump off a building or something");
		System.out.println("\nPlease Provide the following with just the numbers (no units)");
		double x, v, y;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter vertical height in m: ");
		y = input.nextDouble();
		System.out.print("Enter velocity in m/s: ");
		v = input.nextDouble();
		
		x = Math.sqrt((v * 2 * y) / 9.8);
		System.out.printf("You would land in %.3f m", x);
	}

}
