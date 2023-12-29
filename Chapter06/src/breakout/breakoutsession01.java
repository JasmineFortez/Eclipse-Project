package breakout;

import java.util.Scanner;

public class breakoutsession01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double side = 0;
		System.out.print("Enter the side: ");
		side = input.nextDouble();
		double area = 0;
		double area2 = 0;
		area = 5 * Math.pow(side, 2);
		area2= 4 * Math.tan(Math.PI / 5);
		area = area/area2;
		
		
		
		System.out.println("The area of the pentagon is: " + area );

	}

}
