package testing;

import junit.framework.TestCase;

public class squareTest extends TestCase {

	public void test(){
		JunitTesting test = new JunitTesting();
		int output = test.addition(1);
		assertEquals(16, output);
	}
}
