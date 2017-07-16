package testing;

import junit.framework.TestCase;

public class NullChecker extends TestCase {

	public void test(){
		
		JunitTesting test = new JunitTesting();
		String output = test.youRock(".");
		assertNull(output); // to check not null you would do assertNotNull 
		
	}
}