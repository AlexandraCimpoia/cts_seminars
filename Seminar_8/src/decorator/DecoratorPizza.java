package decorator;

public class DecoratorPizza extends APizza{

	protected APizza pizza;
	
	public DecoratorPizza(APizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getIngredient() {
		return pizza.getIngredient();
	}

	@Override
	public float getCost() {
		return pizza.getCost();
	}

}
