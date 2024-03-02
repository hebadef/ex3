package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPath4 {
	// path 1->3->6->10->19
				@Test
				public void test1_forPath4() {
					double cart = 2000.00;
					int creditRating = 600;
					statusClass.Status status = statusClass.Status.SILVER;
					
					checkout.checkOut(cart, creditRating, status);
				}

}
