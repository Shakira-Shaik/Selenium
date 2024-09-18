package testngpackage1;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class Data_Driven_IntType 
{
@Test(dataProvider="inputs")
	public void method(int input)
	{
		System.out.println(input);
	}
	@DataProvider(name="inputs")
	public Object[][] data1()  
	{
		return new Object[][] {{14},{25},{35},{24},{12}};
	}
	
}


