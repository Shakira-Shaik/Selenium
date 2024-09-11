package testngpackage1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod; 
public class LaunchAndQuit {
	ChromeDriver driver;
@BeforeMethod
public void launch()
{
	 driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
}
@AfterMethod
public void logout() throws InterruptedException, IOException 
{
	 TakesScreenshot T1= driver; //upcasting
		File source=T1.getScreenshotAs(OutputType.FILE);
	   File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\Screenshot"+Math.random()+".png");
	   FileHandler.copy(source, Destination); 
	Thread.sleep(3000);
	driver.quit(); //we use driver in this method because it declared as global
	
}
}
