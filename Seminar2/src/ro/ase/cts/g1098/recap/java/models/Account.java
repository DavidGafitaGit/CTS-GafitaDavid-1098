package ro.ase.cts.g1098.recap.java.models;

import ro.ase.cts.g1098.recap.java.exceptions.*;

public abstract class Account {
	
	public void deposit(double amount) throws IllegalTransferException {
	} public abstract void withdraw(double amount) throws IllegalTransferException, InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
}