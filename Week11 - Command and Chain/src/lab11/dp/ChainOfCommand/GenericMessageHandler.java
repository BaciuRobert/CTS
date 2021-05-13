package lab11.dp.ChainOfCommand;

public abstract class GenericMessageHandler {
	
	//this is the key signature of Chain
	GenericMessageHandler next = null;
	
	public abstract void processMessage(Message message);


	public void setNext(GenericMessageHandler next) {
		this.next = next;
	}
	
	
	
	

}
