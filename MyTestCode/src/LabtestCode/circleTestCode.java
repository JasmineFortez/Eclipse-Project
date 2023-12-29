package LabtestCode;

import java.util.Scanner;

import LabCode.Circle;



public class circleTestCode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		String color = " ";
		boolean filled = false;
		
		System.out.println("I.  Some user inputs...");
		System.out.print("Enter radius: " );
		radius = input.nextDouble();
		
		input.nextLine();
		
		System.out.print("Enter color: ");
		color = input.nextLine();
		System.out.print("Filled or not filled (true or false): " );
		filled = input.nextBoolean();
		
		Circle myCircle = new Circle(color, filled, radius);
		System.out.println("\nII. Testing getters...");
		System.out.printf("Area = %.4f", myCircle.getArea());
		System.out.printf("\nPerimeter = %.4f", myCircle.getPerimeter());
		System.out.printf("\nDate Created = " + myCircle.get_Date_Created());
		System.out.printf("\nColor = %s", myCircle.get_color());
		System.out.printf("\nFilled = %b\n", myCircle.is_filled());
		
		System.out.println("\nIII. Using toString() to display triangle outputs");
		System.out.printf(myCircle.toString());
		
		input.close();
		

	}

}
