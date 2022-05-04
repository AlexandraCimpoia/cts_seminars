package decorator;

public class PizzaChicken extends DecoratorPizza {
	
	
	public PizzaChicken(APizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getIngredient() {
		return super.getIngredient() + " ,chicken ";
	}

	@Override
	public float getCost() {
		return super.getCost() + 10;
	}

}
