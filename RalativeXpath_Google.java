package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RalativeXpath_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.google.com");
	//	WebElement E1=driver.findElement(By.xpath("(//textarea)[1]")); Relative Xpath
	 WebElement E1=driver.findElement(By.xpath("//textarea[@name='q']"));
	        E1.sendKeys("India");
	        Thread.sleep(3000);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        E1.sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(1000);
	        E1.sendKeys(Keys.ENTER);
	        
	        
	}

}
