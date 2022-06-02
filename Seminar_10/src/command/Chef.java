package command;

public class Chef {

	
	private String name;
	
	public Chef(String name) {
		super();
		this.name = name;
	}
	public void cookPizza(String dish) {
		System.out.println(name + "is cooking:" + dish);
	}
	public void cookPasta(String dish) {
		System.out.println(name + "is cooking" + dish);
	}
}
