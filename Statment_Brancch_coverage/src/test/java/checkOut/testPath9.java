package checkOut;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPath9 {
	// path 1->3->7->13->20
	
	@Test
	public void test1_forPath9() {
		double cart = 2000.00;
		int creditRating = 700;
		statusClass.Status status = statusClass.Status.BRONZE;
		
		checkout.checkOut(cart, creditRating, status);
	}

}
