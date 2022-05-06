package gafita.david.g1098.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class StockFactory {
	private Map<String, Stock> stocks = new HashMap<String, Stock>();
	
	public Stock getStock(String symbol) {
		Stock stock = stocks.get(symbol);
		if(stock == null) {
			stock = new Stock(symbol);
			stocks.put(symbol, stock);
		}
		return stock;
	}
	
	public int getNoStocks() {
		return stocks.size();
	}
	
}
