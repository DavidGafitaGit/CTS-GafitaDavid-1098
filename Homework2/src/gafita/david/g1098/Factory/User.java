package gafita.david.g1098.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    protected String username;
    protected String email;
    protected String password;
    protected String country;
    
    protected List<Investment> investments = new ArrayList<>();

    public User(String username, String email, String password, String country) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.country = country;
    }
    
    public String getUsername() {
		return username;
	}
    
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

    public abstract void login();
    public abstract void logout();
    public abstract List<Investment> getInvestments();
    public abstract void setInvestments(List<Investment> investments);
    public abstract void addInvestment(String symbol, int investedAmount);
    public abstract Investment getInvestmentBySymbol(String symbol);
}