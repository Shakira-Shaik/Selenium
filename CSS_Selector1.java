package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		 //   WebElement E1=driver.findElement(By.cssSelector(".gLFyf"));
		                                              //.classname
		    WebElement E1=driver.findElement(By.cssSelector("textarea.gLFyf"));
		                                                 //TN.Classname
		    E1.sendKeys("India"+ Keys.ENTER);
	}

}
