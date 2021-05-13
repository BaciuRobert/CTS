package lab11.dp.ChainOfCommand;

public class PrivateMessageModule extends GenericMessageHandler {

	@Override
	public void processMessage(Message message) {
		if(!message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Message sent in private for " +message.destination+ " : "+message.text);
		}
		else {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
		
	}

}
