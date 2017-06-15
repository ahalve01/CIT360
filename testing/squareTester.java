package testing;

import static org.junit.Assert.*;

public class squareTester {

		@Test
		public void test(){
			JunitTesting test = new JuniTesting();
			int output = test.square(5);
			assertEquals(25, output);
		}
}
