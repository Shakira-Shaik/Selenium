package testngPackage;

import org.testng.annotations.Test;

public class Invocation_priority {
	@Test(invocationCount=4,priority=2)
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	 @Test    // you do not mention the priority for this test so it takes 0 by default
	public void testcase2()
	{
		System.out.println("Testcase2");
	}
	 @Test(priority=1)
		public void testcase3()
		{
			System.out.println("Testcase3");
		}
}
