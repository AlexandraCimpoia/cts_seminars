package memento;

public class Contract { //originator

	private String nameEmployee;
	private String contractClause;

	public Contract(String nameEmployee) {
		super();
		this.nameEmployee = nameEmployee;
	}

	public Contract(String nameEmployee, String contractClause) {
		super();
		this.nameEmployee = nameEmployee;
		this.contractClause = contractClause;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public String getContractClause() {
		return contractClause;
	}

	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}
	
	@Override
	public String toString() {
		return "Contract [nameEmployee=" + nameEmployee + ", contractClause=" + contractClause + "]";
	}

	public void addClause(String newConstractClause) {
		this.contractClause += "\n" + newConstractClause;
	}

	public ContractVersion saveVersion() {
		return new ContractVersion(this.contractClause);
	}
	
	public void restoreFromVersion(ContractVersion contractClauseSpecificversion) {
		this.contractClause = contractClauseSpecificversion.getContractClause();
	}

}
