import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Matthew
 *
 */
public class GreedyTest {

	@Test
	public void threeTwentyShouldGiveFive() {
		Greedy greedy = new Greedy("$3.20");
		
		assertEquals("5", greedy.getNumOfCoins());
	}
	
	@Test
	public void fourEightySevenShouldGiveTen() {
		Greedy greedy = new Greedy("$4.87");
		
		assertEquals("10", greedy.getNumOfCoins());
	}
	
	@Test
	public void fifteenThirtyNineShouldTwentyOne() {
		Greedy greedy = new Greedy("$15.39");
		
		assertEquals("21", greedy.getNumOfCoins());
	}
	
	@Test
	public void tenEighteenEUShouldGetNine() {
		Greedy greedy = new Greedy("€10.18");
		
		assertEquals("9", greedy.getNumOfCoins());
	}

}
