package Homework;

public class mathTrigHomework {

	public static void main(String[] args) {
		
		
		double sin = 0.0;
		double cos = 0.0;
		
		System.out.printf("Degree\t\tSin\t\tCos\n");
		for (int degree = 0; degree <= 360; degree += 10) {
			sin =  Math.sin(Math.toRadians(degree));
			cos =  Math.cos(Math.toRadians(degree));
			System.out.printf(degree + "\t\t%3.4f\t\t%3.4f \n" , sin , cos);
			
			
		}
		
	}

}
