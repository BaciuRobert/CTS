package lab11.dp.Command;

public class TestCommand {

	public static void main(String[] args) {

      TaskManager manager = new TaskManager("Background tasks");
      manager.addAsyncTask(new AsyncTask(new AutoSaveModule(5),"Finishing current level",0));
      manager.addAsyncTask(new AsyncTask(new UpdateModule(),"version 10.5",0));
      
      System.out.println("game is running");
      manager.doNextTask();
      System.out.println("game is running");
      manager.doNextTask();
      System.out.println("game is running");
	}

}
