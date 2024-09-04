package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchICICI_PartialLinktext_RightclickDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	    WebElement E=driver.findElement(By.partialLinkText("LOGIN"));
	    E.click();  
	}

}
