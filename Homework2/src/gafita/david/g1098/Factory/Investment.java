package gafita.david.g1098.Factory;

public class Investment {
	
	private String symbol;
	private int investedAmount;
	
	public Investment(String symbol, int investedAmount) {
		super();
		this.symbol = symbol;
		this.investedAmount = investedAmount;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getInvestedAmount() {
		return investedAmount;
	}

	public void setInvestedAmount(int investedAmount) {
		this.investedAmount = investedAmount;
	}

	@Override
	public String toString() {
		return "Investment [symbol=" + symbol + ", investedAmount=" + investedAmount + "]";
	}
}
