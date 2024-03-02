package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testPath6 {
	// path 1->3->6->11->15
		@Test
		public void test1_forPath6() {
			double cart = 6000.00;
			int creditRating = 550;
			statusClass.Status status = statusClass.Status.SILVER;
			
			checkout.checkOut(cart, creditRating, status);
		}

}
