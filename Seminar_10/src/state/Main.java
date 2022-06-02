package state;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setState(EnumState.AWAY);
		employee.processTask("Server down");

	}

}
