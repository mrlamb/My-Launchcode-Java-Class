import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author Matthew
 *
 */
public class CoinCalculatorTestEU {
	
	@Test
	public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("0.00");

        assertEquals("0.00", coinMessage);
	}
	@Test
	public void tenCentsMeansYouGetOneCoin() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("0.10");

        assertEquals("0.00", coinMessage);
	}
	@Test
	public void twentyCentsMeansYouGetZeroCoins() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("0.20");

        assertEquals("0.00", coinMessage);
	}
	@Test
	public void fiftyCentsMeansYouGetZeroCoins() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("0.50");

        assertEquals("0.00", coinMessage);
	}
	@Test
	public void oneDollarMeansYouGetZeroCoins() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("1.00");

        assertEquals("0.00", coinMessage);
	}
	@Test
	public void twoDollarsMeansYouGetZeroCoins() {
        CoinCalculatorEU coinCalculatorEU = new CoinCalculatorEU();

        String coinMessage = coinCalculatorEU.calculateChange("2.00");

        assertEquals("0.00", coinMessage);
	}
}
