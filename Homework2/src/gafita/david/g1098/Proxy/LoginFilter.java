package gafita.david.g1098.Proxy;

import java.util.HashMap;

public class LoginFilter implements LoginInterface {

	int noAllowedAttempts;
	private LoginInterface loginModule;
	HashMap<String, Integer> loginCounter = new HashMap<>();
	
	public LoginFilter(LoginInterface loginModule, int noAllowedAttempts) {
		super();
		this.loginModule = loginModule;
		this.noAllowedAttempts = noAllowedAttempts;
	}

	@Override
	public boolean checkCredentials(String username, String password, String email) {
		
		Integer noAttempts = loginCounter.get(username);
		if(noAttempts == null) {
			loginCounter.put(username, 0);
			noAttempts = 0;
		}
		
		if(noAttempts >= noAllowedAttempts) {
			System.out.println("Login was locked for 10 minutes ...");
			return false;
		}
		
		boolean isOk = this.loginModule.checkCredentials(username, password, email);
		
		if(!isOk) {
			noAttempts += 1;
			loginCounter.put(username, noAttempts);
		}
		
		return isOk;
	}
	
}
