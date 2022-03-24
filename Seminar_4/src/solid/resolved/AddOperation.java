package solid.resolved;

public class AddOperation implements IOperation{

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}
}
