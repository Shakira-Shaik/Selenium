package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://grotechminds.com/registeration-form/");
	    WebElement First_Name= driver.findElement(By.name("firstName"));
	    First_Name.sendKeys("Shakira");
		   WebElement LastName= driver.findElement(By.name("lastName"));
		   LastName.sendKeys("Shaik");
		   WebElement Email= driver.findElement(By.name("email"));
		   Email.sendKeys("emailtoshakira@gmail.com");
		   WebElement Pnumber= driver.findElement(By.name("phone"));
		   Pnumber.sendKeys("9949265700");
		   WebElement E1= driver.findElement(By.id("gender"));
		     Select s1=new Select(E1);
		     s1.selectByIndex(1);
		     WebElement E2= driver.findElement(By.id("state"));
		     Select s2=new Select(E2);
		     s2.selectByIndex(10);
		    WebElement Aadhar= driver.findElement(By.name("aadhaar"));
		    Aadhar.sendKeys("124578963129");
		    WebElement pan= driver.findElement(By.name("pan"));
		    pan.sendKeys("ABCDE2396S");
		    WebElement C1= driver.findElement(By.id("terms"));
		    if(C1.isSelected())
		    {
		    	System.out.println("checkbox is selected");
		    
		    }
		    else
		    {
		    	System.out.println("checkbox is not selected,So lets select it");
		    	C1.click();
		    }
		    WebElement Register= driver.findElement(By.name("Submit"));
			   Register.click(); 
	}
}
