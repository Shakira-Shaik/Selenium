package testngpackage1;

import org.testng.annotations.Test;

public class Grouping
{
@Test(groups= {"smoke"})
public void Testcase1()
{
	 
}
@Test(groups={"smoke","system"})
public void Testcase2()
{
	
}
@Test(groups={"system"}
)
public void Testcase3()
{
	
}
@Test(groups= {"system"})
public void Testcase4()
{
	
}
@Test(groups= {"regression"})
public void Testcase5()
{
	
}
@Test(groups= {"regression"})
public void Testcase6()
{
	
}
}
//generate xml file by right click on class and add groups,run and also include scenerios inside run
// you can also exclude