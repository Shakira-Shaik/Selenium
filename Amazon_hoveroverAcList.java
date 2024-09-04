package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hoveroverAcList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	    Actions a1=new Actions(driver);
	   a1.moveToElement(E1).perform();
	   WebElement E2=driver.findElement(By.xpath("//span[.='Sign in']"));//xpath using text msg
	   E2.click();
	}

}
