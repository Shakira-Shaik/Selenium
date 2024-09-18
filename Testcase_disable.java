package testngPackage;

import org.testng.annotations.Test;

public class Testcase_disable {
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	 @Test(enabled=false) //to disabled the testcase  
	public void testcase2()
	{
		System.out.println("Testcase2");
	}
} 
