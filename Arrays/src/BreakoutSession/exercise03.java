package BreakoutSession;

public class exercise03 {

	public static void main(String[] args) {
		
		int [] myArray = {111, 222, 444, 8, 999, 8, 8};
		int min = myArray[0];
		for  (int i = 1; i < myArray.length; i++) {
			if (min >= myArray[i]) {
				min = myArray[i];
			}
		}
		System.out.println("minimum: " + min);
		System.out.println("Largest index of " + min + " = " + getLargestOfMinimum(myArray) );

	}
	public static int getLargestOfMinimum (int [] integerArray) {
		
		int min = integerArray[0];
		int index = 0;
		for (int i = 1; i < integerArray.length; i++) {
			if (min >= integerArray[i]) {
				min = integerArray[i];
				index = i;
			}
		}
		return index;
		
		
	}

}
