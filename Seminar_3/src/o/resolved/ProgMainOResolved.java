package o.resolved;

import o.resolved.Employee;

public class ProgMainOResolved {

	public static void main(String[] args) {

		Employee empMada = new FTEEmployee(1, "Mada", 2000);
		System.out.println(empMada.toString() + " bonus: " + empMada.calculateBonus());

	}

}
