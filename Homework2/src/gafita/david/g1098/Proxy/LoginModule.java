package gafita.david.g1098.Proxy;

public class LoginModule implements LoginInterface {

	@Override
	public boolean checkCredentials(String username, String password, String email) {
		System.out.println("Connectiong to server ...");
		System.out.println("Checking credentials ...");
		if(username.equals("admin") && password.equals("1234") && email.equals("admin@adm.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
