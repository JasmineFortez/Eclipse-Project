package Breakout;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		
		ArrayList <Integer> myList = new ArrayList <> ();
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 5 integers: ");
		myList.add(input.nextInt());
		myList.add(input.nextInt());
		myList.add(input.nextInt());
		myList.add(input.nextInt());
		myList.add(input.nextInt());
		
		java.util.Collections.sort(myList);
		System.out.print("Sorted: ");
		for(int i: myList) {
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
