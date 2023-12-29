package InClassCode;

public class localVariables {
	
	public static void main(String [] args) {
	int x = 10;
	int y = 123;
	{
		int y2 = 20; //local variables
		System.out.println("x = " + x);
		System.out.println("y = " + y2);

		x = x+y;
	}
	
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	
	
	}
	}
	