import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:28 AM
 */
public class CoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();

        String coinMessage = coinCalculatorUS.calculateChange("0.00");

        assertEquals("0.00", coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {
        CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();

        String coinMessage = coinCalculatorUS.calculateChange("0.01");

        assertEquals("0.00", coinMessage);
    }

    @Test
    public void tenCentsShouldGiveYouOneDime() {
        CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();

        String coinMessage = coinCalculatorUS.calculateChange("0.10");

        assertEquals("0.00", coinMessage);
    }
    
    @Test
    public void oneHundredCentsShouldGiveYouOneDollar() {
    	CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();
    	
    	String coinMessage = coinCalculatorUS.calculateChange("1.00");
    	
    	assertEquals("0.00", coinMessage);
    }
    
    @Test
    public void fiveCentsShouldGiveYouOneNickel() {
    	CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();
    	
    	String coinMessage = coinCalculatorUS.calculateChange("0.05");
    	
    	assertEquals("0.00", coinMessage);
    }
    
    @Test
    public void twentyFiveCentsShouldGiveYouOneQuarter() {
    	CoinCalculatorUS coinCalculatorUS = new CoinCalculatorUS();
    	
    	String coinMessage = coinCalculatorUS.calculateChange("0.25");
    	
    	assertEquals("0.00", coinMessage);
    }

}
