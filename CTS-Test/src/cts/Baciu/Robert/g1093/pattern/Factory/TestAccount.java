package cts.Baciu.Robert.g1093.pattern.Factory;

public class TestAccount {

	public static void main(String[] args) {
		
		BankAccount account =  AccountFactory.getAccounts(AccountType.CREDIT);
		
		account = AccountFactory.getAccounts(AccountType.DEBIT);
		
		account = AccountFactory.getAccounts(AccountType.JUNIOR);

	}

}
