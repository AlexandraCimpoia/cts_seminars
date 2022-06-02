package chainOfResponsability;

public class Main {

	public static void main(String[] args) {
		AHandler waiter = new Waiter();
		AHandler chef = new Chef();
		
		waiter.getSuccessor(chef);
		waiter.processOrder(new Order("Coffee", 3));
		waiter.processOrder(new Order("Pizza", 15));
	}

}
