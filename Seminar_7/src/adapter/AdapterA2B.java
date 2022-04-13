package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA{

	@Override
	public double calculateDiscountA(int noOrders) {
		Customer c = new Customer();
		return this.calculateDiscountB(c);
	}
}
