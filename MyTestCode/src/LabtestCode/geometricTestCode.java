package LabtestCode;

import java.util.Scanner;

import LabCode.Triangle;

public class geometricTestCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String color = " ";
		boolean filled = false;
		
		System.out.println("I.  Some user inputs...");
		System.out.println("Enter 3 sides of the triangle:" );
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		input.nextLine();
		
		System.out.println("Enter color: ");
		color = input.nextLine();
		System.out.println("Filled or not filled (true or false)" );
		filled = input.nextBoolean();
		
		Triangle myTriangle = new Triangle(color, filled, s1, s2, s3);
		System.out.println("\nII. Testing getters...");
		System.out.printf("Area = %.4f", myTriangle.getArea());
		System.out.printf("\nParameter = %.4f", myTriangle.getPerimeter());
		System.out.printf("\nDate Created = " + myTriangle.get_Date_Created());
		System.out.printf("\nColor = %s", myTriangle.get_color());
		System.out.printf("\nFilled = %b\n", myTriangle.is_filled());
		
		System.out.println("\nIII. Using toString() to display triangle outputs");
		System.out.printf(myTriangle.toString());
		
		input.close();
	}
}
