package testngpackage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class MoveControltochild_Assertion 
{
@Test
public void Naukari() throws InterruptedException
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
    WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));
    e1.click();
    
    	Set<String>	 s1=driver.getWindowHandles();
    			System.out.println(s1); 
    			Thread.sleep(1000);
    			driver.close();
    		Iterator<String> ids=	s1.iterator();
    				String parentid= ids.next();
    				String childid=	ids.next();  
    				 System.out.println(parentid);
    				    System.out.println(childid);
    		driver.switchTo().window(childid); //switch to parent  to child
    	   WebElement E1=driver.findElement(By.name("identifier"));
    		Assert.assertTrue(E1.isDisplayed());
    		Thread.sleep(2000);
    		
            driver.close();	 //close the child window
    	
}


}
