package gafita.david.g1098.Adapter;

public class StockData extends WebInfo implements YahooFinanceAPI {
	
	@Override
	public void fetchData(String symbol) {
		System.out.println("Data: Gathering infromations about " + symbol + "...");
		this.findStock(symbol);
	}

	@Override
	public StockAG getData() {
		System.out.println("Data: Informations reveived ...");
		return this.returnInfo();
	}

}
