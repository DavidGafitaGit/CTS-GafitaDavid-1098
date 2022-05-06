package gafita.david.g1098.Decorator;

public class PriceDecorator extends StockDecorator {

	public static final float MAX_PRICE_VALUE = 1900f;
	public static final float MIN_PRICE_VALUE = 2f;
	
	public PriceDecorator(AbstractStock stock) {
		super(stock);
	}

	@Override
	public void increse(float value) {
		if(this.stock.getPrice() + value >= MAX_PRICE_VALUE) {
			System.out.println(this.stock.getSymbol() + " is closing! [Max limit reached: " + MAX_PRICE_VALUE + "]");
		}
		else {
			this.stock.increse(value);
		}
	}

	@Override
	public void decrease(float value) {
		if(this.stock.getPrice() - value <= MIN_PRICE_VALUE) {
			System.out.println(this.stock.getSymbol() + " is closing! [Min limit reached: " + MIN_PRICE_VALUE + "]");
		}
		else {
			this.stock.decrease(value);
		}
	}

	
}
