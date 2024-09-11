package testngPackage;
import org.testng.annotations.Test;
public class InvocationCount {
@Test(invocationCount=10)  // it runs the test case 10 times
public void testcase1()
{
	System.out.println("Testcase1");
}
 @Test(invocationCount=4)   // it run the test case 4 times
public void testcase2()
{
	System.out.println("Testcase2");
}
}
 