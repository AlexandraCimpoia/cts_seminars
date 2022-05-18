package memento;

public class ProgMain {

	public static void main(String[] args) {
		Contract contract = new Contract("ale");
		ManagerContractVersions manager = new ManagerContractVersions();
		
		contract.addClause("increase salary");
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
		contract.addClause("work from home");
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
		contract.addClause("manager new role");
		manager.addContractVersion(contract.saveVersion());
		System.out.println(contract);
		
		//manager.recoverContract(0);
		contract.restoreFromVersion(manager.recoverContract(0));
		
		System.out.println("---RECOVERED---");
		System.out.println(contract);
	}

}
