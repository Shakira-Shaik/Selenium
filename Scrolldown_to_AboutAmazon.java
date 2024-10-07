package testngpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown_to_AboutAmazon {
	WebDriver driver;
	@Test 
	public void AboutAmazon() throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement E1=driver.findElement(By.linkText("About Amazon"));
		Point p1=E1.getLocation();
		int X=p1.getX();
		int Y=p1.getY();
		System.out.println(X);
		System.out.println(Y); 
		JavascriptExecutor js1=(JavascriptExecutor) driver; 
		js1.executeScript("window.scrollBy(0,"+Y+")"); 
		
		//if you go down posive y value and if you go up nagative y value
		//right side +ve X value ,leftside -ve X value
		
}
}