package laboratory3.stage3.services;

import laboratory3.exceptions.InvalidAccountAgeException;
import laboratory3.exceptions.InvalidPriceException;

public interface ValidatorInterface {

	public  void validatePrice(float price)throws InvalidPriceException;
	public  void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	
}
