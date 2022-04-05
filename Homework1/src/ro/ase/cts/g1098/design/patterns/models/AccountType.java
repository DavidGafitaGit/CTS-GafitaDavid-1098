package ro.ase.cts.g1098.design.patterns.models;

public enum AccountType {
	
	STANDARD(0,false), BUDGET(1,false),PREMIUM(2,true), SUPER_PREMIUM(3,true);

    private int id;
    private boolean fee;
    AccountType(int id, boolean fee) {
        this.id = id;
        this.fee = fee;
    }
    
    public boolean hasFee() {
    	return this.fee;
    }
}
