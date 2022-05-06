package gafita.david.g1098.Flyweight;

public class TestFlyweight {

	private static StockAR[] stocks = new StockAR[100];
	private static StockContext[] stockContexts = new StockContext[100];
	private static int noStocks = 0;
	
	public static void pressKey(String symbol, int limited, StockFactory stockFactory){
		stocks[noStocks] = stockFactory.getStock(symbol);
		stockContexts[noStocks] = new StockContext(limited);
		noStocks++;
	}
	
	public static void main(String[] args) {
		
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

}
