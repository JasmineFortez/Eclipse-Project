package Loops;

import java.util.Scanner;

public class loopLesson {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String twoDigitString = " ";
		
		System.out.print("Enter EXACTLY 3 characters: ");
		twoDigitString =  input.nextLine();
		boolean allDigits = true;
		int index = 0;
		
		if (twoDigitString.length() == 3) {
			
			while (index <= twoDigitString.length() ) {
				
				if (Character.isDigit(twoDigitString.charAt(index))) {
					allDigits = true;
					break;
		
				}
				
				index++;
			}
				if (allDigits) {
					System.out.print("yayy");

				}
				else {
					System.out.print("nayy");
				}
				
				
		}
		else {
			System.out.print("ERROR: Invalid length." +index);
		}
		
		input.close();
		

	}

}
