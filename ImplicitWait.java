package testngpackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait
{
@Test
public void Login()
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();//to maximize the browser
    driver.get("https://www.facebook.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   WebElement E1= driver.findElement(By.xpath("//input[@name='email']")); 
    E1.sendKeys("emailtoshakira@gmail.com");//performing action
   WebElement E2= driver.findElement(By.xpath("//input[@name='pass']")); 
   E2.sendKeys("Fb!00289");
   WebElement E3= driver.findElement(By.xpath("//button[@name='login']"));   
   E3.click();
   
}
}
