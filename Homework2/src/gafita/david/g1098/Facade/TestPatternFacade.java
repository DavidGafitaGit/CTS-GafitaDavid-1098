package gafita.david.g1098.Facade;

import java.util.ArrayList;
import java.util.List;

import gafita.david.g1098.Adapter.StockAG;
import gafita.david.g1098.Adapter.StockData;
import gafita.david.g1098.Adapter.YahooFinanceAPI;
import gafita.david.g1098.Builder.StockModel;
import gafita.david.g1098.Builder.StockRisk;
import gafita.david.g1098.Composite.StockGS;
import gafita.david.g1098.Composite.StockStructure;
import gafita.david.g1098.Decorator.AbstractStock;
import gafita.david.g1098.Decorator.PriceDecorator;
import gafita.david.g1098.Decorator.StockAP;
import gafita.david.g1098.Factory.Rank;
import gafita.david.g1098.Factory.User;
import gafita.david.g1098.Factory.UserFactory;
import gafita.david.g1098.Flyweight.StockAR;
import gafita.david.g1098.Flyweight.StockContext;
import gafita.david.g1098.Flyweight.StockFactory;
import gafita.david.g1098.Prototype.Stock;
import gafita.david.g1098.Prototype.StockPeriod;
import gafita.david.g1098.Prototype.StockSurvey;
import gafita.david.g1098.Proxy.LoginFilter;
import gafita.david.g1098.Proxy.LoginInterface;
import gafita.david.g1098.Proxy.LoginModule;
import gafita.david.g1098.Singleton.DBConnection;

public class TestPatternFacade {

	public static void testSingleton() {
		DBConnection connectionTest = DBConnection.TEST;
		DBConnection connectionStocklist1 = DBConnection.LOCAL;
		DBConnection connectionStocklist2 = DBConnection.LOCAL;
		
		connectionTest.connect();
		System.out.println();
		connectionStocklist1.connect();
		System.out.println();
		connectionStocklist2.connect();
	}
	
	public static void testFactory() {
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
	
	public static void testBuilder() {
		List<Float> closingPrices = new ArrayList<>();
		closingPrices.add(23.5f);
		closingPrices.add(24.3f);
		closingPrices.add(22.1f);
		closingPrices.add(25.7f);
		closingPrices.add(26.9f);
		StockModel stockModel = new StockModel.StockBuilder("AAPL", "Apple", StockRisk.LOW)
				.setClosingPrices(closingPrices)
				.setDescription("A good stock for your first investment!")
				.build();
		
		System.out.println(stockModel.toString());
	}
	
	public static void testPrototype() throws CloneNotSupportedException {
		Stock stock = new Stock("TSLA", "Tesla");
		StockSurvey surveyMonth = new StockSurvey(stock, 3, StockPeriod.MONTH);
		StockSurvey surveyYear = new StockSurvey(stock, 3, StockPeriod.YEAR);
		StockSurvey surveyToday = (StockSurvey) surveyMonth.clone();
		StockSurvey surveyYesterday = (StockSurvey) surveyMonth.clone();
	}
	
	public static void testDecorator() {
		AbstractStock Palantir = new StockAP("PLTR", "Palantir", 200f);
		Palantir.increse(20f);	// => value: 220.0$
		Palantir.decrease(10f);	// => value: 210.0$
		
		AbstractStock Microsoft = new StockAP("MSFT", "Microsoft", 1600f);
		Microsoft.increse(400f);	// => value: 2000.0$
		Microsoft.decrease(300f);	// => value: 1700.0$
		
		Microsoft = new PriceDecorator(Microsoft);
		Microsoft.increse(400f);	// => value: 2100.0$ > 1900.0$
		
		if(Microsoft instanceof PriceDecorator) {
			Microsoft = ((PriceDecorator) Microsoft).removeDecorator();
		}
		
		Microsoft.increse(400f);
	}
	
	public static void testAdapter() {
		StockAG stock = new StockAG("PLTR");
		YahooFinanceAPI api = new StockData();
		api.fetchData(stock.getSymbol());
		stock = api.getData();
		System.out.println(stock);
	}
	
	public static void testProxy() {
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
	
	private static StockAR[] stocks = new StockAR[100];
	private static StockContext[] stockContexts = new StockContext[100];
	private static int noStocks = 0;
	
	public static void pressKey(String symbol, int limited, StockFactory stockFactory){
		stocks[noStocks] = stockFactory.getStock(symbol);
		stockContexts[noStocks] = new StockContext(limited);
		noStocks++;
	}
	
	public static void testFlyweight() {
		
		StockFactory stockFactory = new StockFactory();
		
		pressKey("PLTR", noStocks, stockFactory);
		pressKey("MSFT", noStocks, stockFactory);
		pressKey("AAPL", noStocks, stockFactory);
		pressKey("TSLA", noStocks, stockFactory);
		pressKey("GME", noStocks, stockFactory);
		pressKey("AXN", noStocks, stockFactory);
		pressKey("BBC", noStocks, stockFactory);
		
		for(int i=0;i<noStocks;i++)
			stocks[i].printHotStock(stockContexts[i]);
		
		System.out.println("\n No of created objects: " + stockFactory.getNoStocks());
	}
	
	public static void testComposite() {
		StockStructure group = new StockStructure();
		StockStructure volatiles = new StockStructure();
		
		volatiles.addChildNode(new StockGS("PLTR", "Palantir"));
		volatiles.addChildNode(new StockGS("MSFT", "Microsoft"));
		
		group.addChildNode(new StockGS("AAPL", "Apple"));
		group.addChildNode(volatiles);
		
		System.out.println(group.getInfo());
	}
	
}
