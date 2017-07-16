package testing;

import junit.framework.*;

public class ArrayTest2 {
	
	public void test(){
	JunitTesting test = new JunitTesting();
	String[] output = {"Bobby", "Brawn", "Bibby", "Billy"};
	String[] received = test.arrayTest();
	assertArrayEquals(output, received);
	
}

	private void assertArrayEquals(String[] output, String[] received) {
		// TODO Auto-generated method stub
		
	}
}
