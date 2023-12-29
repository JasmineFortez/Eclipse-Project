package BreakoutSession03;

import java.util.Scanner;

public class BreakoutSesh02 {

	public static void main(String[] args) {
	
		int income = 100000;
		double tax = 0.0;
		byte filingStatus = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Single filer, enter 1");
		System.out.println("Jointly or qualifying widow(er), enter 2");
		System.out.println("Married but filing separately, enter 3");
		System.out.println("Head of Household, enter 4");
		System.out.print("Enter filing Status: ");
		filingStatus = input.nextByte();
		System.out.println("Enter taxable income: $"+income);
		switch (filingStatus) {
		case 1:
			tax = income * 0.1;
			System.out.println("Taxed owed: " + tax);
			break;
		case 2:
			tax = income * 0.08;
			System.out.println("Taxed owed: " + tax);
			break;
		case 3:
			tax = income * 0.09;
			System.out.println("Taxed owed: " + tax);
			break;
		case 4:
			tax = income * 0.07;
			System.out.println("Taxed owed: " + tax);
			break;
		default :
			System.out.print("Invalid filing status");
		} // end switch

	}

}
