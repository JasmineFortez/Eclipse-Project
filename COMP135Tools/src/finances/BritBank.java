package finances;

public class BritBank extends AbstractBank {
	public BritBank() { }
	
	public BritBank (double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	@Override
	public String getBankName() { 
		return "BritBank";
	}
	
	@Override
	public String getBanAddress() {
		return "911 Joy Street, London E1 6AN";
}

	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public double getInterestRate() {
		
		return interestRate;
	}
	@Override
	public void setInterestRate( double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public void setBalance( double balance) {
		this.balance = balance;
	}
	public void withdraw(double withdraw) throws Exception {
		this.withdraw = withdraw;
		if(withdraw < balance) {
			balance = balance - withdraw;
		}
		else throw new Exception();
	 } 
	
	public void deposit( double deposit) throws Exception {
		this.deposit = deposit;
		if(deposit > 0) {
			balance = balance + deposit;
		}
		else throw new Exception();
	 }

	public double getDeposit() {
		return deposit;
	}

	public double getWithdraw() {
		return withdraw;
	} 
	 
}