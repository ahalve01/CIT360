package testing;

import junit.framework.TestCase;

public class countATest extends TestCase {
	
	public void test(){
		JunitTesting test = new JunitTesting();
		int output = test.countA("Bobby");
		assertEquals(3, output);
	}
	
}
