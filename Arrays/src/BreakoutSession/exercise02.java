package BreakoutSession;

public class exercise02 {
	
	public static void main(String[] args) {
		
		final int size = 5;
		int[] myArray = new int [size];
		int totalOfArray = 0;
		System.out.print("Generated content of array: ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 50) + 50;
			System.out.print(myArray[i] + " ");
			totalOfArray += myArray[i];
		}
		System.out.printf("\nSum of Values: " + totalOfArray);
	}
	
}
