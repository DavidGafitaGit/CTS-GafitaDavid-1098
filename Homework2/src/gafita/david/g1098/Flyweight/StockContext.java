package gafita.david.g1098.Flyweight;

public class StockContext {
	private int limited = 100;
	
	public StockContext(int limited) {
		this.limited = limited;
	}
	
	public int getLimited() {
		return this.limited;
	}
}
