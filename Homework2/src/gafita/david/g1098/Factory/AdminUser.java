package gafita.david.g1098.Factory;

import java.util.List;

public class AdminUser extends User {
    
    private boolean isLogged;

    public AdminUser(String username, String email, String password, String country) {
        super(username, email, password, country);
    }

    @Override
	public List<Investment> getInvestments() {
		System.out.println(this.getUsername() + " investments:");
		return investments;
	}

	@Override
	public void setInvestments(List<Investment> investments) {
		this.investments = investments;
		
	}

	@Override
	public void addInvestment(String symbol, int investedAmount) {
		if(isLogged == true) {
			System.out.println("Admin: " + this.getUsername() + " invested " + investedAmount + " in " + symbol + " successfully!");
			Investment newInvestment = new Investment(symbol, investedAmount);
			investments.add(newInvestment);
		}
		else {
			System.out.println("Admin: " + this.getUsername() + " can't invest offline!");
		}
		
	}

	@Override
	public Investment getInvestmentBySymbol(String symbol) {
		for(Investment investment : investments) {
			if(investment.getSymbol() == symbol)
				return investment;
		}
		return null;
	}

	@Override
    public void login() {
		if(!isLogged) {
			System.out.println("Admin: " + this.getUsername() + " successfully logged in!");
			isLogged = true;
		}
		else {
			System.out.println("Admin: " + this.getUsername() + " is already logged in!");
		}
    }

    @Override
    public void logout() {
    	if(isLogged) {
    		System.out.println("Admin: " + this.getUsername() + " successfully logged out!");
    		isLogged = false;
    	}
    	else {
    		System.out.println("Admin: " + this.getUsername() + " is not logged in!");
    	}
    }
}
