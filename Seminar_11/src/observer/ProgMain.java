package observer;

public class ProgMain {

	public static void main(String[] args) {
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler mada = new MadaHandler();
		IHandler anto = new AntoHandler();
		IHandler diana = new DianaHandler();
		
		rain.subscribeHandler(diana);
		rain.subscribeHandler(anto);
		rain.subscribeHandler(mada);
		
		rain.activateEvent();
	}

}
