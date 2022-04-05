package ro.ase.cts.g1098.design.patterns.models;

public enum AccountType {
	
	STANDARD(0), BUDGET(1),PREMIUM(2), SUPER_PREMIUM(3);

    private int id;
    AccountType(int id) {
        this.id=id;
    }
}
