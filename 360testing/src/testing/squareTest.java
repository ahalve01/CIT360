package testing;

import junit.framework.TestCase;

public class squareTest extends TestCase {

	public void test(){
		JunitTesting test = new JunitTesting();
		int output = test.addition(0);
		assertEquals(0, output);
	}
}
