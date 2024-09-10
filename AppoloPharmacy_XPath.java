package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppoloPharmacy_XPath
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.apollopharmacy.in/");
		  WebElement E1=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		  E1.click();
		  WebElement E2=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		  E2.sendKeys("protinex"+Keys.ENTER);
	}

}
