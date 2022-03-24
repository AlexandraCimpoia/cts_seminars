package solid;

public class Calculator {

	private enum Operations {
		ADD, SUBTRACT, MULTIPLY, DIVIDE
	};

	Calculator() {

	}

	public double calculate(double a, double b, int i) {
		switch (i) {
		case 1:
			return a + b;
			// break;
		case 2:
			return a - b;
		case 3:
			return a * b;
		case 4:
			return a / b;
		default:
			return 0;
		}

	}
}
