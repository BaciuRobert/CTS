package cts.Baciu.Rober.g1093.pattern.adapter;

public class Proccesor implements IVisaProcessor{

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		
		if(sourseCurrency != destinationCurrency)
		{
			
		}
		
	}

}
