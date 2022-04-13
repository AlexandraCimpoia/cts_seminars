package factoryAbstract;

public class CheapFactory implements IFactory{

	@Override
	public IWeapon getWeapon() {
		
		return new CheapWeapon();
	}

	@Override
	public ICostume getCostume() {
		
		return new CheapCostume();
	}

}
