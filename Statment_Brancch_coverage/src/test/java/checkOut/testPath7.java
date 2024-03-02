package checkOut;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testPath7 {
	// path 1->3->7->12->23
			@Test
			public void test1_forPath7() {
				double cart = 1000.00;
				int creditRating = 550;
				statusClass.Status status = statusClass.Status.BRONZE;
				
				checkout.checkOut(cart, creditRating, status);
			}

}
