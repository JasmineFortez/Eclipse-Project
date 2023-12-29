package BreakoutSession;

public class array01 {

	public static void main(String[] args) {
		int [] myArray = {2, 4, 6, 8, 10};
		System.out.print("Array content, after incrementing each even number: ");
		int i = 0;
		
		for (int j = 0; j < myArray.length; ++j) {
			myArray[j] +=1;
		
		}
		while (i < myArray.length) {
			System.out.print(myArray[i] + " ");
			i++;
		}	
	}

}
