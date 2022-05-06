package gafita.david.g1098.Prototype;

public class StockSurvey implements Cloneable {
	
	private Stock stock;
	private StockPeriod period;
	private String report;
	private int time;
	
	public StockSurvey(Stock stock, int time, StockPeriod period) {
		System.out.println("Generating report for " + stock.getSymbol() + " [" + time + period.toString() + "]");
		this.period = period;
		this.time = time;
		this.stock = stock;
		this.report = "Report generated from Database for " + stock.getName();
	}
	
	private StockSurvey() {}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Creating clone of " + this.stock.getSymbol());
		StockSurvey copy = new StockSurvey();
		copy.report = this.report;
		return copy;
	}
	
	
}
