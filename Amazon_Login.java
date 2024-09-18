package testngPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 
public class Amazon_Login {

	@Test
	public void login_to_Amazon()
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    WebElement E1= driver.findElement(By.name("email"));
	    E1.sendKeys("emailtoshakira@gmail.com");
	    WebElement E2= driver.findElement(By.id("continue")); 
	    E2.click();
	    WebElement E3= driver.findElement(By.name("password"));
	    E3.sendKeys("Abc@1013");
	    WebElement Sign_in= driver.findElement(By.id("signInSubmit"));  
	    Sign_in.click();	 
}
}

