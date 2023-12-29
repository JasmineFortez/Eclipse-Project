package finances;


public class AmeriBank extends AbstractBank {
	public AmeriBank() { }
		
		public AmeriBank (double balance, double interestRate) {
			this.balance = balance;
			this.interestRate = interestRate;
		}
		@Override
		public String getBankName() { 
			return "AmeriBank";
		}
		
		@Override
		public String getBanAddress() {
			return "123 Fun Street, Kentfield 94904";
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
		
		public void withdraw(double withdraw) {
			this.withdraw = withdraw;
			if(withdraw < balance) {
				balance = balance - withdraw;
			}
			else throw new IllegalArgumentException();
		 } 
		
		public void deposit( double deposit) {
			this.deposit = deposit;
			if(deposit > 0) {
				balance = balance + deposit;
			}
			else throw new IllegalArgumentException();
		 }
		
		
	
		public double getDeposit() {
			return deposit;
		}

		public double getWithdraw() {
			return withdraw;
		} 
		 


		
	}
