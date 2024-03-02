package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPath2 {
	// path 1->2->5->8->18
		@Test
		public void test1_forPath2() {
			double cart = 3600.00;
			int creditRating = 670;
			statusClass.Status status = statusClass.Status.GOLD;
			
			checkout.checkOut(cart, creditRating, status);
		}

}
