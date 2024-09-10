package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTMFlightApp_Hoverover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://grotechminds.com/automate-me/");
   WebElement E1=driver.findElement(By.xpath("(//h3[@class='elementor-flip-box__layer__title'])[3]"));
	    Actions a1=new Actions(driver);
	    a1.moveToElement(E1).perform();
  WebElement E2=driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[2]"));
	 E2.click();  
	}

}
