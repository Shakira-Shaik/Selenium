package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver =new ChromeDriver();
    driver.get("https://www.google.com");
    Thread.sleep(5000);
   // driver.close();
    System.out.println(driver.getWindowHandle()); // browser id of the parent
  //  System.out.println(driver.getWindowHandles()); //it will give the browser id of both parent and child
	}

}

