package assignment4_cts_testing_classes;

import java.util.ArrayList;

import assignment4_cts_testing_exceptions.WrongAmountSoldItemsException;
import assignment4_cts_testing_exceptions.WrongNameException;
import assignment4_cts_testing_exceptions.WrongPriceException;

/*
 * 
 * DISCLAIMER
 * Most of the given methods are implemented with bugs
 * Cele mai multe dintre metodele date au bug-uri 
 * 
 * 
 * SPECS
 * 
 * name - between 5 and 200 alpha-numeric chars (no special chars)
 * price - between [0.01, 100000)
 * soldItems - between [0, 1000]
 * 
 * 
 */

public class Product {
	
	public static final float MIN_PRICE = 0.01f;
	public static final float MAX_PRICE = 100000;
	
	public static final int MIN_NAME_LENGTH=5;
	public static final int MAX_NAME_LENGTH=200;
	
	
	
	
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems;		//number of items sold each week
	
	public Product(String name, float price) throws WrongPriceException, WrongNameException {
		if(name.length() >= MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH)
		this.name = name;
		else
			throw new WrongNameException();
		
		if(price >= MIN_PRICE && price <MAX_PRICE)
		{
		this.price = price;
		}
		else throw new WrongPriceException();
		
		weeklySoldItems = new ArrayList<Integer>();
	}

	
	public Product(String name, float price, ArrayList<Integer> soldItems) {
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
		for(Integer n: soldItems)
			this.weeklySoldItems.add(n);
	}
	
	
	


	public void setSales(ArrayList<Integer> soldItems) throws WrongAmountSoldItemsException {
		if(soldItems.size() >= 0 && soldItems.size()<=1000)
		{
		this.weeklySoldItems = soldItems;
		}
		else
			throw new WrongAmountSoldItemsException();
	}
	
	public ArrayList<Integer> getSales()
	{
		return this.weeklySoldItems;
	}

	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void addWeek(int soldItems){
		weeklySoldItems.add(soldItems);
	}
	
	public int getSoldItems(int i){
		return weeklySoldItems.get(i);
	}
	
	/*
	 * 
	 * determines the number of weeks with sales above the given limit
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit){
		int noWeeks = 0;
		for(int n: weeklySoldItems)
			if(n >= minLimit)
				noWeeks++;
		noWeeks++;
		return noWeeks;
	}
	
	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from total number of weeks
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit){
		float m = 0;
		for(Integer n: weeklySoldItems)
			if(n > minLimit)
				m += n;
		
		return (int) (100 * m / this.weeklySoldItems.size());
	}
	
	/*
	 * 
	 * 
	 * determines the index of the weeks with maximum sales (multiple weeks can have maximum sales)
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */
	
	public ArrayList<Integer> getWeeksIndexWithMaxSales(){
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = this.weeklySoldItems.get(0);
		
		for(int i = 0; i < this.weeklySoldItems.size(); i++)
			if(this.weeklySoldItems.get(i) > max)
				maxWeeks.add(i);
		
		return maxWeeks;
	}
	
	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for(Integer n: weeklySoldItems)
			output += n + " ";
		return output;
	}
}