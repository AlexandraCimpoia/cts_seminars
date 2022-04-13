package factoryAbstract;

public class MagicFactory implements IFactory{

	@Override
	public IWeapon getWeapon() {
		
		return new MagicWeapon();
	}

	@Override
	public ICostume getCostume() {
		
		return new MagicCostume();
	}

}
