package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	

	/*public static int WeakMethod1(int a, int b) {
		int c;
		if ((b<= a) || ((b==0)))
			c=a/b;
		else 
			c=a+2;
		return c;	
	}
	

	
		public static int WeakMethod2 (int a, int b) {
			int c = 0;
			if ((b<= a) || ((b==0)))
				if (a>1)
					c=a/b;
			else 
				c=a+2;
			return c;
		}*/
		
	
	public static int WeakMethod3(int a, int b) {
		int c = 0;
		
		if(a+b>5) {
			c=a+b;
		}
		if (a<5) {
			c=a/b;}
		return c; 
	
	}
/*
	public static int WeakMethod4(int a, int b) {
		int c;
		if ((b == a) || (b<a))
			c=a/b;
		else 
			c=a+2;
		return c;
		
		
		
	}*/
	
}
