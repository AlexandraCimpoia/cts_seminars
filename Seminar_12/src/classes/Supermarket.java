package classes;

import java.util.ArrayList;

import exceptions.ExceptionMarket;

public class Supermarket {
	
	private String name;
	//private int area; - without attributes that can be calculated
	private ArrayList<Market> listMarkets = new ArrayList<Market>();
	
	public Supermarket() {
		
	}
	
	public Supermarket(String name, ArrayList<Market> listMarkets) {
		super();
		this.name = name;
		this.listMarkets = listMarkets;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Market> getListMarkets() {
		return listMarkets;
	}


	public void setListMarkets(ArrayList<Market> listMarkets) {
		this.listMarkets = listMarkets;
	}


	public Market getBiggestMarketByArea(ETypeMarket typeMarket) throws ExceptionMarket {
		if(this.listMarkets == null || this.listMarkets.size() == 0) {
			throw new ExceptionMarket();
		}
		Market m = null; //=this.listMarkets.get(i)
		int maxArea = 1;
		for (int i = 0; i < this.listMarkets.size(); i++) {
			if(this.listMarkets.get(i).getArea() > maxArea && this.listMarkets.get(i).getType() == typeMarket) {
				m = this.listMarkets.get(i);
				maxArea = m.getArea();
			}
		}
		if(m == null) {
			throw new ExceptionMarket();
		}
		return m;
	}

}
