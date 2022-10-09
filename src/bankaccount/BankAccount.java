package bankaccount;

public class BankAccount {

	private double balance;
	
	//Constructor 
	public BankAccount () {
		balance = 0.0;
	}
	
	//deposit method
	public void deposit (double amount) {
		balance += amount;
	}
	
	//withdraw method
	public void withdraw (double amount) throws InSufficientFundException {
		if (amount > balance) {
			throw new InSufficientFundException("Insufficient balance."
					+ " Withdraw process could not be completed.");
		}
		balance -= amount;
	}

	//getter method for balance
	public double getBalance() {
		return balance;
	}
	
	
}
