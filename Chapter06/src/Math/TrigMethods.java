package Math;

public class TrigMethods {

	public static void main(String[] args) {
		//we pass an argument of 30 degrees to the method Math.toRadians
		//then we pass the value returned in radians to yet another method
		// called Math.sin()
		System.out.println("sine of 30 degrees: " + Math.sin(Math.toRadians(30)));
		
		double sineValue = Math.sin(Math.toRadians(30));
		
		System.out.println("Inverse of sine of 30 degrees: " + Math.toDegrees(Math.asin(sineValue)));
		

	}

}
