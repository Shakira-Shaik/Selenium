package testngpackage1;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class TestCase1 extends LaunchAndQuit{
@Test
public void launch_Searching() throws IOException, InterruptedException 
{
	 WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("book"+Keys.ENTER);
	    Thread.sleep(1000);
	   

}
}
