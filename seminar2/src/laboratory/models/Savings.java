package laboratory.models;

import laboratory.exceptions.IllegalTransferException;
import laboratory.exceptions.InsufficientFundsException;
import laboratory.interfaces.Profitable;

public class Savings extends BankAccount implements Profitable{
	
	public static final double MIN_BALANCE=100;

	public Savings(String iban, double balance) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void deposit(Double amount) {
		this.balance += amount;
		
	}

	@Override
	public void withdraw(Double amount)throws InsufficientFundsException {
		if(amount >this.balance) {
			throw new InsufficientFundsException("You need more money");
		}else {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(Account destination, Double amount)throws InsufficientFundsException, IllegalTransferException {
		if(this == destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
		
	}

	@Override
	public void addInterest(double interestPercentRate) {
		this.balance *=(1+interestPercentRate/100);
		
	}
	
	
	

}
