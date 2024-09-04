package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver(); //launch the empty browser
		driver.manage().window().maximize();//to maximize the browser
		// driver.get("https://www.google.com");
		 driver.navigate().to("https://www.google.com");//other way to launch url
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh(); 
	}

}
