package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe"+ Keys.ENTER); 
	  //utilizing the value directly without storing it in reference variable
	  //  you can also write it one line
	 //   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//you can get the entire keyboard using keys
	}

}
