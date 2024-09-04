package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Flipcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		WebElement E1=driver.findElement(By.xpath("(//span[.='Mobiles'])[2]"));
		//if there is no attribute and variable // tag name[.='Link text msg']
		 E1.click();
	}

}
