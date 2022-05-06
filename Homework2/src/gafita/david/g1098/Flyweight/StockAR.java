package gafita.david.g1098.Flyweight;

public class StockAR implements HotStock{
	
	private String symbol;
	
	public StockAR(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public void printHotStock(StockContext context) {
		System.out.println(this.symbol + " is limited to: " + context.getLimited());
		
	}
}
