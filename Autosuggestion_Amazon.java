package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("watch");
	    Thread.sleep(5000);
		List<WebElement>li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=li.size();
		li.get(count-9).click();
	}

}
