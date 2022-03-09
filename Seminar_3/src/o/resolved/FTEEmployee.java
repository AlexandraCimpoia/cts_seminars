package o.resolved;

public class FTEEmployee extends Employee {

	private float salary;

	public FTEEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary = salary;
	}

	public float calculateBonus() {
		return this.salary * .1f;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "VendorEmployee" + super.toString() + "[salary=" + salary + "]";
	}

}
