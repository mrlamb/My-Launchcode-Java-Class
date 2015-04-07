import java.text.DecimalFormat;

/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:06 AM
 */
public class CoinCalculator {


    public String calculateChange(String amountOfChange) {
        Float change = Float.parseFloat(amountOfChange.substring(0));
        String returnedChange = "";
        DecimalFormat df = new DecimalFormat("0.00");
        if (change > 0.99) {
        	returnedChange = df.format(change -= 1.00F);
        	return "" + returnedChange;
        } else if (change > 0.24) {
        	returnedChange = df.format(change -= 0.25F);
        	return "" + returnedChange;
    	} else if(change > 0.09) {        
    		returnedChange = df.format(change -= 0.10F);
        	return "" + returnedChange;
        } else if (change > 0.04) {
        	returnedChange = df.format(change -= 0.05F);
        	return "" + returnedChange;
        } else if (change > 0) {
        	returnedChange = df.format(change -= 0.01F);
        	return "" + returnedChange;
        } else {
            return "0.00";
        }
    }
}
