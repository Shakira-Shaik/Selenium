package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_Facebooklogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.facebook.com/");
	    WebElement E1=driver.findElement(By.xpath("(//input)[3]"));
	    E1.sendKeys("emailtoshakira@gmail.com");
	    WebElement E2=driver.findElement(By.xpath("(//input)[4]"));
	    E2.sendKeys("Abc@1015");
	    WebElement E3=driver.findElement(By.xpath("(//button)[1]"));
	    E3.click();
	    
	}
}
