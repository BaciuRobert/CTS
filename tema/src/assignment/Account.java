package assignment;

public final class Account implements Rate {
	private double	loanValue,rate;	
	private int	daysActive,accountType;
	private static final float brokersFee=.0125f;
	private static final int daysInAYear=365;
	
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue*rate;
	}
	
	//setter with validation for loanValue
	public void setValueOfLoan(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
	}
	
	//method to display an Account
	public String to_string() {
		return "Loan: "+this.loanValue+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+accountType+";";
	}
	

	public static double calculateAccountsTotalFee(Account[] accounts)
	{
	double totalFee=0.0;
	for	(int i=0;i<accounts.length;i++)	{
//	if(accounts[i].accountType = AccountType.PREMIUM || accounts[i].accountType = AccountType.SUPER_PREMIUM)
	totalFee+=brokersFee	*	(	//	1.25%	broker's	fee
			accounts[i].loanValue*Math.pow(accounts[i].rate,(accounts[i].daysActive/daysInAYear)) - accounts[i].loanValue);	//	interest-principal
	}
	return	totalFee;
	}

	
	//constructor with arguments
	private Account(double value, double rate, int accountType) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
		if(rate<0)
			throw new Exception();
		else 
		{
		 this.rate = rate;
		}
		this.accountType = accountType;
	}
	
	
    //getters
	public int getDaysActive() {
		return daysActive;
	}

	
	public int getAccountType() {
		return accountType;
	}

	public double getValueOfLoan() {
		
		return loanValue;
	}
	
	public double getRate() {
		
			return this.rate;
	}

	
}