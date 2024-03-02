package Statment_Brancch_coverage.Statment_Brancch_coverage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class testWeakMethod2B {

	@Test
	public void test1() {
		int a=6;
		int b=2;	
		WeakClass.WeakMethod2(a, b);
		
	}
	@Test
	public void test2() {
		int a=2;
		int b=2;	
		WeakClass.WeakMethod2(a, b);
		
	}
	@Test
	public void test3() {
		int a=5;
		int b=7;	
		WeakClass.WeakMethod2(a, b);
		
	}
	@Test
	public void test4() {
		int a=0;
		int b=10;	
		WeakClass.WeakMethod2(a, b);
		
	}
}


