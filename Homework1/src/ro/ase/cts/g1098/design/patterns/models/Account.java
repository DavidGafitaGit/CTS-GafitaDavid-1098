package ro.ase.cts.g1098.design.patterns.models;

import ro.ase.cts.g1098.design.patterns.exceptions.DaysActiveException;
import ro.ase.cts.g1098.design.patterns.exceptions.LoanValueException;
import ro.ase.cts.g1098.design.patterns.exceptions.RateException;
import ro.ase.cts.g1098.design.patterns.interfaces.IAccountable;

public class Account implements IAccountable{
	
	private double	loanValue;
	private double	rate;
	private int	daysActive;
	private AccountType accountType;
	private static float ACCOUNT_FEE = 0.0125f;
	private static float DAYS_IN_YEAR = 365;
	
	public Account(double loanValue, double rate, AccountType accountType) throws LoanValueException {
		if( loanValue < 0)
			throw new LoanValueException();
		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}
	
	public double getLoanValue() {
		return this.loanValue;
	}
	
	public void setLoanValue(double newLoanValue) throws LoanValueException {
		if(newLoanValue < 0)
			throw new LoanValueException();
		this.loanValue = newLoanValue;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public void setRate(double newRate) throws RateException {
		if(newRate < 0)
			throw new RateException();
		this.rate = newRate;
	}
	
	public int getDaysActive() {
		return this.getDaysActive();
	}
	
	public void setDaysActive(int newDaysActive) throws DaysActiveException {
		if(newDaysActive < 0)
			throw new DaysActiveException();
		this.daysActive = newDaysActive;
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
