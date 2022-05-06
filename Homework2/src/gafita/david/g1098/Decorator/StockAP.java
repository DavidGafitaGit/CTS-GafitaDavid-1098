package gafita.david.g1098.Decorator;

public class StockAP extends AbstractStock {

	public StockAP(String symbol, String name, float price) {
		super(symbol, name, price);
	}

	@Override
	public void increse(float value) {
		System.out.println(this.symbol + ": +" + value + "$");
		this.price += value;
		System.out.println(this.name + " is now: " + this.price + "$");
	}

	@Override
	public void decrease(float value) {
		System.out.println(this.symbol + ": -" + value + "$");
		this.price -= value;
		System.out.println(this.name + " is now: " + this.price + "$");
	}

}
