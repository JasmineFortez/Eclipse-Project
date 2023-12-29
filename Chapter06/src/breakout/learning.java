package breakout;

import java.util.Scanner;
public class learning 
{
	
		
		public static void main(String[] args) {
		
		/***********************************/
		/***** A.	Character Methods  *****/
		/***********************************/
			
		char ch1 = 'A';
		
		//isDigit(ch)
		System.out.println("1. " + Character.isDigit(ch1));
		//isLetter(ch)
		System.out.println("2. " + Character.isLetter(ch1));
		//isLetterOrDigit(ch)
		System.out.println("3. " + Character.isLetterOrDigit(ch1));
		//isLowerCase(ch)
		System.out.println("4. " + Character.isLowerCase(ch1));
		//isUpperCase(ch)
		System.out.println("5. " + Character.isUpperCase(ch1));
		

		char ch2 = 'D';
		
		//toLowerCase(ch)
		System.out.println("6. " + Character.toLowerCase(ch2));
		//toUpperCase(ch)
		ch2 = 'q';
		System.out.println("7. " + Character.toUpperCase(ch2));

		/*********************************/	
		/***** B.	String Methods  *****/
		/*********************************/
		String myString1 = "     College of\t"; //There are 5 spaces before ‘College’
		String myString2 = "   \t\t\t Marin"; //There are 3 spaces before ‘\t’
		String myString3 = "marin";
		
		//length()
		System.out.println("8. Length of myString1 = " + myString1.length());	
		//charAt(index)
		System.out.println("9. Character at index 10 of myString1 is: " 
				+ myString1.charAt(10));
		//concat(s)
		System.out.println("10. Concatenating myString1 and myString2 gives:  " 
				+ 	myString1.concat(myString2));
		//toUpperCase ()   			Note: Do this for myString1 only
		System.out.println("11. Convert all letters in myString1 to uppercase: " 
				+ myString1.toUpperCase());
		//toLowerCase()    			Note: Do this for myString2 and myString3
		System.out.println("12 a. Convert all letters in myString2 " +
				"to lowercase: " + myString2.toLowerCase());
		System.out.println("   b. Convert all letters in myString3 " +
				"to lowercase: " + myString3.toLowerCase());
		//trim(s) Example: myString1 = myString1.trim();  	
		System.out.println("13. The old length of myString1 is = " + 
				myString1.length());
		myString1 = myString1.trim(); 
		System.out.println("    Trim myString1...");	
		System.out.println("    The new length of myString1 is = " + 
				myString1.length());
		System.out.println("14. The old length of myString2 is = " + 
				myString2.length());
		myString2 = myString2.trim(); 
		System.out.println("    Trim myString2...");	
		System.out.println("    The new length of myString2 is = " + myString2.length());
		
		String myString4 = "some content"; //Interned
		String myString5 = "some content"; //Interned
		//The operator == Note: Compare myString4 and myString5
		System.out.printf("15.a myString4 == myString5 evaluates to: %b\n",  
				myString4 == myString5);
			
		//equals() 					Note: Compare myStrin4 and myString5
		System.out.println("15.b myString4.equals(myString5) evaluates to: " + 
				myString4.equals(myString5));
		
		myString4 = "This and ";
		myString5 = "This and ";
		String myThat = "That";
			
		myString4 += myThat;
		myString5 += myThat;
		System.out.println("String4 '" + myString4 + "' and String5 '" + myString5 + "'");
			
		//The operator == 	Note: Compare myString4 and myString5
		System.out.printf("16.a myString4 == myString5 evaluates to: %b\n",  
				myString4 == myString5);
			
		//equals() 		Note: Compare myStrin4 and myString5
		System.out.println("16.b myString4.equals(myString5) evaluates to: " + 
				myString4.equals(myString5));

		String myString6 = "HELLO";
		String myString7 = "Hello";
		//equalsIgnoreCase() Note: Compare myString4 and myString5
		System.out.println("17. myString6.equalsIgnoreCase(myString7) evaluates to: " 
				+ myString6.equalsIgnoreCase(myString7));
		//compareTo(s1) 			Note: Compare myString4 and myString5
		System.out.println("18. myString6.compareTo(myString7) evaluates to: " 
				+ myString6.compareTo(myString7));
		//compareToIgnoreCase(s1) 	Note: Compare myString4 and myString5
		System.out.println("19. myString6.compareToIgnoreCase(myString7) evaluates to: " 
				+ myString6.compareToIgnoreCase(myString7));
		
		String myString8 = "Java value";
		//startsWith(prefix)
		System.out.println("20. " + myString8.startsWith("Ja"));	
		//endsWith(suffix)
		System.out.println("21. " + myString8.endsWith("a"));
		//contains(s1)
		System.out.println("22. " + myString8.contains("ja"));
		//substring(beginIndex)
		System.out.println("23. " + myString8.substring(1));
		//substring(beginIndex, endIndex)
		System.out.println("24. " + myString8.substring(1, 3));
		//indexOf(ch)
		System.out.println("25. " + myString8.indexOf('J'));
		//indexOf(ch, fromIndex)
		System.out.println("26. " + myString8.indexOf('a', 2));
		//indexOf(s)
		System.out.println("27. " + myString8.indexOf("va"));
		//indexOf(s, fromIndex)
		System.out.println("28. " + myString8.indexOf("va", 2));
		//lastIndexOf(ch)
		System.out.println("29. " + myString8.lastIndexOf('a'));
		//lastIndexOf(ch, fromIndex)
		System.out.println("30. " + myString8.lastIndexOf('J', 1));
		//lastIndexOf(s)
		System.out.println("31. " + myString8.lastIndexOf("va"));
		//lastIndexOf(s, fromIndex)
		System.out.println("32. " + myString8.lastIndexOf("va", 2));


		/*************************************************/
		/*****	C. Reading a string from the console *****/
		/*************************************************/
		//next()
		String inputString = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two words separated by a space (e.g. Good Day): ");
		inputString = input.next();
		System.out.println("33. " + inputString);
		inputString = input.nextLine(); //Flush out the buffer
		
		//nextLine()	
		System.out.print("Again, enter two words separated by a space: ");
		inputString = input.nextLine();
		System.out.println("34. " + inputString);

		/************************************************/
		/***** D. getting a character from a string *****/
		/************************************************/

		//charAt(index)
		System.out.print("Enter first 5 letters, e.g. abcde: ");
		inputString = input.next();
		System.out.println("35. " + inputString.charAt(3));

		/*******************************************************/
		/***** E. Conversions between strings and numbers: *****/
		/*******************************************************/
		
		System.out.print("Enter an integer: ");
		inputString = input.next();
		//Integer.parseInt(intString)
		System.out.println("36. " + (Integer.parseInt(inputString) + 1000));
		
		System.out.print("Enter an floating number (e.g. 12.34): ");
		inputString = input.next();
		//Double.parseInt(doubleString)
		System.out.println("37. " + (Double.parseDouble(inputString) + 11.11));
		}
	

}