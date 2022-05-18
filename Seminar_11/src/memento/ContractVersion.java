package memento;

public class ContractVersion { //memento -> always changing
	
	private String contractClause;
	
	public ContractVersion() {
		super();
	}

	public ContractVersion(String contractClause) {
		super();
		this.contractClause = contractClause;
	}

	public String getContractClause() {
		return contractClause;
	}

	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}
	
	
}
