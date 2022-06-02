package chainOfResponsability;

public class Waiter extends AHandler{

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty()<5)
			System.out.println("The waiter is handeling this: " + o.getName());
		else
		{
			System.out.println("The waiter cannot handle this: " + o.getName());
			this.nextperson.processOrder(o);
		}
	}

}
