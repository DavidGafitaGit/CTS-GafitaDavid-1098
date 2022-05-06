package gafita.david.g1098.Composite;

public class Stock extends HierarchyNode {

	String symbol;
	String name;
	double price;
	
	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
