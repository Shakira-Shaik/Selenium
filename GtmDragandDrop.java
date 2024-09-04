package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GtmDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://grotechminds.com/drag-and-drop/");
	    WebElement E1=driver.findElement(By.xpath("//div[@id='container-6']"));
	    WebElement E2=driver.findElement(By.xpath("//div[@id='div2']"));
	    Actions a1=new Actions(driver);
	    a1.dragAndDrop(E1, E2).perform();
	    Thread.sleep(2000);
	    WebElement E3=driver.findElement(By.xpath("//div[@id='div2']"));
	    WebElement E4=driver.findElement(By.xpath("//div[@id='container-6']"));
	    Actions a2=new Actions(driver);
	    a2.dragAndDrop(E3, E4).perform();
	}

}
