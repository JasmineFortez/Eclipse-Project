package BreakoutSession;

public class beforeMidterm {

	public static void main(String[] args) {
		
		int [] minAndMax = {14, 26, 73, 1, 66, 28, 94};
		
		System.out.print("Minimum and Maximum: ");
		
		for (int index: smallestAndLargest(minAndMax)) {
			System.out.print(index + " ");
		}
		
		System.out.print("\nMinimum and Maximum: ");
		for (int index: smallestAndLargest(999, 666, 2, 24, 999)) {
			System.out.print(index + " ");
		}
		
		System.out.print("\nMinimum and Maximum: ");
		for (int index: smallestAndLargest(new int[] {33, 743, 67, 88, 222})) {
			System.out.print(index + " ");
		}
		
		System.out.printf("\n%,d ", 3000000);
		
		
	}
	
	public static int[] smallestAndLargest (int ... list) {
		
		int min = list[0];
		int max = list [0];
		
		for (int item: list) {
			if (item < min) {
				min = item;
			}
			else if (item > max) {
				max = item;
			}
		}
		
		int [] result = {min, max};
		return result;
	}
		

}
