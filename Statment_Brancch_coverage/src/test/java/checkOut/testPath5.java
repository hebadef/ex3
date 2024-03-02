package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPath5 {
	// path 1->3->6->11->14->21
	@Test
	public void test1_forPath5() {
		double cart = 3000.00;
		int creditRating = 850;
		statusClass.Status status = statusClass.Status.SILVER;
		
		checkout.checkOut(cart, creditRating, status);
	}

}
