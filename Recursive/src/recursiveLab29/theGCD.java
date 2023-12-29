package recursiveLab29;

import java.util.Scanner;

public class theGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num = 0;
		int mun = 0;
		System.out.print("Enter 2 integers: ");
		num = input.nextInt();
		mun = input.nextInt();
		System.out.print("The gcd is: " + gcd(num, mun));

	}
	public static double gcd (int m, int n) {
		if(m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m % n);
		}
		
	}

}
