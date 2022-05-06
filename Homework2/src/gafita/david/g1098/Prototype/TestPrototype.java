package gafita.david.g1098.Prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Stock stock = new Stock("TSLA", "Tesla");
		StockSurvey surveyMonth = new StockSurvey(stock, 3, StockPeriod.MONTH);
		StockSurvey surveyYear = new StockSurvey(stock, 3, StockPeriod.YEAR);
		StockSurvey surveyToday = (StockSurvey) surveyMonth.clone();
		StockSurvey surveyYesterday = (StockSurvey) surveyMonth.clone();
		

	}

}
