package seleniumpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_classname {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("book");
	     Thread.sleep(2000); 
		List<WebElement>li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=li.size();
		li.get(count-9).click();
	     TakesScreenshot T1= driver; //upcasting
		File source=T1.getScreenshotAs(OutputType.FILE);
   File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\Amazonscreenshot"+new ScreenShot_Amazon().getClass()+".png");
		//it gives the screen shot with class name 
		FileHandler.copy(source, Destination); 
		
	}

}
