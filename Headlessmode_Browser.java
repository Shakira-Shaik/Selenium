package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Headlessmode_Browser
{  WebDriver driver;
   @Test(dataProvider="inputs")
	public void method1(String input)
	{
		  ChromeOptions options=new  ChromeOptions ();
		 options.addArguments("--headless");
	//if its Edge browser then EdgeOptions and if it is Firefox then FirefoxOptions	 
		 driver =new ChromeDriver(options); 
	    driver.get("https://www.google.com");
		//    driver.manage().window().maximize();
		 WebElement E1=driver.findElement(By.tagName("textarea"));
		    E1.sendKeys(input+ Keys.ENTER);
	}
	@DataProvider(name="inputs")
	public Object[][] data1()
	{
		
		return new Object[][] {{"Bangalore"},{"Delhi"}};
		
	}


}
