package practice;

import java.util.Scanner;

public class arraysss {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int [] a = new int [5];
		System.out.print("Enter 3 numbers: ");
		
		a[0] = input.nextInt();
		int index = 1;
		for (int scanner: a) {
			System.out.print(scanner);
			a[index] = input.nextInt();
			index++;
			
		}
		
		
		
	}

}
