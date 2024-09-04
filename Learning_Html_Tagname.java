package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Html_Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("file:///H:/Users/shaki/Downloads/learningHTML1.html");
		    WebElement E1=driver.findElement(By.tagName("a"));
		    E1.click();
	}

}
