package composite;

public class Node extends AbstractNode {
	
	private String name;
	private float price;
	
	

	public Node(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public float getPrice() {
		
		return this.price;
	}

}
