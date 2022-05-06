package gafita.david.g1098.Builder;

import java.util.ArrayList;
import java.util.List;

public class StockModel {
	private String symbol;
	private String name;
	private String description;
	private StockRisk risk;
	private List<Float> closingPrices = new ArrayList<>();
	
	private StockModel() { }

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public StockRisk getRisk() {
		return risk;
	}

	public List<Float> getClosingPrices() {
		return closingPrices;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRisk(StockRisk risk) {
		this.risk = risk;
	}

	public void setClosingPrices(List<Float> closingPrices) {
		this.closingPrices.clear();
		for(float item : closingPrices) {
			this.closingPrices.add(item);
		}
	}

	@Override
	public String toString() {
		return "StockModel ["
				+ "symbol=" + symbol 
				+ ", name=" + name 
				+ ", description=" + description 
				+ ", risk=" + risk
				+ ", closingPrices=" + closingPrices + "]";
	}
	
	public static class StockBuilder {
		private StockModel stockModel;
		
		public StockBuilder(String symbol, String name, StockRisk risk) {
			this.stockModel = new StockModel();
			this.stockModel.setSymbol(symbol);
			this.stockModel.setName(name);
			this.stockModel.setRisk(risk);
		}
		
		public StockBuilder setClosingPrices(List<Float> closingPrices) {
			this.stockModel.setClosingPrices(closingPrices);
			return this;
		}
		
		public StockBuilder setDescription(String description) {
			this.stockModel.setDescription(description);
			return this;
		}
		
		public StockModel build() {
			return this.stockModel;
		}
		
	}
	
	
	
	
	
}
