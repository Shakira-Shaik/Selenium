package seleniumpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver =new FirefoxDriver();
		 driver.get("https://www.google.com");
		    Thread.sleep(5000);
		    driver.close();
	}

}
