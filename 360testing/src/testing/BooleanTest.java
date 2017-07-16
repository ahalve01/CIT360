package testing;

import junit.framework.TestCase;

public class BooleanTest extends TestCase {

	public void test(){
		JunitTesting test = new JunitTesting();
		boolean output = test.equals("false");
		assertFalse("false", output); // to get true you must use assertTrue and switch falses to true
	}
}
