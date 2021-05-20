package la12.dp.memento;

import java.util.Date;

public class HeroMemento {
	
	String name;
	int lifepoints;
	String magic;
	
	Date timestamp;

	public HeroMemento(String name, int lifepoints, String magic) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
		this.magic = magic;
		this.timestamp = new Date();
	}
	
	

}
