package Homework;

public class milestokm {

	public static void main(String[] args) {
		
		
		double km = 1.609;
		double kilometer = 0;
		
		System.out.printf("Miles \t Kilometers\n");
		
		for (int miles = 1; miles <= 10; miles++) {
			kilometer = miles * km;
			System.out.printf(miles + " \t " + kilometer +"\n");
		}
	}

}
