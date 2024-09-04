package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		    WebElement E1=driver.findElement(By.name("q"));
		    E1.sendKeys("bangalore");
		    Thread.sleep(2000);
	List<WebElement>li =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=li.size();
	li.get(count-9).click();
	}

}
