

package testngpackage1;  
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//we create a class to utilize the IRetryanalyzer and to retry the failed test case  
public class RetryFailTestcase_UtlizeIRetryAnalizer
{    WebDriver driver;
	@Test(retryAnalyzer=RetryFailTestcase_RetryLogic.class)  
	public void Amazon_search()
	{ 
	 driver =new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in");
    // purposefully failing the test case by chaging the xpath
    WebElement E1= driver.findElement(By.xpath("//ouput[@id='twotabsearchtextbox']"));
   // WebElement E1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    E1.sendKeys("mobile"+Keys.ENTER); 
	}
}
