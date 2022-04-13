package factoryAbstract;

public class Shop {

	//we use this class to create the family of objects
	IFactory factory;

	public Shop(IFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void createFamilyObjs() {
		ICostume costume = factory.getCostume();
		IWeapon weapon = factory.getWeapon();
		
		weapon.power();
		costume.protection();
	}
}
