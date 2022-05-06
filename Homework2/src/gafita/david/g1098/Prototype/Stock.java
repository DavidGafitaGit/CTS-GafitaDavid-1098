package gafita.david.g1098.Prototype;

public class Stock {
	
	private String symbol;
	private String name;
	
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", name=" + name + "]";
	}
	
	
}
