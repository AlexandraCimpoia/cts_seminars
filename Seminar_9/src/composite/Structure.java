package composite;

import java.util.ArrayList;

public class Structure extends AbstractNode {
	
	//7-Decorator
	//8-Composite
	//1-Builder
	//10-Flyweight -> permanent si temporal
	
	private String name;
	//missing price
	
	private ArrayList<AbstractNode> list = new ArrayList<AbstractNode>();
	

	public Structure(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public String getName() {
		
		return this.name;
	}


	@Override
	public float getPrice() {
		
		throw new UnsupportedOperationException();
	   
		
	}

	@Override
	public void addNode(AbstractNode element) {
		
		//super.addNode(element);
		list.add(element);
	}

	@Override
	public void removeNode(AbstractNode element) {
		
		//super.removeNode(element); - arunca exceptie
		
		list.remove(element); //accepta si index si nod
	}

	@Override
	public AbstractNode getNode(int index) {
		
		//super.getNode(index);
		return this.list.get(index);
	}


	@Override
	public String getInfo() {
		
		
		
		String info = " " + this.getInfo() + "\n";
		
		for(AbstractNode nod:list) {
			
			info += " " + nod.getInfo() + "\n";
		}
		
		return info;
	}

	//use flyweight when you need to save memory
	
	
}
