package homework;

public class Account {
	
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	
	public Account () {}
	
	public Account (int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double monthlyInterest () {
		return balance * ((annualInterestRate/12) / 100);
	}
	public void withdrawn(double money) {
		if(money < balance) {
			this.balance = balance - money;
		}
		else {
			System.out.printf("Attempt to withdraw $%.0f..", money);
			System.out.print("\nERROR: balance is less than the withdraw amount!\n");
		}
	}
	public  void deposit(double money) {
		if(money > 0) {
			this.balance = balance + money;
		}
		else {
			System.out.printf("Attempt to deposit $%.0f..", money );
			System.out.print("\nERROR: you cannot deposit a negative amount!\n");
		}
	}
	
}
