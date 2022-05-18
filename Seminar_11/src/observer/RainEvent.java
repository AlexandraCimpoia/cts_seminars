package observer;

public class RainEvent extends Observable {

	private String info;
	private boolean eventStarted = false;
	
	

	public RainEvent(String info) {
		super();
		this.info = info;
		
	}

	public void activateEvent() {
		if (this.eventStarted == false) {
			this.eventStarted = true;
			this.notifyAllHandlers();
		}
	}

	public void publishEvent() {
		this.activateEvent();
	}

}
