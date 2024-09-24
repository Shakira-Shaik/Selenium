package testngpackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutParameter
{ 
@Test(timeOut=4000) 
public void Testcase()
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement E1=driver.findElement(By.id("twotabsearchtextbox")); 
		E1.sendKeys("watch"+Keys.ENTER); 

}
}