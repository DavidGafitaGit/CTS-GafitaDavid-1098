package gafita.david.g1098.Factory;

public class TestFactory {

	public static void main(String[] args) {
		User normalUser = UserFactory.createUser(Rank.USER_NORMAL, "DavidInvest", "gafitadavid19@stud.ase.ro", "davidpass123", "Romania");
		User adminUser = UserFactory.createUser(Rank.USER_ADMIN, "JohnAdm", "john.adm@magma.com", "magmacorp", "UK");
		System.out.println();
		normalUser.login();
		adminUser.login();
		System.out.println();
		normalUser.addInvestment("PLTR", 2000);
		normalUser.addInvestment("TSLA", 2300);
		adminUser.addInvestment("MSFT", 3500);
		adminUser.addInvestment("AMC", 2700);
		System.out.println();
		System.out.println(normalUser.getInvestments());
		System.out.println(adminUser.getInvestments());
		System.out.println();
		normalUser.logout();
		adminUser.logout();
		System.out.println();
		normalUser.addInvestment("MSFT", 1600);
		adminUser.addInvestment("PLTR", 1000);
	}

}
