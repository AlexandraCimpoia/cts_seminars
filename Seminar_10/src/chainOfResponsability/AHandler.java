package chainOfResponsability;

public abstract class AHandler {

	protected AHandler nextperson;
	public void getSuccessor(AHandler nextPerson) {
		this.nextperson = nextPerson;
	}
	
	public abstract void processOrder(Order o);
}
