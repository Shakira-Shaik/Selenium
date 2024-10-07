package testngpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptPopup_ExplicitWait 
{
	WebDriver driver;
@Test
public void GTM_JavaScript() 
{
	driver=new ChromeDriver();
	driver.get("https://grotechminds.com/javascript-popup/");
	driver.manage().window().maximize();
   WebElement E1= driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-1912e56 elementor-widget elementor-widget-shortcode']") );
   E1.click();
   WebDriverWait w3 = new WebDriverWait(driver,Duration.ofSeconds(10)); 
	 
	  w3.until(ExpectedConditions.alertIsPresent());
	  
	// boolean urlContains = w3.until(ExpectedConditions.urlContains("javascript-popup"));
	 //System.out.println(urlContains);
	 
 //	boolean urlMatches =  w3.until(ExpectedConditions.urlMatches("grotechminds"));
 //	System.out.println(b2);
	
	// Boolean isUrlCorrect = w3.until(ExpectedConditions.urlToBe("https://grotechminds.com/javascript-popup/"));
	// System.out.println(isUrlCorrect);
	 
	 String s1 = driver.switchTo().alert().getText();
	  System.out.println(s1);
	 driver.switchTo().alert().accept();
}
}
