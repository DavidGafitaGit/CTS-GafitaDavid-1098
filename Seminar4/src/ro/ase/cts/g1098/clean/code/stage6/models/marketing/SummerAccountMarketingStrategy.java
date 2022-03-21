package ro.ase.cts.g1098.clean.code.stage6.models.marketing;

import ro.ase.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;

public class SummerAccountMarketingStrategy implements MarketingStrategyInterface {
	
	@Override
	public float getAccountDiscount(int accountInYears) {
		return 02.f;
	}
		
}
