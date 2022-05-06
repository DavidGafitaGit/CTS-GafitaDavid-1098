package gafita.david.g1098.Decorator;

public abstract class StockDecorator extends AbstractStock {

	protected AbstractStock stock;
	
	public StockDecorator(AbstractStock stock) {
		super(stock.symbol, stock.name, stock.price);
		this.stock = stock;
	}

	@Override
	public String getSymbol() {
		return this.stock.getSymbol();
	}

	@Override
	public String getName() {
		return this.stock.getName();
	}

	@Override
	public float getPrice() {
		return this.stock.getPrice();
	}

	@Override
	public void increse(float value) {
		this.stock.increse(value);
		
	}

	@Override
	public void decrease(float value) {
		this.stock.decrease(value);
	}
	
	public AbstractStock removeDecorator() {
		System.out.println("Decorator for " + this.stock.getSymbol() + " was successfully removed!");
		return this.stock;
	}
}
