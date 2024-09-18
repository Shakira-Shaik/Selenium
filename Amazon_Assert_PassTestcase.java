package testngpackage1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Amazon_Assert_PassTestcase  
{
@Test 
public void Testcase()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement E1=driver.findElement(By.id("twotabsearchtextbox")); 
	E1.sendKeys("watch"+Keys.ENTER);
	//xpath for all the watches
	List<WebElement> W1=  driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
   Assert.assertTrue(W1.size()>1);  //w1.size() gives no of watches
    //expected is true and actul(w1.size()>1) is also true.So test case pass
  // Assert.assertTrue(true); 
    
}
 
}
