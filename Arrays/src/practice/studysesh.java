package practice;

public class studysesh {

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3};
		int [] b = new int [4];
		
		//for (int printA: a) {
		//	System.out.print(printA);
		//}
		//for (int printB: b) {
		//	System.out.print(printB);
			
		//}
		int index = 0;
		
		for (int arrayCopy: a) {
			b [index] = arrayCopy;
			index++;
			
		}
		
		b [2] = 55;
		System.out.print( b[2]);
		
	}

}
