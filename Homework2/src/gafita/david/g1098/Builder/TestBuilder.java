package gafita.david.g1098.Builder;

import java.util.ArrayList;
import java.util.List;

public class TestBuilder {

	public static void main(String[] args) {
		List<Float> closingPrices = new ArrayList<>();
		closingPrices.add(23.5f);
		closingPrices.add(24.3f);
		closingPrices.add(22.1f);
		closingPrices.add(25.7f);
		closingPrices.add(26.9f);
		StockModel stockModel = new StockModel.StockBuilder("AAPL", "Apple", StockRisk.LOW)
				.setClosingPrices(closingPrices)
				.setDescription("A good stock for your first investment!")
				.build();
		
		System.out.println(stockModel.toString());
	}

}
