package Lab;

import java.util.Scanner;

public class BreakoutSession01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double area = 0.0;
		double length = 0.0;
		double volume = 0.0;
		
		System.out.print("Enter radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		area = Math.PI * Math.pow(radius, 2);
		volume = area * length;
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " + volume);
		input.close(); 
		
	}

}
