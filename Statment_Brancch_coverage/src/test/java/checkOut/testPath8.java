package checkOut;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPath8 {
	// path 1->3->7->13->16->22
				@Test
				public void test1_forPath8() {
					double cart = 2000.00;
					int creditRating = 950;
					statusClass.Status status = statusClass.Status.BRONZE;
					
					checkout.checkOut(cart, creditRating, status);
				}
	

}
