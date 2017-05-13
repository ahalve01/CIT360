package testing;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(countATest.class);
		suite.addTestSuite(squareTest.class);
		//$JUnit-END$
		return suite;
	}

}
