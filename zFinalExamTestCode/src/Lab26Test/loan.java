package Lab26Test;

import LoanToolbox.Loan;

public class loan {
public static void main(String[] args) {
		
		try { 
			System.out.println("I. Test constructor: Illegal annualInterestRate (-3.0) passed...");
		
		Loan badLoan1 = new Loan (-3.0, 5, 100);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try { 
			System.out.println("II. Test constructor: Illegal numberOfYears (-5) passed..."); 
		
		Loan badLoan2 = new Loan (3.0, -5, 100);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try { 
			System.out.println("III. Test constructor: Illegal loanAmount (-100) passed...");		
			Loan badLoan3 = new Loan (3.0, 5, -100);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		Loan goodLoan = new Loan (3.0, 5, 100);
		
		try { 
			System.out.println("IV. Test setting illegal annualInterestRate (-10.5)...");
			goodLoan.setAnnualInterestRate(-10.5); 
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try { 
			System.out.println("V. Test setting illegal numberOfYears (-10)...");
			goodLoan.setNumberOfYears(-10); 
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		try { 
			System.out.println("VI. Test setting illegal loan amount (-10.5)...");
			goodLoan.setLoanAmount(-10.5); 
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
	}

}

