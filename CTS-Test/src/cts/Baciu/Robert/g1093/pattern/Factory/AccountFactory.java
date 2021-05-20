package cts.Baciu.Robert.g1093.pattern.Factory;

public class AccountFactory {

	public static BankAccount getAccounts(AccountType type)
	{
		BankAccount account = null;
		switch (type) {
		case DEBIT:
			account = new Debit(2000,"dasdsadas",true);
			break;
		case CREDIT:
			account = new Credit(1500,"xlaa32",9000,20);
		    break;
		case JUNIOR:
			account = new Junior(1000,"dajoo",5);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return account;
	}
}
