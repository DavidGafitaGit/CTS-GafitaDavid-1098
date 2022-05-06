package gafita.david.g1098.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class StockFactory {
	private Map<String, StockAR> stocks = new HashMap<String, StockAR>();
	
	public StockAR getStock(String symbol) {
		StockAR stock = stocks.get(symbol);
		if(stock == null) {
			stock = new StockAR(symbol);
			stocks.put(symbol, stock);
		}
		return stock;
	}
	
	public int getNoStocks() {
		return stocks.size();
	}
	
}
