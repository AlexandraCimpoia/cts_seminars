package state;

public class VacationState implements iState {

	@Override
	public void act(String task) {
		System.out.println("The employee cannot handle this task at the moment: " + task);
		
	}

}
