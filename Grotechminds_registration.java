package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://grotechminds.com/registration/");
	    WebElement First_Name= driver.findElement(By.name("fname"));
	    First_Name.sendKeys("Shakira");
		   WebElement LastName= driver.findElement(By.name("lname"));
		   LastName.sendKeys("Shaik");
	    WebElement Email= driver.findElement(By.name("email"));
		   Email.sendKeys("emailtoshakira@gmail.com");
		   WebElement Password= driver.findElement(By.name("password"));
		   Password.sendKeys("Abc@12345");
		   WebElement gender= driver.findElement(By.id("Female"));
		   gender.click();
		   WebElement E1= driver.findElement(By.id("Skills"));
		   Select S1=new Select(E1);
		     S1.selectByIndex(1);
		     WebElement E2= driver.findElement(By.id("Country"));
			   Select S2=new Select(E2);
			     S2.selectByVisibleText("India");
	  WebElement PresentAddress= driver.findElement(By.name("Present-Address"));
		   PresentAddress.sendKeys("borough drive,Toronto");
		   WebElement PermenentAddress= driver.findElement(By.name("Permanent-Address"));
		   PermenentAddress.sendKeys("Heritage street,Markham");
		   WebElement Pincode= driver.findElement(By.name("Pincode"));
		   Pincode.sendKeys("M1P0B6");
		   WebElement E3= driver.findElement(By.id("Relegion"));
		   Select S3=new Select(E3);
		     S3.selectByValue("Muslim");
		   WebElement Check= driver.findElement(By.id("relocate"));
		   Check.click();
		   WebElement Submit= driver.findElement(By.name("Submit"));
		   Submit.click();
		    
		  
	}

}
