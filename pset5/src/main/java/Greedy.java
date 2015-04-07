/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:05 AM
 */
public class Greedy {

	private static String numOfCoins = "";
    /**
	 * @param string
	 */
	public Greedy(String amount) {
		int coins = 0;
		CoinCalculator coinCalculator = new CoinCalculator();
        String change = amount.substring(1);
        while (Float.valueOf(change) != 0.00F) {
        	change = coinCalculator.calculateChange(change);
        	coins++;
        }
        setNumOfCoins("" + coins);
        
        
	}

	public static void main(String[] varArgs) {
    	Greedy cashier = null;
		if (varArgs.length > 0) {
        	cashier = new Greedy(varArgs[0]);
        }
        else {
        	throw new IllegalArgumentException("No value given");
        }
        
        System.out.printf("%s", cashier.getNumOfCoins());
    }

	/**
	 * @return the numOfCoins
	 */
	String getNumOfCoins() {
		return numOfCoins;
	}

	/**
	 * @param numOfCoins the numOfCoins to set
	 */
	private static void setNumOfCoins(String coins) {
		Greedy.numOfCoins = coins;
	}

}
