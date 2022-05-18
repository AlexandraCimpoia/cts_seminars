package strategy;

public class Data {

	private int[] vector = null;
	private IStrategyFinfSpecificNumber strategy;

	public Data(int[] vector, IStrategyFinfSpecificNumber strategy) {
		super();
		this.vector = vector;
		this.strategy = strategy;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public IStrategyFinfSpecificNumber getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategyFinfSpecificNumber strategy) {
		this.strategy = strategy;
	}

	public int processVector() {
		return this.strategy.process(vector);
	}
}
