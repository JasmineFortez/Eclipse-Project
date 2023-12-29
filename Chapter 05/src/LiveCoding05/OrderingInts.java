package LiveCoding05;

import java.util.Scanner;

public class OrderingInts {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a = 0, b = 0, c =0;
		
		System.out.print("Enter a, b, c:   ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a < b) {
			if (a < c) {
				if ( b < c) {
					System.out.println(a +" " + b + " " + c+  " ");
				}
				else {
					System.out.println(a +" " + c + " " + b+  " ");
				}
			}
			else {
				System.out.println(c +" "+ a + " " +b + " ");
			}
		} // end of first if statement
		else {
			if (a < c) {
				System.out.println(b +" " + a + " " + c+  " ");
			}
			if (b < c) {
				System.out.println(b +" " + c + " " + a+  " ");
			}
			else {
				System.out.println(c +" " + b + " " + a+  " ");
			}
		}

	}

}
