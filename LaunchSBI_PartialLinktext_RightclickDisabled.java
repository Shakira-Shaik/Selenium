package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchSBI_PartialLinktext_RightclickDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	    WebElement E=driver.findElement(By.partialLinkText("LOGIN"));
	    E.click();  
	    WebElement User_Name= driver.findElement(By.name("userName"));
	    User_Name.sendKeys("Shakira");
	    WebElement Password= driver.findElement(By.name("password"));
	    Password.sendKeys("Abc@10123");
	    WebElement Captca= driver.findElement(By.name("loginCaptchaValue"));
	    Captca.sendKeys("Sn10HI"); 
	}
}
