package decorator;

public class PizzaBasic extends APizza{

	@Override
	public String getIngredient() {
		return "mozzarela, tomato ";
	}

	@Override
	public float getCost() {
		return 20;
	}
	
	

}
