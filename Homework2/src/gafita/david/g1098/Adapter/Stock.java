package gafita.david.g1098.Adapter;

public class Stock {
	private String symbol;
	private String name;
	private double price;
	private int probability;
	
	public Stock() {
		
	}
	
	public Stock(String symbol) {
		this.symbol = symbol;
	}
	
	public Stock(String symbol, String name, double price, int probability) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.price = price;
		this.probability = probability;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProbability() {
		return probability;
	}

	public void setProbability(int probability) {
		this.probability = probability;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", name=" + name + ", price=" + price + ", probability=" + probability + "]";
	}
	
}
