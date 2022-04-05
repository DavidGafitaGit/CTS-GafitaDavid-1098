package ro.ase.cts.g1098.design.patterns.models;

import ro.ase.cts.g1098.design.patterns.interfaces.IAccountable;

public class Account implements IAccountable{
	
	private double	loanValue;
	private double	rate;
	private int	daysActive;
	private AccountType accountType;
	private static float ACCOUNT_FEE = 0.0125f;
	private static float DAYS_IN_YEAR = 365;
	
	public Account(double loanValue, double rate, AccountType accountType) throws Exception {
		if( loanValue < 0)
			throw new Exception();
		else {
			this.loanValue = loanValue;
		}
		this.rate = rate;
		this.accountType = accountType;
	}
	
	public double getLoanValue() {
		System.out.println("The loan value is: " + this.loanValue);
		return this.loanValue;
	}
	
	public void setLoanValue(double newLoanValue) throws Exception {
		if(newLoanValue < 0)
			throw new Exception();
		else {
			this.loanValue = newLoanValue;
		}
	}
	
	public double getRate() {
		System.out.println("The rate is: "+ this.rate);
		return this.rate;
	}
	
	private static double comupteFee(Account tempAccount) {
		return ACCOUNT_FEE	* (tempAccount.loanValue * Math.pow(tempAccount.rate, (tempAccount.daysActive / DAYS_IN_YEAR)) - tempAccount.loanValue);
	}
	
	public static double calculateAccountsTotalFee(Account[] accounts)
	{
	double totalFee = 0.0;
	Account	tempAccount;
	for(int i = 0 ; i < accounts.length ; i++)	{
		tempAccount = accounts[i];
		if(tempAccount.accountType == AccountType.PREMIUM || tempAccount.accountType == AccountType.SUPER_PREMIUM)	
			totalFee += comupteFee(tempAccount);
	}
		return totalFee;
	}
	
	public void printAccount() {
		System.out.println("This is an account");
	}

	public String toString() {
		return "Loan: " + this.loanValue + ";" 
				+ " Rate: " + this.rate + ";" 
				+ " Days active: " + this.daysActive + ";" 
				+ " Type: " + this.accountType + ";";
	}

	@Override
	public double getMonthlyRate() {
		return this.loanValue*this.rate;
	}
}
