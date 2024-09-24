package testngpackage1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_tescase
{
@Test
public void login()
{
	Assert.assertEquals(0, 10); //fail  
}
@Test(dependsOnMethods="login")
public void logout() 
{
	
}
}
