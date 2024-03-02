package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Statment_Brancch_coverage.Statment_Brancch_coverage.WeakClass;


public class testPath1 {
	// path 1->2->4->17 
	@Test
	public void test1_forPath1() {
		double cart = 3400.00;
		int creditRating = 100;
		statusClass.Status status = statusClass.Status.GOLD;
		
		checkout.checkOut(cart, creditRating, status);
	}


}
