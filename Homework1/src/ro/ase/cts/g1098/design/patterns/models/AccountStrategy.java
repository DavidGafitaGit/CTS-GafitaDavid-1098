package ro.ase.cts.g1098.design.patterns.models;

public class AccountStrategy {

	private static float ACCOUNT_FEE = 0.0125f;
	private static float DAYS_IN_YEAR = 365;
	
	public static double calculateAccountsTotalFee(Account[] accounts)
	{
	double totalFee = 0.0;
	for(Account account : accounts)
		if(account.getAccountType().hasFee())
			totalFee += comupteFee(account);
		return totalFee;
	}
	
	private static double comupteFee(Account tempAccount) {
		return ACCOUNT_FEE	* (tempAccount.getLoanValue() * Math.pow(tempAccount.getRate(), (tempAccount.getDaysActive() / DAYS_IN_YEAR)) - tempAccount.getLoanValue());
	}
}
