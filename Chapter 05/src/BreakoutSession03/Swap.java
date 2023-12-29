package BreakoutSession03;

public class Swap {

	public static void main(String[] args) {
		int x = 44;
		int y = 88;
		
		// swap values: NOT GOOD
			// x = y;   x -> 88
			// y = x; 	y -> 88 (because it executed x above)
		
		// not swapping
			//System.out.print("x = " + y + " y = " + x);
		
		// only works for 44 and 88
			// y = y- x;
			 //x = x + y;
		
		// introduce new values - works
		//int a = 0; 
		///int b = 0;
		//a = x;
		//b = y;
		//x = b;
		//y = a;
		
		//to shorten ^^^^
		int z = 0;
		z = x;
		x = y;
		y = z;

		System.out.print("x = " + x + " y = " + y);
	}

}
