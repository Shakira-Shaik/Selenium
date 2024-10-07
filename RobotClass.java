package testngpackage1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass 
{
@Test
public void google() throws InterruptedException, AWTException
{
	 ChromeDriver driver =new ChromeDriver(); 
	 driver.manage().window().maximize();
	    driver.get("https://www.google.com");
WebElement E1=driver.findElement(By.linkText("Gmail"));  
Actions a1=new Actions(driver); 
a1.contextClick(E1).perform(); //right click on gmail
Robot r1=new Robot();  //Using robot class we can select the options after right click
r1.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r1.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r1.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r1.keyPress(KeyEvent.VK_ENTER);
}
}
