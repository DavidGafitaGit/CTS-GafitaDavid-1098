package gafita.david.g1098.Decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		AbstractStock Palantir = new StockAP("PLTR", "Palantir", 200f);
		Palantir.increse(20f);	// => value: 220.0$
		Palantir.decrease(10f);	// => value: 210.0$
		
		AbstractStock Microsoft = new StockAP("MSFT", "Microsoft", 1600f);
		Microsoft.increse(400f);	// => value: 2000.0$
		Microsoft.decrease(300f);	// => value: 1700.0$
		
		Microsoft = new PriceDecorator(Microsoft);
		Microsoft.increse(400f);	// => value: 2100.0$ > 1900.0$
		
		if(Microsoft instanceof PriceDecorator) {
			Microsoft = ((PriceDecorator) Microsoft).removeDecorator();
		}
		
		Microsoft.increse(400f);
	}

}
