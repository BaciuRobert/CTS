package cts.Baciu.Robert.g1093.pattern.Command;

import java.util.ArrayList;
import java.util.List;


public class TransactionManager {

	List<BankModule> modules= new ArrayList();
	String name;
	
	public TransactionManager(String name) {
		super();
		this.name = name;
	}
	
	public void addAsyncTask(BankModule module) {
		this.modules.add(module);
	}
	
	public void doNextTask() {
		
		if(modules.size() > 0) {
			BankModule module =modules.get(0);
			module.processTransaction("john mayer","john sanders",2000,"General Bank");
			modules.remove(0);
		}
	}
	
}
