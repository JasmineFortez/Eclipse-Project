package BreakoutSession;

public class session01 {

	public static void main(String[] args) {
		int population = 328555121;
		int under21 = 79315280;
		double percentage = 0.0;
		percentage =   (double) under21 / population;
		percentage *= 100;
		System.out.println("Percentage of population under 21: " +  percentage + "%");
	}

}
