package gafita.david.g1098.Adapter;

import java.util.Random;

public class WebInfo implements AbstractWebInfo {

	private StockAG stock;
	
	@Override
	public void findStock(String symbol) {
		this.stock = new StockAG(symbol);
		System.out.println("Stock was successfully found...");
		this.stock.setName("Stock name");
		Random r = new Random();
		double min = 50;
		double max = 200;
		double random = min + r.nextDouble() * (max - min);
		this.stock.setPrice(random);
		this.stock.setProbability(((int)random)/10);
	}

	@Override
	public StockAG returnInfo() {
		return this.stock;
	}

}
