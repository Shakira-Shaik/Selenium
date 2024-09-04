package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		
	}

}
