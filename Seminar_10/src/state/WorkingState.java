package state;

public class WorkingState implements iState{

	@Override
	public void act(String task) {
		System.out.println("The employee works on this task: " + task);
		
	}

}
