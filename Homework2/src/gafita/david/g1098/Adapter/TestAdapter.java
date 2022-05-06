package gafita.david.g1098.Adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		StockAG stock = new StockAG("PLTR");
		YahooFinanceAPI api = new StockData();
		api.fetchData(stock.getSymbol());
		stock = api.getData();
		System.out.println(stock);
	}

}
