package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPath3 {
	// path 1->2->5->9 
			@Test
			public void test1_forPath3() {
				double cart = 3800.00;
				int creditRating = 600;
				statusClass.Status status = statusClass.Status.GOLD;
				
				checkout.checkOut(cart, creditRating, status);
			}

}
