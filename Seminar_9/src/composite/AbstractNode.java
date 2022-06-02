package composite;

public abstract class AbstractNode {
	
	//clasa care sa se comporte si ca o frunza si ca o structura
	
	public abstract String getName();
	public abstract float getPrice();
	
	public String getInfo() {
		
		return getName() + getPrice();
	}
	
	public void addNode(AbstractNode element) {
	
		throw new UnsupportedOperationException();
	}
	
	public void removeNode(AbstractNode element) {
		
		throw new UnsupportedOperationException();
	}
	
    public AbstractNode getNode(int index) {
		
		throw new UnsupportedOperationException();
	}

}
