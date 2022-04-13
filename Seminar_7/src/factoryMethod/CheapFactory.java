package factoryMethod;

public class CheapFactory implements IFactory{

	@Override
	public IWeapon getWeapon(int price) {
		
		return new CheapWeapon();
	}

}
