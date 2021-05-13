package lab11.dp.Command;

public class AutoSaveModule implements GameModuleInterface{

	int frequency;

	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void doTheTask(String details) {
		System.out.println("autosaving for "+details);
		
	}
	
}
