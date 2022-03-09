package o;

public class Employee {

	private int ID;
	private String name;
	private String employeeType;
	private float salary;

	public Employee(int iD, String name, String employeeType, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.employeeType = employeeType;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", employeeType=" + employeeType + ", salary=" + salary + "]";
	}

	public float calculateBonus() {
		if (this.employeeType == "FTE") {
			return this.salary * .1f;
		}
		if (this.employeeType == "Vendor") {
			return this.salary * .05f;
		} else {
			return 0;
		}
	}

}
