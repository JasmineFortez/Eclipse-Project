package homework;

public class testAccount {

	public static void main(String[] args) {
		
		Account personalAccount = new Account (1122, 20000, 4.5);
		System.out.printf("Paul's initial balance =$%.0f", personalAccount.getBalance());
		
		personalAccount.withdrawn(2500);
		System.out.printf("\n$2500 has been withdrawn, your new balance is $%.0f", personalAccount.getBalance());
		personalAccount.deposit(3000);
		System.out.printf("\n$3000 has been deposit,your new balance is $%.0f\n", personalAccount.getBalance());
		System.out.printf("\nPaul's ID = %d", personalAccount.getId());
		System.out.printf("\nPaul's balance = $%.0f", personalAccount.getBalance());
		System.out.printf("\nPaul's annualInterestRate = %.1f", personalAccount.getAnnualInterestRate());
		System.out.print("%");
		System.out.printf("\nPaul's monthlyInterestRate = %.3f", personalAccount.getMonthlyInterestRate());
		System.out.print("%");
		System.out.printf("\nPaul's monthly interest = $%.3f\n", personalAccount.monthlyInterest());
		
		System.out.println("\nResults of failed withdrawal and deposit attempts...");
		personalAccount.withdrawn(1000000);
		System.out.printf("Balance = $%.0f\n", personalAccount.getBalance());
		personalAccount.deposit(-999);
		System.out.printf("Balance = $%.0f\n", personalAccount.getBalance());
	}

}
