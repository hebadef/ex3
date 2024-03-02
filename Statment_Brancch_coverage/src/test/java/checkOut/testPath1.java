package checkOut;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPath1 {
	// path 1->2->3 
	@Test
	public void test1() {
		double cart = 3400.00;
		int creditRating = 100;
		statusClass.Status status = statusClass.Status.GOLD;
		
		checkout.checkOut(cart, creditRating, status);
	}
	

}
