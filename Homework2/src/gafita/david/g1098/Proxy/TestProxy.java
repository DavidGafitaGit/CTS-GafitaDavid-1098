package gafita.david.g1098.Proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		LoginInterface gameLoginModule = new LoginModule();
		
		//authenticate as Admin
		if(gameLoginModule.checkCredentials("admin", "1234", "admin@adm.com")) {
			System.out.println("Hello admin");
		}
		
		//defender
		gameLoginModule = new LoginFilter(gameLoginModule, 3);
		
		//the attacker
		String[] passwords = {"123", "admin", "root", "1234"};
		for(int i = 0 ; i < passwords.length ; i++) {
			if(gameLoginModule.checkCredentials("admin", passwords[i], "admin@adm.com")) {
				System.out.println("Found the password: " + passwords[i]);
			}
		}

	}

}
