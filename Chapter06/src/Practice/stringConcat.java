package Practice;

public class stringConcat {

	public static void main(String[] args) {
		
		
		
		String myStrng = "abc";
		myStrng = myStrng.toUpperCase();
		myStrng = myStrng.concat(" hello");
		
		String myString = myStrng + " " + myStrng;
		System.out.println(myString);
		
		String s3 = "ABC hello";
		System.out.println(myStrng.equals(s3));
		System.out.println(myStrng == s3);
		
		String s2 = "657";
		System.out.println(myStrng.compareTo(s2));
		System.out.println(s2.endsWith("h"));
		
		int intValue = Integer.parseInt(s2);
		System.out.println(intValue - 67);
		
		System.out.println((char) 37);
}
}