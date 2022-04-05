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
	
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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
