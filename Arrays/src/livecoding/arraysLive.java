package livecoding;

public class arraysLive {

	public static void main(String[] args) {
		
		int[] myArray = {1, 3, 5};
		
		int i = 0;
		for (int item: myArray) {
			item++;
			myArray[i] = item;
			System.out.printf("%d " , item);
		}	
		
	}
}
