package la12.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		SuperHero superman=new SuperHero("Superman",100,"Fly");
		
		HeroMemento initialSave=superman.createRestorePoint();
		
		superman.takesAHIt(50);
		superman.takesAHIt(20);
		
		System.out.println("Lifepoints: " + superman.lifepoints);
		
		superman.restore(initialSave);
		
		System.out.println("Lifepoints: " + superman.lifepoints);

	}

}
