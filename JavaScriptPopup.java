package testngpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptPopup 
{
@Test
public void PopUp()
{
	 ChromeDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	    driver.get("file:///H:/Users/shaki/Downloads/learningHTML1.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.switchTo().alert().accept();
	  /*  String a=driver.switchTo().alert().getText();
	    System.out.println(a);
	    driver.switchTo().alert().dismiss();*/
	    WebElement E1=driver.findElement(By.xpath("//input[@name='username']")); 
	    E1.sendKeys("Shakira"); 
}


}
