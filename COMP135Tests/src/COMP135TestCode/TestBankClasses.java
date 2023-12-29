package COMP135TestCode;

import finances.AmeriBank;
import finances.BritBank;

public class TestBankClasses {

	public static void main(String[] args) {
		
		AmeriBank bank1 = new AmeriBank (100, 10);
		BritBank bank2 = new BritBank  (200, 20);
		
		System.out.println(bank1.getBankName());
		System.out.println(bank1.getBanAddress());
		System.out.println("Interest rate: " + bank1.getInterestRate() + " %");
		
		
		try {
			bank1.withdraw(99999.0);
		}
		catch(Exception e){
			System.out.println("Insufficient fund to withdraw amount: $ " + bank1.getWithdraw());
			System.out.println("Balance $" + bank1.getBalance());
		}
		
		try {
			bank1.deposit(-123);
		}
		catch(Exception e){
			System.out.println("Cannot deposit negative amount: $ " + bank1.getDeposit());
			System.out.println("Balance $" + bank1.getBalance());
		}
		
		System.out.println();
		System.out.println(bank2.getBankName());
		System.out.println(bank2.getBanAddress());
		System.out.println("Interest rate: " + bank2.getInterestRate() + " %");
		try {
			bank2.withdraw(99999.0);
		}
		catch(Exception e){
			System.out.println("Insufficient fund to withdraw amount: $ " + bank2.getWithdraw());
			System.out.println("Balance $" + bank2.getBalance());
		}
		
		try {
			bank2.deposit(-123);
		}
		catch(Exception e){
			System.out.println("Cannot deposit negative amount: $ " + bank2.getDeposit());
			System.out.println("Balance $" + bank2.getBalance());
		}
	}

}
