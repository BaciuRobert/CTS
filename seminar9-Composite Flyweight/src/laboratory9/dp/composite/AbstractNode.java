package laboratory9.dp.composite;

public abstract class AbstractNode implements NPCActions {

	public abstract void addNode(AbstractNode node);
	public abstract AbstractNode getNode(int index);	
	public abstract void deleteNode(AbstractNode node);
	
	
}