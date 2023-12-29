package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListHw {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		int userInt = 0; 
		ArrayList <Integer> myList = new ArrayList <> ();
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++) {
			userInt = input.nextInt();
			myList.add(userInt);
		}
		removeDuplicate(myList);
		input.close();
	}
	
	public static void removeDuplicate (ArrayList <Integer> list) {
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = list.size() - 1; j > i; j--) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}// end if statement
				}// end inner-loop
				
		
			} // end outer-loop
			
		
		System.out.print("The distinct integers are: ");
		for(int i: list) {
			System.out.print(i + " ");
		}
	} // end method 2
} // end
