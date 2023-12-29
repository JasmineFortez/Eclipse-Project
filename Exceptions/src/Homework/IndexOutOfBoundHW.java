package Homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IndexOutOfBoundHW {

	public static void main(String[] args) {
		
		ArrayList <Integer> randomList = new ArrayList <>();
		
		Random numbers =  new Random();
		for(int i = 0; i < 10; i++) {
			randomList.add(numbers.nextInt(101));
		}
		
		boolean ifOutOfBounds = true;
		Scanner input = new Scanner(System.in);
		int index = 0;
		while (ifOutOfBounds) {
			try {
				System.out.print("Enter an array index (0-9): ");
				index = input.nextInt();
				System.out.print("Value at that index: " + randomList.get(index) );
				ifOutOfBounds = false;
				System.out.printf("\nFirst element = " + randomList.get(0) + " Last Element = " + randomList.get(9));
			}
			catch (IndexOutOfBoundsException e){
				System.out.print("Out of Bounds\n");
				ifOutOfBounds = true;
			}
		}
		
		input.close();
	}

	

}
