package checkOut;

import org.junit.runner.JUnitCore;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import checkOut.TestSuite;

public class junitTestRunner {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestSuite.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }


}
