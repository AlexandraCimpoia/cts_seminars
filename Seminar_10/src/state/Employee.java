package state;

public class Employee {
	
	iState currentState;

	public Employee(iState currentState) {
		super();
		this.currentState = currentState;
	}

	public Employee() {
		super();
		this.currentState = new WorkingState();
	}
	
	public void setState(EnumState state) {
		switch (state) {
		case WORKING:
			this.currentState = new WorkingState();
			break;
		case AWAY:
			this.currentState = new AwayState();
			break;
		case VACATION:
			this.currentState = new VacationState();
			break;
		default:
			throw new Error("cannot handle the specified state");
		}
	}
	
	public void processTask(String task) {
		this.currentState.act(task);
	}
}
