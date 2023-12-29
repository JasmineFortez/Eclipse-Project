package BreakoutSession03;

public class BreakoutSesh {

	public static void main(String[] args) {
		int low = 50;
		int high = 100;
		
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("Random Number 0<=x<10 is " + random);
		
		int random2 = low + (int) (Math.random() * (high - low + 1));
		System.out.println("Random Number 50<=x<100 is " + random2);	
	}

}
