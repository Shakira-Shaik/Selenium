package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.google.com");
    WebElement E1=driver.findElement(By.linkText("Gmail"));  
    Actions a1=new Actions(driver);
    a1.contextClick(E1).perform();
	}

}
