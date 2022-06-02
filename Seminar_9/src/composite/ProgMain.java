package composite;

public class ProgMain {

	public static void main(String[] args) {
	
		Structure menu = new Structure("Menu");
		
		Structure menuDrinks = new Structure("Drinks");
		Structure menuFood = new Structure("Food");
		
		menu.addNode(menuDrinks);
		menu.addNode(menuFood);
	
		menuFood.addNode(new Node("Pizza Carbonara", 20));

		menuFood.addNode(new Node("Pizza Margherita", 20));

		menuFood.addNode(new Node("Pasta Carbonara", 20));
		
		System.out.println(menu.getInfo());
		

	}

}
