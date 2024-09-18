package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionChecking_Title 
{
@Test
public void Title()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//Assertion checking with tile
	Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	//Assertion checking with tile if it fails
//	Assert.assertEquals(driver.getTitle()," Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry");
	                   // actual,expected,String message if fails
	//2nd way assertion checking for search text field 
	WebElement E1=driver.findElement(By.id("twotabsearchtextbox"));
     Assert.assertTrue(E1.isDisplayed());
	WebElement E2=driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertTrue(E2.isDisplayed()&&E2.isEnabled());
	
	
}
}
