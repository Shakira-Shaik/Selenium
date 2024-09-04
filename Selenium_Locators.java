package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("India"+ Keys.ENTER); //search text field ,for typing  use sendKeys
	  //   driver.findElement(By.name("btnK")).click(); //search button 
	    //OR
	   // driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//you can get the entire keyboard using keys
	}

}
