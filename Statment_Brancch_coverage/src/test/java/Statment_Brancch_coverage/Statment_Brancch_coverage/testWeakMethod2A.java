package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class testWeakMethod2A {

@Test(expected=java.lang.ArithmeticException.class) 
public void test1B() {
	int a=7;
	int b=-1;

	WeakClass.WeakMethod2(a, b);
	
}
}


