package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
    WebElement E1=driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
	                                                //[AN='AV']
    E1.sendKeys("groceries"+Keys.ENTER);
	}

}
