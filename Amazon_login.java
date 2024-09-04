package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	   WebElement un= driver.findElement(By.name("email"));//the return type of find element is WebElement
	   //utilizing the value and store it in the reference variable un
	   un.sendKeys("emailtoshakira@gmail.com");//performing action
	   WebElement Cnt_button= driver.findElement(By.id("continue")); //cnt means continue
	   Cnt_button.click();
	   WebElement Password= driver.findElement(By.name("password"));
	   Password.sendKeys("Abc@12345");
	   WebElement Sign_in= driver.findElement(By.id("signInSubmit"));  
	   Sign_in.click();
	   
	}

}
