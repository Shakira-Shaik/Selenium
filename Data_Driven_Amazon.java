package testngpackage1;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Data_Driven_Amazon 
{
@Test(dataProvider="inputs")
public void method(String input)
{
	WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in");
	  WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys(input+Keys.ENTER); 
	 }
@DataProvider(name="inputs")
public Object[][] data1() 
{
	return new Object[][] {{"book"},{"watch"},{"bag"},{"Shirt"},{"laptop"},{"ball"}};
}
}


