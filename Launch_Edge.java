package seleniumpackage;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver =new EdgeDriver();
		 driver.get("https://www.google.com");
		    Thread.sleep(5000);
		    driver.close();
	}

}
