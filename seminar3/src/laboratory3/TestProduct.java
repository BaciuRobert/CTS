package laboratory3;

import laboratory3.exceptions.InvalidAccountAgeException;
import laboratory3.exceptions.InvalidPriceException;
import laboratory3.stage1.Product;
import laboratory3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		Product product=new Product();
		
		try {
			product.getFinalPrice(ProductType.NEW,0,0);
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
