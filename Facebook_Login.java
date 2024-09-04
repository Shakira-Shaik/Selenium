package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.facebook.com");
	   WebElement first_name= driver.findElement(By.name("fname")); 
	    first_name.sendKeys("Shakira");//performing action
	   WebElement last_name= driver.findElement(By.name("lname"));
	   last_name.sendKeys("Shaik");
	   WebElement Login= driver.findElement(By.name("login"));  
	   Login.click();
	   
	}

}
