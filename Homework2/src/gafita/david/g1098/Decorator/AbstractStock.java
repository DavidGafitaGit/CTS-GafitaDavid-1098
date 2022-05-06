package gafita.david.g1098.Decorator;

public abstract class AbstractStock {
	
	String symbol;
	String name;
	float price;
	
	public AbstractStock(String symbol, String name, float price) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.price = price;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public abstract void increse(float value);
	public abstract void decrease(float value);
	
}
