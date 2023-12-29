package Lab;

public class BreakoutRoomSession2 {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = 5;
		double x = 2;
		double y = 3;
		
		double answer = 0.0;
		double answer2 = 0.0;
		
		answer = 3 + (4 * x);
		answer = answer/5;
		answer = answer - 10 * (y - 5)*(a + b + c);
		answer = answer / x;
		answer2 = (4/x) + ((9+x)/y); 
		answer2 = answer2 * 9;
		answer = answer + answer2;
		System.out.print("the answer is: " + answer);
	}

}
