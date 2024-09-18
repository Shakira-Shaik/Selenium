package testngpackage1;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven_Google { 
@Test(dataProvider="inputs")
public void method1(String input)
{
	 ChromeDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	 WebElement E1=driver.findElement(By.tagName("textarea"));
	    E1.sendKeys(input+ Keys.ENTER);
}
@DataProvider(name="inputs")
public Object[][] data1()
{
	
	return new Object[][] {{"How to become president"},{"How to wake up at 4am"},{"Bangalore"},{"Delhi"},{"How to be humble"}};
	
}



}
