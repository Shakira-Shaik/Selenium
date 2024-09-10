package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.facebook.com");
	    WebElement E1=driver.findElement(By.cssSelector("input[id='email']"));
	                                               //TN[AN='AV']
	    E1.sendKeys("Shakira.shaik@gmail.com");
	    WebElement E2=driver.findElement(By.cssSelector("input.inputtext[id='pass']"));
	                                              //TN.CN[AN='AV']
	     E2.sendKeys("Shakira@1013"); 
	    
	}

}
