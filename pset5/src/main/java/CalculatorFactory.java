public class CalculatorFactory {
	
	private CalculatorFactory() {}
	
	private static CalculatorFactory cf;
	
	public static CalculatorFactory getInstance() {
		if (cf == null) {
			cf = new CalculatorFactory();
		}
		return cf;
	}
	
	
	public static CoinCalculator CoinCalculatorSelect (String option) {
		
		CoinCalculator coinCalculator = null;
		
		if (option.equals("$")) {
			coinCalculator = new CoinCalculatorUS();
		}
		else if (option.equals("€")) {
			coinCalculator = new CoinCalculatorEU();
		}
		return coinCalculator;
	}

}
