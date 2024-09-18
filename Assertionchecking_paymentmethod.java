package testngpackage1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionchecking_paymentmethod
{
@Test
public void PaymentMethod()
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();//to maximize the browser
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
   WebElement E1= driver.findElement(By.name("email"));
   E1.sendKeys("shakira_Sk@gmail.com");
   WebElement E2= driver.findElement(By.id("continue")); 
   E2.click();
   WebElement E3= driver.findElement(By.name("password"));
   E3.sendKeys("Aws@1546");
   WebElement Sign_in= driver.findElement(By.id("signInSubmit"));  
   Sign_in.click();	 
   WebElement E4=driver.findElement(By.id("twotabsearchtextbox"));
   E4.sendKeys("watch"+Keys.ENTER);
   WebElement E5=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
   E5.click();   
   Set <String> S1=driver.getWindowHandles();//id of each browser window
   System.out.println(S1);
   Iterator<String> i1 = S1.iterator();  
   String Parent_id= i1.next();
   String Child_id= i1.next();
   System.out.println(Parent_id);
   System.out.println(Child_id);
   driver.switchTo().window(Child_id);//move the control from parent to child window
   WebElement E6=	driver.findElement(By.id("add-to-cart-button"));
   E6.click();   
   //driver.close(); // close the window which has the contol  
//   WebElement E7= driver.findElement(By.linkText(" Add to Wish List "));
//   E7.click();
   WebElement E7=	driver.findElement(By.name("proceedToRetailCheckout"));
   Assert.assertTrue(E7.isDisplayed()); 
}
}
