package finances;

abstract public class AbstractBank {

	
	protected double interestRate;
	protected double balance;
	protected double deposit;
	protected double withdraw;
	public AbstractBank() { }
	public AbstractBank(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	abstract public String getBankName(); 
	abstract public String getBanAddress();
	
	public abstract double getBalance();
	public abstract double getInterestRate();
	public abstract void setInterestRate( double interestRate);
	public abstract void setBalance( double balance);
	
	
}
