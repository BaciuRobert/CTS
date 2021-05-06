package lab10.cts.dp.state;

public class WoundedState implements MoveStateInterface {

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("the hero is moving slowly");
	}

}
