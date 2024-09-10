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

public class ScreenShot_unique {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("laptop");
	     Thread.sleep(2000); 
		List<WebElement>li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=li.size();
		li.get(count-9).click();
	     TakesScreenshot T1= driver; //upcasting
		File source=T1.getScreenshotAs(OutputType.FILE);
	   File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\LaptopScreenshot"+Math.random()+".png");//unique screen shot
		//it doesnt replace the previous one with new one when you run each time i.e it gives the unique one
	     FileHandler.copy(source, Destination); 
		
	}

}
