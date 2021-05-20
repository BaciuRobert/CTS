package cts.Baciu.Robert.g1093.pattern.Factory;

public class Debit extends BankAccount {

	String destination;
	public Debit(double Balance, String Id,boolean overdraftOn)
	{
		super(Balance,Id);
		
	}
	
	public void isCollected(String destination)
	{
		if(destination == this.id)
		{
			System.out.println("The salary is colledcted in this account");
		}
	}
}
