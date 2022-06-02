package state;

public class AwayState implements iState{

	@Override
	public void act(String task) {
		System.out.println("The employee will proritize this after their break: " + task);
		
	}

}
