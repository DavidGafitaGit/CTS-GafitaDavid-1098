package gafita.david.g1098.Composite;

public class TestComposite {

	public static void main(String[] args) {

		StockStructure group = new StockStructure();
		StockStructure volatiles = new StockStructure();
		
		volatiles.addChildNode(new Stock("PLTR", "Palantir"));
		volatiles.addChildNode(new Stock("MSFT", "Microsoft"));
		
		group.addChildNode(new Stock("AAPL", "Apple"));
		group.addChildNode(volatiles);
		
		System.out.println(group.getInfo());
	}

}
