package laboratory.models;

import laboratory.exceptions.IllegalTransferException;
import laboratory.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract double getBalance();
	
	public abstract void deposit(Double amount);
	
	public abstract void withdraw(Double amount)throws InsufficientFundsException, InsufficientFundsException;
	
	public abstract void transfer(Account destination,Double amount) throws InsufficientFundsException, IllegalTransferException;
	
	

}
