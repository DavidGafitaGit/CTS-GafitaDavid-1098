package gafita.david.g1098.Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		DBConnection connectionTest = DBConnection.TEST;
		DBConnection connectionStocklist1 = DBConnection.LOCAL;
		DBConnection connectionStocklist2 = DBConnection.LOCAL;
		
		connectionTest.connect();
		System.out.println();
		connectionStocklist1.connect();
		System.out.println();
		connectionStocklist2.connect();
	}
}
