package InClassCode;

import java.util.Scanner;

public class Bonuses {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double sales = 0.0;
		double bonus = 0.0;
		
		System.out.print("Enter sales amount: ");
		sales = input.nextDouble();
	
		if (sales >= 15000) {
			bonus = sales * 0.02;
		}
		else {
			bonus = sales * .015; 
		}
		
		System.out.print("Your bonus is= $" + bonus);
		
		input.close();
	}
}
