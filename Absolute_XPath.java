package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("file:///H:/Users/shaki/Downloads/learningHTML1.html");
	    WebElement E1=driver.findElement(By.xpath("(/html/body/input)[1]")); //user name text field
	    E1.sendKeys("Shakira");
	     WebElement E2=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")); //radio button
          E2.click();
	     WebElement E3=driver.findElement(By.xpath("(/html/body/select)[1]")); //drop down
           E3.sendKeys("cristian");
	}
}
