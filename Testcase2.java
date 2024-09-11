package testngpackage1;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Testcase2 extends  LaunchAndQuit {
@Test
public void launch_clickFirstproduct() throws IOException, InterruptedException
{
	WebElement E1=driver.findElement(By.id("twotabsearchtextbox"));
	E1.sendKeys("watch"+Keys.ENTER);
	WebElement E2=driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
	E2.click();
	Thread.sleep(2000);
   
}
}
