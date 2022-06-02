package command;

public class Main {

	public static void main(String[] args) {
		Chef c1 = new Chef("Jane");
		Chef c2 = new Chef("John");
		
		Waiter waiter = new Waiter();
		waiter.noteCommands(new PizzaOrder(c1, "diavola"));
		waiter.noteCommands(new PastaOrder(c2, "carbonara"));
		waiter.noteCommands(new PizzaOrder(c1, "margherita"));

		waiter.sendCommands();
	}

}
