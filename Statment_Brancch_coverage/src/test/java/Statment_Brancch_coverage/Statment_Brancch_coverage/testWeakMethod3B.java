package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testWeakMethod3B {

	@Test
	public void TC1() {
		int b=2;
		int a=4;	
		int expectedResult=2;
		int result =WeakClass.WeakMethod3(a, b);
		assertEquals(result,expectedResult,0.001);
		
	}


	 @Test 
	 public void TC2() {
		int b=2;
		int a=6;	
		WeakClass.WeakMethod3(a, b);
		
	} 
	
	 @Test (expected=java.lang.ArithmeticException.class)
	 public void TC3() {
		int b=0;
		int a=4;	
		WeakClass.WeakMethod3(a, b);
		
	}

}

